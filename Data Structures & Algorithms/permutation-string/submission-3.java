class Solution {
    public boolean checkInclusion(String s1, String s2) {
      int freq[] = new int[128];
      int left=0;
     
     for(char ch:s1.toCharArray()){
        freq[ch]++;
     }


      for(int right=0;right<s2.length();right++){
              char c = s2.charAt(right);
              freq[c]--;
              while(freq[c]<0){
                freq[s2.charAt(left)]++;
                left++;
              }

              if(right-left+1==s1.length()){
                return true;
              }
      
      }
      return false;

        
    }
}
