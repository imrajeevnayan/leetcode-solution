class Solution {
    public int maxValue(int n, int index, int maxSum) {
        int left = 1, right = maxSum;
        while (left < right) {
            int mid = left + (right - left + 1) / 2;
            if (isPossible(n, index, maxSum, mid)) {
                left = mid;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
    private boolean isPossible(int n, int index, int maxSum, int val) {
        long sum = val;

        // Left side
        if (val > index) {
            long first = val - index;
            sum += (first + val - 1L) * index / 2;
        } else {
            sum += (long) val * (val - 1) / 2;
            sum += index - (val - 1);
        }

        // Right side
        int rightLen = n - index - 1;
        if (val > rightLen) {
            long last = val - rightLen;
            sum += (last + val - 1L) * rightLen / 2;
        } else {
            sum += (long) val * (val - 1) / 2;
            sum += rightLen - (val - 1);
        }
        return sum <= maxSum;
    }
}