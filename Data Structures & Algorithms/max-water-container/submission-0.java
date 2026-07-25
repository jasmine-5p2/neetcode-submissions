class Solution {
    public int maxArea(int[] heights) {
        int max= 0;
        int curr = 0;

        int left=0;
        int right = heights.length-1;

        while(left<right){
            int h = Math.min(heights[left],heights[right]);
            int w = right-left;
             curr = h*w;
            max = Math.max(curr,max);

            if(heights[left]<heights[right]){
                left++;
            }else{
                right--;
            }

        } 
        return max;
        
    }
}
