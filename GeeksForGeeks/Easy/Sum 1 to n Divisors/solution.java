class Solution {
    public static long sumOfDivisors(long n) {
        long sum = 0;
        for (long i = 1; i <= n; i++) {
            sum += (n / i) * i;
        }
        return sum;
    }
}