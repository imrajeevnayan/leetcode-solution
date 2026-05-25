class Solution {
    boolean isPalindrome(String s) {
        return s.equals(new StringBuilder(s).reverse().toString());
        
    }
}