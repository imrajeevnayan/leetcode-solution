class Solution {
    public int countPrimes(int n) {
        if (n <= 2) return 0;
        int size = n / 2;
        boolean[] composite = new boolean[size];
        int count = size; // represents odd numbers

        for (int i = 3; i * i < n; i += 2) {
            if (!composite[i / 2]) {
                for (int j = i * i; j < n; j += 2 * i) {
                    if (!composite[j / 2]) {
                        composite[j / 2] = true;
                        count--;
                    }
                }
            }
        }

        return count;
    }
}