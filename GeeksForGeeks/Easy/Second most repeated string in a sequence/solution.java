class Solution {
    public int secFrequent(String[] arr) {
        if (arr.length == 0) {
            return -1;
        }
        HashMap<String, Integer> map = new HashMap<>();

        for (String key : arr) {
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        PriorityQueue<Integer> pq =
            new PriorityQueue<>(Collections.reverseOrder());

        for (String key : map.keySet()) {
            pq.add(map.get(key));
        }
        if (pq.size() < 2) {
            return -1;
        }

        int first = pq.poll();

        while (!pq.isEmpty()) {
            int second = pq.poll();

            if (second < first) {
                return second;
            }
        }
        return -1;
    }
}