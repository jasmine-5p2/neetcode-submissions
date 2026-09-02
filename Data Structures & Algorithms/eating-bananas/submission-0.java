class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=0;

        for(int i=0;i<piles.length;i++){
            high = Math.max(piles[i],high);
        }

        while(low<high){
            int mid = low+(high-low)/2;
            double hours=0;

            for(int pile:piles){
                hours = hours+Math.ceil((double)pile/mid);
            }

            if(hours<=h){
                high=mid;
            }else{
                low=mid+1;
            }

        }


        return low;




    }
}
