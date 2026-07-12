class Solution {
    public int findLength(String s) {
        int n = s.length();
        int[] prefix = new int[n + 1];

        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + (s.charAt(i) - '0');
        }

        int maxLen = 0;

        for (int len = 2; len <= n; len += 2) {
            for (int i = 0; i + len <= n; i++) {
                int mid = i + len / 2;

                int left = prefix[mid] - prefix[i];
                int right = prefix[i + len] - prefix[mid];

                if (left == right) {
                    maxLen = len;
                }
            }
        }

        return maxLen;
    }
}