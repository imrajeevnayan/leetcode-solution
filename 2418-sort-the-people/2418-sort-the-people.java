class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a, b) -> heights[b] - heights[a]
        );

        for (int i = 0; i < names.length; i++) {
            pq.offer(i);
        }
        String[] result = new String[names.length];

        int i = 0;
        while (!pq.isEmpty()) {
            int index = pq.poll();
            result[i++] = names[index];
        }
        return result;
    }
}
