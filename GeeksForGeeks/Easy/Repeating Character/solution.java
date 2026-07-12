class Solution {
    static int repeatedCharacter(String S) {
        int[] freq = new int[256];

        for (int i = 0; i < S.length(); i++) {
            freq[S.charAt(i)]++;
        }

        // Find leftmost repeated character
        for (int i = 0; i < S.length(); i++) {
            if (freq[S.charAt(i)] > 1) {
                return i;
            }
        }

        return -1;
    }
}