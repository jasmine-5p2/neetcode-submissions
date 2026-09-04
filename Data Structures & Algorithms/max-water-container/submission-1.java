class Solution {
    public int maxArea(int[] heights) {
        int left=0;
        int right=heights.length-1;
        int maxi = Integer.MIN_VALUE;

        while(left<right)
        {
            if(heights[left]<heights[right]){
                int width = right-left;
                int height = heights[left];
                int total = width*height;
                maxi = Math.max(total,maxi);
                left++;
            }else{
                int width = right-left;
                int height = heights[right];
                int total = width*height;
                maxi = Math.max(total,maxi);
                right--;

            }
        }


        return maxi;
        
    }
}
