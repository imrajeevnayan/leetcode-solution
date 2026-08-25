class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer, String> map = new HashMap<>();

        for (int i = 0; i < names.length; i++) {
            map.put(heights[i], names[i]);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);

        for (int height : heights) {
            pq.offer(height);
        }

        String[] result = new String[names.length];

        int i = 0;
        while (!pq.isEmpty()) {
            int height = pq.poll();
            result[i++] = map.get(height);
        }

        return result;
    }
}
