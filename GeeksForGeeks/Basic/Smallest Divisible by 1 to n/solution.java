class Solution {
    public static long getSmallestDivNum(int n) {
        long ans = 1;
        for (int i = 2; i <= n; i++) {
            ans = lcm(ans, i);
        }
        return ans;
    }
    private static long lcm(long a, long b) {
        return (a * b) / gcd(a, b);
    }
    private static long gcd(long a, long b) {
        while (b != 0) {
            long temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}