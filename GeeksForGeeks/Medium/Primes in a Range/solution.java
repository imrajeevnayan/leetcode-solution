class Solution {
    public List<Integer> primeRange(int l, int r) {

        boolean[] prime = new boolean[r + 1];
        Arrays.fill(prime, true);

        if (r >= 0) prime[0] = false;
        if (r >= 1) prime[1] = false;

        for (int i = 2; i * i <= r; i++) {

            if (prime[i]) {

                for (int j = i * i; j <= r; j += i) {
                    prime[j] = false;
                }
            }
        }

        List<Integer> ans = new ArrayList<>();

        for (int i = Math.max(2, l); i <= r; i++) {

            if (prime[i]) {
                ans.add(i);
            }
        }

        return ans;
    }
}