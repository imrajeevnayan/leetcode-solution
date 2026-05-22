import java.util.*;

class Solution {

    ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

    public ArrayList<ArrayList<Integer>> nQueen(int n) {

        int[] board = new int[n]; // board[col] = row

        solve(0, n, board);

        return ans;
    }

    void solve(int col, int n, int[] board) {

        if (col == n) {

            ArrayList<Integer> temp = new ArrayList<>();

            for (int r : board)
                temp.add(r + 1); // 1-based indexing

            ans.add(temp);
            return;
        }

        for (int row = 0; row < n; row++) {

            if (isSafe(row, col, board)) {

                board[col] = row;

                solve(col + 1, n, board);
            }
        }
    }

    boolean isSafe(int row, int col, int[] board) {

        for (int prevCol = 0; prevCol < col; prevCol++) {

            int prevRow = board[prevCol];

            // same row or diagonal
            if (prevRow == row ||
                Math.abs(prevRow - row) == Math.abs(prevCol - col))
                return false;
        }

        return true;
    }
}