class Solution {
    public double myPow(double x, int n) {
        if (n == 0) return 1.0;
        
        long exp = n;                    // Handle Integer.MIN_VALUE safely
        if (n < 0) {
            x = 1.0 / x;
            exp = -exp;
        }
        
        double ans = 1.0;
        while (exp > 0) {
            if (exp % 2 == 1) {
                ans *= x;
            }
            x *= x;
            exp /= 2;
        }
        
        return ans;
    }
}