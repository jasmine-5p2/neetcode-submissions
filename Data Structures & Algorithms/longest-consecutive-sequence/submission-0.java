class Solution {
    public int longestConsecutive(int[] nums) {
         if(nums.length==0){
            return 0;
         }

        Set<Integer>st = new TreeSet<>();
        for(int num:nums){
            st.add(num);
        }
        

        int max = 0;
        int count =1;
        List<Integer>li = new ArrayList<>(st);
        for(int i=1;i<li.size();i++){
            if(Math.abs(li.get(i)-li.get(i-1))==1){
                count++;

            }
         if(Math.abs(li.get(i)-li.get(i-1))!=1){
                max = Math.max(count,max);
                count =1;
               
            }
        }
        max = Math.max(max, count);

        return max;
    }
}
