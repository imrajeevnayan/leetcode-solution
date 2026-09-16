class Solution {
    public int diagonalPrime(int[][] nums) {
        int n = nums.length;
        int maxPrime = 0;
        for (int i = 0; i < n; i++) {
            // Main diagonal
            int first = nums[i][i];
            // Other diagonal
            int second = nums[i][n - 1 - i];
            if (isPrime(first)) {
                maxPrime = Math.max(maxPrime, first);
            }
            if (isPrime(second)) {
                maxPrime = Math.max(maxPrime, second);
            }
        }
        return maxPrime;
    }
    private boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
