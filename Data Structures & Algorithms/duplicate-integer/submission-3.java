class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer>st = new HashSet<>();
        for(int a:nums){
            if(st.contains(a)){
                return true;
            }
            st.add(a);
        }
        return false;
        
    }
}