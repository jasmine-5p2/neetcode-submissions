class Solution {
    public boolean isPalindrome(String s) {
        String st = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        System.out.print(st);
        String rev = new StringBuilder(st).reverse().toString();

        return rev.equals(st);
        
    }
}
