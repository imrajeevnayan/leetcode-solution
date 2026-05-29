class Solution {
    public int findMaxSum(int arr[]) {
        int n = arr.length;
        int[] dp = new int[n];

        Arrays.fill(dp, -1);

        return solve(arr, 0, dp);
    }

    private int solve(int[] arr, int idx, int[] dp) {
        // Base case
        if (idx >= arr.length) {
            return 0;
        }

        // Already computed
        if (dp[idx] != -1) {
            return dp[idx];
        }

        // Take current element
        int take = arr[idx] + solve(arr, idx + 2, dp);

        // Skip current element
        int skip = solve(arr, idx + 1, dp);

        // Store and return answer
        return dp[idx] = Math.max(take, skip);
    }
}