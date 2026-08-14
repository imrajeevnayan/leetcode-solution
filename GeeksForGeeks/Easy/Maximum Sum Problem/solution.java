class Solution {
    int[] dp;

    public int maxSum(int n) {
        dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return solve(n);
    }

    private int solve(int n) {
        if (n <= 1)  return n;
        if (dp[n] != -1) return dp[n];

        int a = solve(n / 2);
        int b = solve(n / 3);
        int c = solve(n / 4);

        return dp[n] = Math.max(n, a + b + c);
    }
}