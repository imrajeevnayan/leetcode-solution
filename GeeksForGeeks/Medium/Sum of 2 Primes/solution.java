class Solution {
    public static ArrayList<Integer> getPrimes(int n) {
        ArrayList<Integer> ans = new ArrayList<>();

        boolean[] prime = new boolean[n + 1];
        Arrays.fill(prime, true);

        prime[0] = false;
        prime[1] = false;

        // Sieve of Eratosthenes
        for (int i = 2; i * i <= n; i++) {
            if (prime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    prime[j] = false;
                }
            }
        }

        // Find smallest prime pair
        for (int a = 2; a <= n; a++) {
            if (prime[a] && prime[n - a]) {
                ans.add(a);
                ans.add(n - a);
                return ans;
            }
        }

        ans.add(-1);
        ans.add(-1);
        return ans;
    }
}