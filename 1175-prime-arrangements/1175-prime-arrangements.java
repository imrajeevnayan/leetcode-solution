class Solution {
   static final long MOD = 1000000007;
    public int numPrimeArrangements(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        // Sieve of Eratosthenes
        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        // Count primes
        int primeCount = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) primeCount++;
        }
        int nonPrimeCount = n - primeCount;

        long primeWays = factorial(primeCount);
        long nonPrimeWays = factorial(nonPrimeCount);

        return (int)((primeWays * nonPrimeWays) % MOD);
    }
    private long factorial(int n) {
        long ans = 1;
        for (int i = 2; i <= n; i++) {
            ans = (ans * i) % MOD;
        }
        return ans;
    }
}
