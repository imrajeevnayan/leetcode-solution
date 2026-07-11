class Solution {
    int maxIndexDiff(int[] arr) {
        int n = arr.length;

        int[] leftMin = new int[n];
        int[] rightMax = new int[n];

        // leftMin[i] = minimum element from 0 to i
        leftMin[0] = arr[0];
        for (int i = 1; i < n; i++) {
            leftMin[i] = Math.min(leftMin[i - 1], arr[i]);
        }

        // rightMax[i] = maximum element from i to n-1
        rightMax[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], arr[i]);
        }

        int i = 0, j = 0;
        int maxDiff = -1;

        while (i < n && j < n) {
            if (leftMin[i] <= rightMax[j]) {
                maxDiff = Math.max(maxDiff, j - i);
                j++;
            } else {
                i++;
            }
        }

        return maxDiff;
    }
}