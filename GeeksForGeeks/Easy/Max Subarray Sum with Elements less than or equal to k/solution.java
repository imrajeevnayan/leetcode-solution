class Solution {
    public int maxSum(int[] arr, int k) {
        int curr = 0;
        int ans = 0;

        for (int num : arr) {
            if (num <= k) {
                curr += num;
                ans = Math.max(ans, curr);
            } else {
                curr = 0;
            }
        }

        return ans;
    }
}