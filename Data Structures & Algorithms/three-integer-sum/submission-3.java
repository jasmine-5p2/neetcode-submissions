class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        
        Set<List<Integer>>st = new HashSet<>();
        for(int i=0;i<nums.length-2;i++){
        int left=i+1;
        int right = nums.length-1;
            while(left<right){
            List<Integer>li = new ArrayList<>();
            int sum = nums[left]+nums[right]+nums[i];
            if(sum==0){
                li.add(nums[left]);
                li.add(nums[right]);
                li.add(nums[i]);
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
        
        List<List<Integer>>list = new ArrayList<>(st);

        return list;
        
    }
}
