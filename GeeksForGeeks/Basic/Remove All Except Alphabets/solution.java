class Solution {
    public String removeChars(String s) {
        StringBuilder ans = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if ((ch >= 'A' && ch <= 'Z') || 
                (ch >= 'a' && ch <= 'z')) {
                ans.append(ch);
            }
        }

        return ans.toString();
    }
}