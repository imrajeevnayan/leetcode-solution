class Solution {
    private static final int MOD = 1_000_000_007;

    public int zigZagArrays(int n, int l, int r) {
        // Edge cases
        if (n <= 0 || l > r) return 0;
        int range = r - l + 1;
        if (n == 1) return range % MOD;

        long[] dpLessPrev = new long[range];
        long[] dpGreaterPrev = new long[range];
        for (int v = 0; v < range; v++) {
            dpLessPrev[v] = 1;
            dpGreaterPrev[v] = 1;
        }

        // Iterate over length i from 2 to n
        for (int i = 2; i <= n; i++) {
            // Build prefix sums for dpGreaterPrev (for dpLess)
            long[] prefixGreater = new long[range];
            prefixGreater[0] = dpGreaterPrev[0];
            for (int v = 1; v < range; v++) {
                prefixGreater[v] = (prefixGreater[v-1] + dpGreaterPrev[v]) % MOD;
            }

            // Build suffix sums for dpLessPrev (for dpGreater)
            long[] suffixLess = new long[range];
            suffixLess[range-1] = dpLessPrev[range-1];
            for (int v = range-2; v >= 0; v--) {
                suffixLess[v] = (suffixLess[v+1] + dpLessPrev[v]) % MOD;
            }

            long[] dpLessCurr = new long[range];
            long[] dpGreaterCurr = new long[range];

            for (int v = 0; v < range; v++) {
                dpLessCurr[v] = (v > 0) ? prefixGreater[v-1] : 0;
                dpGreaterCurr[v] = (v < range-1) ? suffixLess[v+1] : 0;
            }

            // Roll over for next iteration
            dpLessPrev = dpLessCurr;
            dpGreaterPrev = dpGreaterCurr;
        }

        long total = 0;
        for (int v = 0; v < range; v++) {
            total = (total + dpLessPrev[v] + dpGreaterPrev[v]) % MOD;
        }
        return (int) total;
    }
}