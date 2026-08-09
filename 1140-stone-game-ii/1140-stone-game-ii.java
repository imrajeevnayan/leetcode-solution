class Solution {
    private int[] suffixSum;
    private Integer[][] memo;

    public int stoneGameII(int[] piles) {
        int n = piles.length;
        suffixSum = new int[n + 1];
        for (int i = n - 1; i >= 0; i--) {
            suffixSum[i] = suffixSum[i + 1] + piles[i];
        }
        memo = new Integer[n][n + 1];
        return dp(0, 1);
    }

    private int dp(int startIndex, int m) {
        if (startIndex + 2 * m >= suffixSum.length - 1) {
            return suffixSum[startIndex];
        }
        if (memo[startIndex][m] != null) {
            return memo[startIndex][m];
        }
        int maxStones = 0;
        int totalRemaining = suffixSum[startIndex];
        for (int x = 1; x <= 2 * m; x++) {
            int nextIndex = startIndex + x;
            int opponentBest = dp(nextIndex, Math.max(m, x));
            int myStones = totalRemaining - opponentBest;
            maxStones = Math.max(maxStones, myStones);
        }
        memo[startIndex][m] = maxStones;
        return maxStones;
    }
}