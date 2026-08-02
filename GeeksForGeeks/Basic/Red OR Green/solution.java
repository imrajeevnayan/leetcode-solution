class Solution {
    public int redOrGreen(String s) {
        int r = 0, g = 0;
        for (char c : s.toCharArray()) {
            if (c == 'R') r++;
            else g++;
        }
        return Math.min(r, g);
    }
}