class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int rows = nums.length;
        int cols = nums[0].length;

        // Total elements same hone chahiye
        if (rows * cols != r * c) {
            return nums;
        }

        int[][] ans = new int[r][c];

        int index = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                ans[index / c][index % c] = nums[i][j];

                index++;
            }
        }

        return ans;
    }
}
