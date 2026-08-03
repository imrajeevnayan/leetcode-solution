class Solution {
    public boolean isStrong(int n) {
        int original = n;
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += factorial(digit);
            n /= 10;
        }

        return sum == original;
    }

    private int factorial(int x) {
        int fact = 1;
        for (int i = 2; i <= x; i++) {
            fact *= i;
        }
        return fact;
    }
}