class Solution {
    public boolean isPalindrome(String s) {
        String st = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
         int left =0;
         int right = st.length()-1;

         char[] arr = st.toCharArray();

         while(left<right){
            char ch = arr[left];
            arr[left]= arr[right];
            arr[right]= ch;

            left++;
            right--;

         }
         String stt = new String(arr);
         
         return stt.equals(st);
        
    }
}
