class Solution {
    static String delAlternate(String s) {
        return helper(s, 0);
    }
    static String helper(String s, int index) {
        if (index == s.length()) return "";
        
        if (index % 2 == 0) {
            return s.charAt(index) + helper(s, index + 1);
        }
        return helper(s, index + 1);
    }
}