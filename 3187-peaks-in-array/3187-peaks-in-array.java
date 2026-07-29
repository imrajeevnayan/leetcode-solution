class Solution {

    class BIT {
        int[] bit;
        int n;

        BIT(int n) {
            this.n = n;
            bit = new int[n + 1];
        }

        void update(int idx, int delta) {
            idx++;
            while (idx <= n) {
                bit[idx] += delta;
                idx += idx & -idx;
            }
        }

        int query(int idx) {
            idx++;
            int sum = 0;
            while (idx > 0) {
                sum += bit[idx];
                idx -= idx & -idx;
            }
            return sum;
        }

        int rangeQuery(int l, int r) {
            if (l > r) return 0;
            return query(r) - (l == 0 ? 0 : query(l - 1));
        }
    }

    public List<Integer> countOfPeaks(int[] nums, int[][] queries) {
        int n = nums.length;
        BIT bit = new BIT(n);
        int[] peak = new int[n];

        // Build initial peaks
        for (int i = 1; i < n - 1; i++) {
            if (nums[i] > nums[i - 1] && nums[i] > nums[i + 1]) {
                peak[i] = 1;
                bit.update(i, 1);
            }
        }

        List<Integer> ans = new ArrayList<>();

        for (int[] q : queries) {

            if (q[0] == 1) {
                int l = q[1];
                int r = q[2];

                if (r - l < 2) {
                    ans.add(0);
                } else {
                    ans.add(bit.rangeQuery(l + 1, r - 1));
                }

            } else {
                int idx = q[1];
                int val = q[2];

                // Remove old peak values
                for (int i = Math.max(1, idx - 1); i <= Math.min(n - 2, idx + 1); i++) {
                    if (peak[i] == 1) {
                        bit.update(i, -1);
                        peak[i] = 0;
                    }
                }

                nums[idx] = val;

                // Recalculate peaks
                for (int i = Math.max(1, idx - 1); i <= Math.min(n - 2, idx + 1); i++) {
                    if (nums[i] > nums[i - 1] && nums[i] > nums[i + 1]) {
                        peak[i] = 1;
                        bit.update(i, 1);
                    }
                }
            }
        }

        return ans;
    }
}