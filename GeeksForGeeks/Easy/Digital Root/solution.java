class Solution {
    public int digitalRoot(int n) {
        if (n < 10) return n;
        // Calculate sum of digits
        int sum = 0;
        int temp = n;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        return digitalRoot(sum);
    }
}