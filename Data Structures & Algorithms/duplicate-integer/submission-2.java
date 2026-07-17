class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer>map = new HashSet<>();

        for(int a:nums){
            if(map.contains(a)){
                return true;
            }
            map.add(a);
        }
        return false;
        
    }
}