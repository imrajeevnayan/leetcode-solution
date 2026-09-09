class Solution {
    public int findMax(int n) {
        int ans = n, maxSum = digitSum(n);
        
        int power = 1;

        while (power <= n) {
            int candidate = (n / (power * 10)) * (power * 10)
                          + ((n / power) % 10 - 1) * power
                          + (power - 1);

            if (candidate >= 1 && digitSum(candidate) > maxSum) {
                maxSum = digitSum(candidate);
                ans = candidate;
            }

            power *= 10;
        }
        return ans;
    }
    private int digitSum(int num) {
        int sum = 0;

        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        return sum;
    }
}
