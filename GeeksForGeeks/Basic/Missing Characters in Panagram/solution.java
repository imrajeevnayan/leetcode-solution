class Solution {
    public static String missingPanagram(String s) {

        boolean[] present = new boolean[26];

        // Mark existing characters
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                present[ch - 'a'] = true;
            }

            else if (ch >= 'A' && ch <= 'Z') {
                present[ch - 'A'] = true;
            }
        }

        StringBuilder ans = new StringBuilder();

        // Find missing characters
        for (int i = 0; i < 26; i++) {

            if (!present[i]) {
                ans.append((char)(i + 'a'));
            }
        }

        if (ans.length() == 0)
            return "-1";

        return ans.toString();
    }
}