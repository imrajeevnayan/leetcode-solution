class Solution {

    static final int MOD = 1_000_000_007;

    int m, n;
    int[][] grid;

    // memo for reflection state
    int[][][] finalRow;
    int[][][] finalCol;
    boolean[][][] vis;
    boolean[][][] inStack;

    long[][] dp;

    public int uniquePaths(int[][] grid) {
        this.grid = grid;
        m = grid.length;
        n = grid[0].length;

        finalRow = new int[m][n][2];
        finalCol = new int[m][n][2];

        vis = new boolean[m][n][2];
        inStack = new boolean[m][n][2];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int d = 0; d < 2; d++) {
                    finalRow[i][j][d] = -2;
                    finalCol[i][j][d] = -2;
                }
            }
        }

        dp = new long[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = -1;
            }
        }

        return (int) solve(0, 0);
    }

    private long solve(int r, int c) {

        if (r < 0 || c < 0 || r >= m || c >= n)
            return 0;

        if (r == m - 1 && c == n - 1)
            return 1;

        if (dp[r][c] != -1)
            return dp[r][c];

        long ans = 0;

        // attempt Right
        if (c + 1 < n) {
            int[] nxt = move(r, c + 1, 0);

            if (nxt[0] != -1) {
                ans += solve(nxt[0], nxt[1]);
            }
        }

        // attempt Down
        if (r + 1 < m) {
            int[] nxt = move(r + 1, c, 1);

            if (nxt[0] != -1) {
                ans += solve(nxt[0], nxt[1]);
            }
        }

        return dp[r][c] = ans % MOD;
    }

    // dir: 0 = entered while moving Right
    //      1 = entered while moving Down
    private int[] move(int r, int c, int dir) {

        if (r < 0 || c < 0 || r >= m || c >= n)
            return new int[] { -1, -1 };

        if (!vis[r][c][dir]) {
            dfsReflection(r, c, dir);
        }

        return new int[] {
                finalRow[r][c][dir],
                finalCol[r][c][dir]
        };
    }

    private void dfsReflection(int r, int c, int dir) {

        if (r < 0 || c < 0 || r >= m || c >= n)
            return;

        vis[r][c][dir] = true;
        inStack[r][c][dir] = true;

        // non-mirror => stop here
        if (grid[r][c] == 0) {
            finalRow[r][c][dir] = r;
            finalCol[r][c][dir] = c;
            inStack[r][c][dir] = false;
            return;
        }

        int nr, nc, nd;

        if (dir == 0) { // entered moving Right
            nr = r + 1;
            nc = c;
            nd = 1;
        } else { // entered moving Down
            nr = r;
            nc = c + 1;
            nd = 0;
        }

        if (nr < 0 || nc < 0 || nr >= m || nc >= n) {
            finalRow[r][c][dir] = -1;
            finalCol[r][c][dir] = -1;
            inStack[r][c][dir] = false;
            return;
        }

        if (inStack[nr][nc][nd]) {
            finalRow[r][c][dir] = -1;
            finalCol[r][c][dir] = -1;
            inStack[r][c][dir] = false;
            return;
        }

        if (!vis[nr][nc][nd]) {
            dfsReflection(nr, nc, nd);
        }

        finalRow[r][c][dir] = finalRow[nr][nc][nd];
        finalCol[r][c][dir] = finalCol[nr][nc][nd];

        inStack[r][c][dir] = false;
    }
}