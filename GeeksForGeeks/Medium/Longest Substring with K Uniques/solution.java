class Solution {
    public int longestKSubstr(String s, int k) {
        int n = s.length();
        if (k == 0) return -1;

        int[] freq = new int[26];
        int left = 0;
        int distinct = 0;
        int maxLen = -1;

        for (int right = 0; right < n; right++) {
            int r = s.charAt(right) - 'a';
            if (freq[r] == 0) distinct++;
            freq[r]++;

            // Shrink jab distinct > k
            while (distinct > k) {
                int l = s.charAt(left) - 'a';
                freq[l]--;
                if (freq[l] == 0) distinct--;
                left++;
            }

            // Sirf tab update karo jab exactly k distinct ho
            if (distinct == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
        }

        return maxLen;
    }
}