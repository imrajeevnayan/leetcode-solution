class Solution {
    public int numOfSubarrays(int[] arr) {
        int mod = 1_000_000_007;

        long evenCount = 1;
        long oddCount = 0;

        long prefixSum = 0;
        long result = 0;

        for (int num : arr) {
            prefixSum += num;

            if (prefixSum % 2 == 0) {
                result = (result + oddCount) % mod;
                evenCount++;
            } else {
                result = (result + evenCount) % mod;
                oddCount++;
            }
        }

        return (int) result;
    }
}