class Solution {
    public int countPrimes(int n) {
        if (n <= 2) return 0;
        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        // 2 ke multiples ko false karo
        for (int i = 4; i < n; i += 2) {
            isPrime[i] = false;
        }
        // Sirf odd numbers check karo
        for (int i = 3; i * i < n; i += 2) {
            if (isPrime[i]) {

                for (int j = i * i; j < n; j += 2 * i) {
                    isPrime[j] = false;
                }
            }
        }

        int count = 1; // 2 prime hai

        // Sirf odd numbers count karo
        for (int i = 3; i < n; i += 2) {
            if (isPrime[i]) {
                count++;
            }
        }

        return count;
    }
}
