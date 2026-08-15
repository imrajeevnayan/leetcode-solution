class Solution {
    int[][] dp;
    String s;
    int d;

    int solve(int i, int tight, int start) {
        if (i == s.length())
            return start;

        if (dp[i][tight] != -1 && start == 1)
            return dp[i][tight];

        int lim = tight == 1 ? s.charAt(i) - '0' : 9;
        int ans = 0;

        for (int x = 0; x <= lim; x++) {
            if (start == 0 && x == 0) {
                ans += solve(i + 1, tight & (x == lim ? 1 : 0), 0);
            } else if (x != d) {
                ans += solve(i + 1, tight & (x == lim ? 1 : 0), 1);
            }
        }

        if (start == 1)
            dp[i][tight] = ans;

        return ans;
    }

    public int countWithout(int n, int d) {
        if (n == 0) return 0;

        s = String.valueOf(n);
        this.d = d;
        dp = new int[s.length()][2];

        for (int[] a : dp)
            java.util.Arrays.fill(a, -1);

        return solve(0, 1, 0);
    }
}