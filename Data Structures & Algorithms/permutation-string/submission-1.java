class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int left=0;
        int right =0;
        int freq[] = new int[26];
       for(int i=0;i<s1.length();i++){
        freq[s1.charAt(i)-'a']++;
       }

        while(right<s2.length()){
            char ch = s2.charAt(right);
            freq[ch-'a']--;
            while(freq[ch-'a']<0){
                freq[s2.charAt(left)-'a']++;
                left++;
            }
            if(right-left+1==s1.length()){
                return true;
            }

            right++;

        }

        return false;
        
    }
}
