class Solution {
    public long sumAndMultiply(int n) {
        int x = 0, sum = 0,p = 1;
        while (n > 0) {
            int d = n % 10;
            if (d != 0) {
                x += d * p;
                p *= 10;
                sum += d;
            }
            n /= 10;
        }
        return 1L * x * sum;
    }
}