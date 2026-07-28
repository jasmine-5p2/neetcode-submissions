class Solution {
    public int maxProfit(int[] prices) {
        int buyprice = Integer.MAX_VALUE;
        int maxpro = 0;
         for(int i=0;i<prices.length;i++){
            if(buyprice < prices[i]){
                int profit = Math.abs(buyprice - prices[i]);
                maxpro = Math.max(maxpro,profit);
            }else{
                buyprice = prices[i];
            }

         }
         return maxpro;
        
    }
}
