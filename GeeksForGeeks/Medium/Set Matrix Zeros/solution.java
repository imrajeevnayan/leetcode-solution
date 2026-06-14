class Solution {
    public void setMatrixZeroes(int[][] mat) {
        // code here
        int m = mat.length;
        int n = mat[0].length;
        
        boolean firstRowHasZero = false;
        boolean firstColHasZero = false;
        
        // 1. Check if first row has any zero
        for (int j = 0; j < n; j++) {
            if (mat[0][j] == 0) {
                firstRowHasZero = true;
                break;
            }
        }
        
        // 2. Check if first column has any zero
        for (int i = 0; i < m; i++) {
            if (mat[i][0] == 0) {
                firstColHasZero = true;
                break;
            }
        }
        
        // 3. Use first row and column as markers for the rest of the matrix
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (mat[i][j] == 0) {
                    mat[i][0] = 0; // Mark row
                    mat[0][j] = 0; // Mark column
                }
            }
        }
        
        // 4. Set zeros based on markers
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (mat[i][0] == 0 || mat[0][j] == 0) {
                    mat[i][j] = 0;
                }
            }
        }
        
        // 5. Handle first row
        if (firstRowHasZero) {
            for (int j = 0; j < n; j++) {
                mat[0][j] = 0;
            }
        }
        
        // 6. Handle first column
        if (firstColHasZero) {
            for (int i = 0; i < m; i++) {
                mat[i][0] = 0;
            }
        }
    }
}