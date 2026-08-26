class Solution {
    public long countEvenSum(int[] arr) {
        long even = 1;
        long odd = 0;
        long sum = 0;
        long ans = 0;

        for (int x : arr) {
            sum += x;

            if (sum % 2 == 0) {
                ans += even;
                even++;
            } else {
                ans += odd;
                odd++;
            }
        }

        return ans;
    }
}
