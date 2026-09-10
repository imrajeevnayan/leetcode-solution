class Solution {
    public ArrayList<ArrayList<Integer>> transpose(int[][] mat) {

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        int rows = mat.length;
        int cols = mat[0].length;

        for (int j = 0; j < cols; j++) {

            ArrayList<Integer> row = new ArrayList<>();

            for (int i = 0; i < rows; i++) {
                row.add(mat[i][j]);
            }

            ans.add(row);
        }

        return ans;
    }
}
