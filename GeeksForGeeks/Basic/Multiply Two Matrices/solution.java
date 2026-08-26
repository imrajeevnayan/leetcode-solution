class Solution {
    public ArrayList<ArrayList<Integer>> multiplyMatrices(int[][] a, int[][] b) {
        int n = a.length;
        int m = b.length;
        int p = b[0].length;

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            ArrayList<Integer> row = new ArrayList<>();

            for (int j = 0; j < p; j++) {
                int sum = 0;

                for (int k = 0; k < m; k++) {
                    sum += a[i][k] * b[k][j];
                }

                row.add(sum);
            }

            ans.add(row);
        }

        return ans;
    }
}
