class Solution {

    private char[][] grid;
    private int m, n;

    // memo[r][c][balance]
    private Boolean[][][] memo;

    public boolean hasValidPath(char[][] grid) {
        this.grid = grid;
        this.m = grid.length;
        this.n = grid[0].length;

        // A valid parentheses string must have even length
        if ((m + n - 1) % 2 != 0) {
            return false;
        }

        // Start must be '('
        if (grid[0][0] == ')') {
            return false;
        }

        // End must be ')'
        if (grid[m - 1][n - 1] == '(') {
            return false;
        }

        memo = new Boolean[m][n][m + n];

        return dfs(0, 0, 0);
    }

    private boolean dfs(int r, int c, int balance) {

        // Current character
        if (grid[r][c] == '(') {
            balance++;
        } else {
            balance--;
        }

        // Balance negative => invalid
        if (balance < 0) {
            return false;
        }

        // Reached destination
        if (r == m - 1 && c == n - 1) {
            return balance == 0;
        }

        // Already calculated
        if (memo[r][c][balance] != null) {
            return memo[r][c][balance];
        }

        boolean possible = false;

        // Move down
        if (r + 1 < m) {
            possible = dfs(r + 1, c, balance);
        }

        // Move right
        if (!possible && c + 1 < n) {
            possible = dfs(r, c + 1, balance);
        }

        memo[r][c][balance] = possible;

        return possible;
    }
}
