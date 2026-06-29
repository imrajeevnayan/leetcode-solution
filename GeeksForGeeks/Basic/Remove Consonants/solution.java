class Solution {
    String remConsonants(String s) {
        String ans = s.replaceAll("(?i)[^aeiou]", "");
        return ans.length() == 0 ? "" : ans;
    }
}