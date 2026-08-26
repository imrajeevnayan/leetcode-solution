class Solution {
    void interchangeRows(int[][] mat) {
        int top = 0;
        int bottom = mat.length - 1;

        while (top < bottom) {
            int[] temp = mat[top];
            mat[top] = mat[bottom];
            mat[bottom] = temp;

            top++;
            bottom--;
        }
    }
}
