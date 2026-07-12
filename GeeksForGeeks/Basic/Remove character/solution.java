class Solution {
    static String removeChars(String str1, String str2) {
        boolean[] present = new boolean[256];

        // Mark characters present in str2
        for (int i = 0; i < str2.length(); i++) {
            present[str2.charAt(i)] = true;
        }

        StringBuilder ans = new StringBuilder();

        // Build the result
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if (!present[ch]) {
                ans.append(ch);
            }
        }

        return ans.toString();
    }
}