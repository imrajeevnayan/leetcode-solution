class Solution {
    public int minChanges(String s) {
        boolean[] seen = new boolean[26];
        int ans = 0;
        for (char c : s.toCharArray()) {
            if (seen[c - 'a']) ans++;
            else  seen[c - 'a'] = true;
        }
        return ans;
    }
}