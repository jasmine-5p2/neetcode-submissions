class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>>st = new HashSet<>();

        for(int i=0;i<nums.length;i++){
           int left=i+1;
           int right = nums.length-1;
           while(left<right){
            List<Integer>li = new ArrayList<>();
            int sum = nums[i]+nums[left]+nums[right];
            if(sum==0){
                li.add(nums[i]);
                li.add(nums[left]);
                li.add(nums[right]);
                 st.add(li);
                 left++;
                 right--;

            }else if(sum>0){
                right--;
            }
            else{
                left++;
            }
           }

        }
        

        return new ArrayList<>(st);
    }
}
