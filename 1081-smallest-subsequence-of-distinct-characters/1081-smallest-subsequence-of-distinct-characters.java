class Solution {
    public String smallestSubsequence(String text) {
        int[] v = new int[26];
        for (char c : text.toCharArray()) v[c - 'a']++;
        StringBuilder r = new StringBuilder();
        int have = 0;
        
        for (char c : text.toCharArray()) {
            if ((have & (1 << (c - 'a'))) == 0) {
                while (r.length() > 0 && v[r.charAt(r.length() - 1) - 'a'] > 0 && r.charAt(r.length() - 1) > c) {
                    have ^= 1 << (r.charAt(r.length() - 1) - 'a');
                    r.deleteCharAt(r.length() - 1);
                }
                r.append(c);
                have |= 1 << (c - 'a');
            }
            v[c - 'a']--;
        }
        
        return r.toString();
    }
}