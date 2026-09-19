class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> list = new ArrayList<>();

        for (int[] interval : intervals) {

            // interval newInterval se pehle hai
            if (interval[1] < newInterval[0]) {
                list.add(interval);
            }

            // interval newInterval ke baad hai
            else if (interval[0] > newInterval[1]) {
                list.add(newInterval);
                newInterval = interval;
            }

            // Overlap -> merge
            else {
                newInterval[0] = Math.min(newInterval[0], interval[0]);
                newInterval[1] = Math.max(newInterval[1], interval[1]);
            }
        }

        // Last interval
        list.add(newInterval);

        return list.toArray(new int[list.size()][]);
    }
}