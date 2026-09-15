class Solution {
    public int celebrity(int mat[][]) {

        int n = mat.length;

        int left = 0;
        int right = n - 1;

        // Step 1: Find a possible candidate
        while (left < right) {

            if (mat[left][right] == 1) {
                // left knows right
                // left cannot be celebrity
                left++;
            } else {
                // left does not know right
                // right cannot be celebrity
                right--;
            }
        }

        int candidate = left;

        // Step 2: Verify candidate
        for (int i = 0; i < n; i++) {

            if (i == candidate) {
                continue;
            }

            // Candidate should know nobody
            if (mat[candidate][i] == 1) {
                return -1;
            }

            // Everyone should know candidate
            if (mat[i][candidate] == 0) {
                return -1;
            }
        }

        return candidate;
    }
}
