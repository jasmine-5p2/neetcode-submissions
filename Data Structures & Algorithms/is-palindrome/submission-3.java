class Solution {
    public boolean isPalindrome(String s) {
        String st = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        String sb = new StringBuilder(st).reverse().toString().toLowerCase();
        System.out.println(st);
         System.out.println(sb);
        
        return st.equals(sb);
        
    }
}
