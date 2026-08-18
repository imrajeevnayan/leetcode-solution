class Solution {
    static int minTime(int S1, int S2, int N) {
        int low = 0, high = N;
        long ans = Long.MAX_VALUE;

        while (low <= high) {
            int x = low + (high - low) / 2;

            long time1 = (long) x * S1;
            long time2 = (long) (N - x) * S2;
            long time = Math.max(time1, time2);

            ans = Math.min(ans, time);

            if (time1 < time2) {
                low = x + 1;
            } else {
                high = x - 1;
            }
        }
        return (int) ans;
    }
}
