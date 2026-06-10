class Solution {
    public int numOfSubarrays(int[] arr) {
        int mod = 1_000_000_007;

        long ans = 0;
        long even = 1; // empty prefix sum = 0
        long odd = 0;

        int prefix = 0;

        for (int num : arr) {
            prefix += num;

            if ((prefix & 1) == 0) {
                ans += odd;
                even++;
            } else {
                ans += even;
                odd++;
            }
        }

        return (int)(ans % mod);
    }
}