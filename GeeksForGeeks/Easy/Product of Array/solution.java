class Solution {
    public long product(long arr[]) {
        long MOD = 1000000007;
        long ans = 1;

        for (long num : arr) {
            ans = (ans * (num % MOD)) % MOD;
        }

        return ans;
    }
}