class Solution {
    public int longestSubarray(int arr[]) {
        int maxLen = 0;
        int currentLen = 0;

        for (int num : arr) {
            if (num >= 0) {
                currentLen++;
                maxLen = Math.max(maxLen, currentLen);
            } else {
                currentLen = 0;
            }
        }

        return maxLen;
    }
}