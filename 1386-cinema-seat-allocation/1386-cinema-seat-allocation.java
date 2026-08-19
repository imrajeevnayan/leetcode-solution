class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        Map<Integer, Integer> rows = new HashMap<>();

        for (int[] seat : reservedSeats) {
            if (seat[1] >= 2 && seat[1] <= 9) {
                rows.put(seat[0], rows.getOrDefault(seat[0], 0) | (1 << seat[1]));
            }
        }

        int result = (n - rows.size()) * 2;

        int left = 0b00111100;
        int middle = 0b11110000;
        int right = 0b1111000000;

        for (int mask : rows.values()) {
            boolean l = (mask & left) == 0;
            boolean r = (mask & right) == 0;

            if (l && r) {
                result += 2;
            } else if (l || r || (mask & middle) == 0) {
                result++;
            }
        }

        return result;
    }
}
