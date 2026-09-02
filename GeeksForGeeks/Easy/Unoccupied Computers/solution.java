class Solution {
    public int solve(int n, String s) {
        boolean[] inside = new boolean[26];
        boolean[] assigned = new boolean[26];
        int available = n;
        int ans = 0;

        for (char c : s.toCharArray()) {
            int i = c - 'A';

            if (!inside[i]) {
                inside[i] = true;

                if (available > 0) {
                    assigned[i] = true;
                    available--;
                } else {
                    ans++;
                }
            } else {
                inside[i] = false;

                if (assigned[i]) {
                    available++;
                    assigned[i] = false;
                }
            }
        }

        return ans;
    }
}
