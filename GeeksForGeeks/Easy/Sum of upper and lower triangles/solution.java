class Solution {
    public ArrayList<Integer> sumTriangles(int[][] mat) {
        int n = mat.length;

        int upperSum = 0, lowerSum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                // Upper triangle
                if (j >= i) {
                    upperSum += mat[i][j];
                }

                // Lower triangle
                if (i >= j) {
                    lowerSum += mat[i][j];
                }
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(upperSum);
        ans.add(lowerSum);

        return ans;
    }
}
