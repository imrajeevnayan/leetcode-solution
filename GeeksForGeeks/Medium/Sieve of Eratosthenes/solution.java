class Solution {
    public ArrayList<Integer> sieve(int n) {
        ArrayList<Integer> primes = new ArrayList<>();
        if (n < 2) return primes;
        boolean[] isComposite = new boolean[n + 1];
        
        isComposite[0] = true;
        isComposite[1] = true;
        
        for (int i = 2; i * i <= n; i++) {
            if (!isComposite[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isComposite[j] = true;
                }
            }
        }
        
        for (int i = 2; i <= n; i++) {
            if (!isComposite[i]) {
                primes.add(i);
            }
        }
        
        return primes;
    }
}