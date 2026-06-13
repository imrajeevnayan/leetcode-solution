class Solution {
    public String sortString(String s) {
        int[] freq = new int[26];
        for (char c : s.toCharArray())freq[c - 'a']++;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            while (freq[i] > 0) {
                sb.append((char)('a' + i));
                freq[i]--;
            }
        }
        return sb.toString();
    }
}