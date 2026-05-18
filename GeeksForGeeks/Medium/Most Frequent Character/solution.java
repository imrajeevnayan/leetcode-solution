class Solution {
    public char getMaxOccuringChar(String s) {
        int[] freq = new int[256];
        for (char c : s.toCharArray()) freq[c]++;
        int maxCount = 0;
        char ans = 'z';
        for (int i = 0; i < 256; i++) {
            if (freq[i] > maxCount) {
                maxCount = freq[i];
                ans = (char) i;
            }
        }
        return ans;
    }
}