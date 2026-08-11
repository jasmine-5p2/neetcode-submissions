class Solution {
    public String minWindow(String s, String t) {
        int freq[] = new int[128];
       for(char ch:t.toCharArray()){
        freq[ch]++;
       }
       int left=0;
       int req=t.length();
       int minlen = Integer.MAX_VALUE;
       int start = 0;
       for(int right=0;right<s.length();right++){
        char ch = s.charAt(right);

        if(freq[ch]>0){
            req--;

        }
        freq[ch]--;

        while(req==0){
            char c = s.charAt(left);
            if(right-left+1<minlen){
                minlen=right-left+1;
                start=left;

            }

            freq[c]++;
            if(freq[c]>0){
                req++;
            }
            left++;


        }




       }

       return minlen==Integer.MAX_VALUE?"":s.substring(start,start+minlen);

        
    }
}
