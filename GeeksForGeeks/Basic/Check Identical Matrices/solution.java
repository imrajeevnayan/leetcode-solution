class Solution {
    public boolean identicalMat(int[][] mat1, int[][] mat2) {
        if (mat1.length != mat2.length) return false;

        for (int i = 0; i < mat1.length; i++) {
            if (mat1[i].length != mat2[i].length) return false;
            
            for (int j = 0; j < mat1[i].length; j++) {
                if (mat1[i][j] != mat2[i][j]) return false;
                
            }
        }
        return true;
    }
}
