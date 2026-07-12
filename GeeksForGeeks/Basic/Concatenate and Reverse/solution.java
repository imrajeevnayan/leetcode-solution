class Solution {
    static String conRevstr(String s1, String s2) {
        String str = s1 + s2;
        return new StringBuilder(str).reverse().toString();
    }
}