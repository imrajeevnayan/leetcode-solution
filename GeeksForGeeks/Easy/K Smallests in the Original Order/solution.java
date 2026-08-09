class Solution {
    public int[] kSmallest(int[] arr, int k) {
        PriorityQueue<Integer> pq =
            new PriorityQueue<>(Collections.reverseOrder());

        for (int x : arr) {
            pq.add(x);

            if (pq.size() > k) {
                pq.poll();
            }
        }
        HashMap<Integer, Integer> map = new HashMap<>();

        while (!pq.isEmpty()) {
            int x = pq.poll();
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        int[] result = new int[k];
        int index = 0;

        for (int x : arr) {
            if (map.containsKey(x) && map.get(x) > 0) {
                result[index++] = x;
                map.put(x, map.get(x) - 1);

                if (index == k) {
                    break;
                }
            }
        }

        return result;
    }
}