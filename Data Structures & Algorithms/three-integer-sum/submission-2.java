class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        Arrays.sort(nums);
        Set<List<Integer>>set = new HashSet<>();
        for(int i=0;i<nums.length-2;i++){
            if(i>0 && nums[i]==nums[i-1])
        continue;
            int left = i+1;
        int right = nums.length-1;
            while(left<right){
                List<Integer>li = new ArrayList<>();
                if(nums[left]+nums[right]+nums[i]==0){
                    li.add(nums[left]);
                    li.add(nums[right]);
                    li.add(nums[i]);
                    set.add(li);
                    left++;
                    right--;

                }
                else if(nums[left]+nums[right]+nums[i]>0){
                    right--;
                }else{
                    left++;
                }
            }
        }
        List<List<Integer>>list = new ArrayList<>(set);

        return list;

        
    }
}
