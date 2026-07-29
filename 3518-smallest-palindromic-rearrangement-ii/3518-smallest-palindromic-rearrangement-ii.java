class Solution {
    private static final long MAX = 1_000_001;   // k max + 1

    public String smallestPalindrome(String s, int k) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        // extract possible middle character
        char mid = 0;
        for (int i = 0; i < 26; i++) {
            if (freq[i] % 2 == 1) {
                mid = (char) ('a' + i);
                freq[i]--;
                break;
            }
        }

        // half frequencies for the left half
        int[] half = new int[26];
        int halfLen = 0;
        for (int i = 0; i < 26; i++) {
            half[i] = freq[i] / 2;
            halfLen += half[i];
        }

        // total number of distinct left-half permutations
        if (countPerms(half) < k) {
            return "";
        }

        // build the k-th left half
        StringBuilder left = new StringBuilder();
        for (int pos = 0; pos < halfLen; pos++) {
            for (int c = 0; c < 26; c++) {
                if (half[c] == 0) continue;

                half[c]--;                          // try this character
                long ways = countPerms(half);
                if (ways >= k) {
                    left.append((char) ('a' + c));  // keep it
                    break;
                } else {
                    k -= (int) ways;                // skip this branch
                    half[c]++;                      // restore
                }
            }
        }

        // construct the full palindrome
        StringBuilder res = new StringBuilder(left);
        if (mid != 0) res.append(mid);
        res.append(left.reverse());
        return res.toString();
    }

    // multinomial coefficient  n! / (f0! f1! … f25!)   capped at MAX
    private long countPerms(int[] cnt) {
        int n = 0;
        for (int x : cnt) n += x;

        long res = 1;
        for (int i = 0; i < 26; i++) {
            int f = cnt[i];
            if (f == 0) continue;
            // multiply by C(n, f) = n! / (f! (n-f)!)
            res = mul(res, binom(n, f));
            if (res >= MAX) return MAX;
            n -= f;
        }
        return res;
    }

    private long binom(int n, int k) {
        if (k < 0 || k > n) return 0;
        k = Math.min(k, n - k);
        long res = 1;
        for (int i = 1; i <= k; i++) {
            res = res * (n - k + i) / i;
            if (res >= MAX) return MAX;
        }
        return res;
    }

    private long mul(long a, long b) {
        if (a >= MAX || b >= MAX) return MAX;
        long prod = a * b;
        return prod >= MAX ? MAX : prod;
    }
}