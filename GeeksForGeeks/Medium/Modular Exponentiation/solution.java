class Solution {
    public int powMod(int x, int n, int M) {
        long ans = 1;
        long base = x % M;

        while (n > 0) {
            if ((n & 1) == 1)
                ans = (ans * base) % M;

            base = (base * base) % M;
            n >>= 1;
        }

        return (int) ans;
    }
}