class Solution {
    public int carFleet(int target, int[] position, int[] speed) {

        if(position.length<=1){
            return 1;
        }
        int arr[][] = new int[position.length][2];
        
        for(int i=0;i<position.length;i++){
            arr[i][0]=position[i];
            arr[i][1]=speed[i];
        }

        Arrays.sort(arr,(a,b)->Integer.compare(b[0],a[0]));
        
        double lasttime=0;
        int fleet=0;
        Stack<Double>stack = new Stack<>();

        for(int i=0;i<arr.length;i++){
           double time =
                (double) (target - arr[i][0]) / arr[i][1];

            // New fleet
            if (stack.isEmpty() || time > stack.peek()) {
                stack.push(time);
            }

        }

        return stack.size();
        
    }
}
