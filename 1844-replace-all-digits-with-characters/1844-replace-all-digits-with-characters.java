class Solution {
    public String replaceDigits(String s) {
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                result += s.charAt(i);
            } else {
                int shift = s.charAt(i) - '0';
                char ch = (char)(s.charAt(i - 1) + shift);
                result += ch;
            }
        }
        return result;
    }
}
