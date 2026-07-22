class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ch = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(ch)) {
                ch = ch.substring(0, ch.length() - 1);
                if (ch.isEmpty()) return "";
            }
        }
        return ch;
    }
}
