class Solution {
    int[][] sortedMatrix(int mat[][]) {
        int n = mat.length;
        int m = mat[0].length;

        int[] arr = new int[n * m];
        int k = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[k++] = mat[i][j];
            }
        }

        Arrays.sort(arr);

        k = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = arr[k++];
            }
        }

        return mat;
    }
}
