class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int freq[] = new int[128];
        for(char ch:s1.toCharArray()){
            freq[ch]++;
        }

        int left=0;
        for(int right=0;right<s2.length();right++){
            char ch = s2.charAt(right);
            freq[ch]--;
            while(freq[ch]<0){
                char c = s2.charAt(left);
                freq[c]++;
                left++;
            }

            if(right-left+1==s1.length()){
                return true;
            }
        }

        return false;

    }
}
