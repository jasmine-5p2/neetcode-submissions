class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

   
         Set<List<Integer>> st = new HashSet<>();
      
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                      List<Integer>li = new ArrayList<>();
                    if(nums[i]+nums[j]+nums[k]==0){
                        li.add(nums[i]);
                         li.add(nums[j]);
                          li.add(nums[k]);
                          Collections.sort(li);
                            st.add(li);
                    }
                  

                }
            }
        }
             List<List<Integer>> list = new ArrayList<>(st);
       
        

        return list;
        
        
    }
}
