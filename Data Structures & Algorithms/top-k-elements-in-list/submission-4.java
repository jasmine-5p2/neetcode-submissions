class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>mp = new HashMap<>();
       
       
        for(int i=0;i<nums.length;i++){
             mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
            }

            
PriorityQueue<Map.Entry<Integer,Integer>>pq = new PriorityQueue<>((a,b)->b.getValue()-a.getValue());
pq.addAll(mp.entrySet());

          int arr[] = new int[k];
            for(int i=0;i<k;i++){
                arr[i] = pq.poll().getKey();
            }

            return arr;

        
    

        
        
        
    }
}
