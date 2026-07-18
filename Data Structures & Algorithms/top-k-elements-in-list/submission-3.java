class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>mp = new HashMap<>();
       
       
        for(int i=0;i<nums.length;i++){
             mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
            }

            List<Map.Entry<Integer,Integer>>list = new ArrayList<>(mp.entrySet());
            Collections.sort(list,(a,b)->b.getValue()-a.getValue());
          int arr[] = new int[k];
            for(int i=0;i<k;i++){
                arr[i] = list.get(i).getKey();
            }

            return arr;

        
    

        
        
        
    }
}
