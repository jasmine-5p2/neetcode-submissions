class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {


        
        int n=nums1.length;
        int m=nums2.length;
        int res[] = new int[n+m];

        int left=0;
        int right=0;
        int i=0;
        
        
        

        while(left<n && right<m){
            if(nums1[left]<=nums2[right]){
                res[i]=nums1[left];
                left++;
                i++;
            }
            else{
                res[i]=nums2[right];
                right++;
                i++;
            }
        }
         
         if(left<n){
        while(left<n){
            res[i]=nums1[left];
            i++;
            left++;
        }
         }
          
          if(right<m){
          while(right<m){
            res[i]=nums2[right];
            i++;
            right++;
        }
          }

          int len = res.length;
       
      
      
       return (len%2==0)?(double)(res[len/2]+res[len/2-1])/2:res[len/2];

        
    }
}
