class Solution {
    static int reverse(int n, int rev) {
        if (n == 0) return rev;
        return reverse(n / 10, rev * 10 + n % 10);
    }

    static long power(long a, long b) {
        if (b == 0) return 1;
        return a * power(a, b - 1);
    }
    public int reverseExponentiation(int n) {
        int rev = reverse(n, 0);
        return (int)power(n, rev);
        
    }
}
