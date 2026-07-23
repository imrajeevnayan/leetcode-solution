class Solution {
    public int sumOfPrimesInRange(int n) {
        int rev = reverse(n);
        int start = Math.min(n, rev);
        int end = Math.max(n, rev);
        boolean[] prime = sieve(end);
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (prime[i]) {
                sum += i;
            }
        }
        return sum;
    }
    private int reverse(int n) {
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return rev;
    }
    private boolean[] sieve(int n) {
        boolean[] prime = new boolean[n + 1];
        Arrays.fill(prime, true);
        if (n >= 0) prime[0] = false;
        if (n >= 1) prime[1] = false;
        for (int i = 2; i * i <= n; i++) {
            if (prime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    prime[j] = false;
                }
            }
        }
        return prime;
    }
}
