class Solution {
    public int numberCount(int n, int k) {
        int low = 1;
        int high = n;
        int ans = n + 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (mid - digitSum(mid) >= k) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        if (ans == n + 1) {
            return 0;
        }

        return n - ans + 1;
    }

    private int digitSum(int num) {
        int sum = 0;

        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        return sum;
    }
}
