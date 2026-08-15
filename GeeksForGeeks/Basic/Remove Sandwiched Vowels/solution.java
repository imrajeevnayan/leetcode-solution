class Solution {
    boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }

    public String sandwichedVowel(String s) {
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (i > 0 && i < s.length() - 1 &&
                isVowel(s.charAt(i)) &&
                !isVowel(s.charAt(i - 1)) &&
                !isVowel(s.charAt(i + 1))) {
                continue;
            }

            ans.append(s.charAt(i));
        }

        return ans.toString();
    }
}