class Solution {
    public int computeValue(int n) {
        long MOD = 1000000007;
        
        long[] fact = new long[2 * n + 1];
        long[] invFact = new long[2 * n + 1];
        
        fact[0] = 1;
        for (int i = 1; i <= 2 * n; i++) {
            fact[i] = (fact[i - 1] * i) % MOD;
        }
        
        invFact[2 * n] = modInverse(fact[2 * n], MOD);
        for (int i = 2 * n - 1; i >= 0; i--) {
            invFact[i] = (invFact[i + 1] * (i + 1)) % MOD;
        }
        
        long result = 0;
        for (int k = 0; k <= n; k++) {
            // C(n, k) * C(n, k)
            long comb = (fact[n] * invFact[k] % MOD) * invFact[n - k] % MOD;
            result = (result + comb * comb % MOD) % MOD;
        }
        
        return (int) result;
    }
    
    private long modInverse(long a, long mod) {
        return power(a, mod - 2, mod);
    }
    
    private long power(long base, long exp, long mod) {
        long result = 1;
        base %= mod;
        while (exp > 0) {
            if (exp % 2 == 1) {
                result = (result * base) % mod;
            }
            base = (base * base) % mod;
            exp /= 2;
        }
        return result;
    }
}