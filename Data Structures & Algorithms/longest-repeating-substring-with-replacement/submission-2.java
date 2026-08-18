class Solution {
    public int characterReplacement(String s, int k) {
        int left=0;
        int freq[] = new int[128];
        int maxicha = 0;
        int count = 0;
        for(int right=0;right<s.length();right++){
            char c = s.charAt(right);
            freq[c]++;
            maxicha = Math.max(maxicha,freq[c]);
            while(right-left+1-maxicha>k){
                freq[s.charAt(left)]--;
                left++;
            }

          count = Math.max(count,right-left+1);

        }
        return count;
    }
}
