class Solution {
    public int findMaxOddSum(int[] arr) {
        int sum = 0;
        int smallestOdd = Integer.MAX_VALUE;
        int largestNegativeOdd = Integer.MIN_VALUE;

        for (int x : arr) {
            if (x > 0) {
                sum += x;
                if (x % 2 != 0) {
                    smallestOdd = Math.min(smallestOdd, x);
                }
            } else {
                if (x % 2 != 0) {
                    largestNegativeOdd = Math.max(largestNegativeOdd, x);
                }
            }
        }

        if (sum % 2 != 0) {
            return sum;
        }

        int remove = Integer.MAX_VALUE;

        if (smallestOdd != Integer.MAX_VALUE) {
            remove = Math.min(remove, smallestOdd);
        }

        if (largestNegativeOdd != Integer.MIN_VALUE) {
            remove = Math.min(remove, Math.abs(largestNegativeOdd));
        }

        return remove == Integer.MAX_VALUE ? 0 : sum - remove;
    }
}