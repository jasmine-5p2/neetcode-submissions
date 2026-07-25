class Solution {
    public int trap(int[] height) {
        //leftmax height
        int left[] = new int[height.length];
        left[0] = height[0];
        for(int i=1;i<height.length;i++){
            left[i]=Math.max(left[i-1],height[i]);
        }
        //right max;
        int right[] = new int[height.length];
        right[height.length-1] = height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
            right[i]=Math.max(right[i+1],height[i]);
        }
        int trapped = 0;

        //loop
        for(int i=0;i<height.length;i++){
            int waterlevel = Math.min(left[i],right[i])-height[i];
            trapped += waterlevel;
            
        }

        return trapped;

    }
}
