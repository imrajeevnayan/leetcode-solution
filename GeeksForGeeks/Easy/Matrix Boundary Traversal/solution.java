class Solution {
    public ArrayList<Integer> boundaryTraversal(int mat[][]) {
        ArrayList<Integer> ans = new ArrayList<>();

        int rows = mat.length;
        int cols = mat[0].length;

        // 1. Top row
        for (int j = 0; j < cols; j++) {
            ans.add(mat[0][j]);
        }

        // 2. Right column
        for (int i = 1; i < rows; i++) {
            ans.add(mat[i][cols - 1]);
        }

        // 3. Bottom row
        if (rows > 1) {
            for (int j = cols - 2; j >= 0; j--) {
                ans.add(mat[rows - 1][j]);
            }
        }

        // 4. Left column
        if (cols > 1) {
            for (int i = rows - 2; i >= 1; i--) {
                ans.add(mat[i][0]);
            }
        }

        return ans;
    }
}
