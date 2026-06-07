class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums)map.put(num, map.getOrDefault(num, 0) + 1);
        
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> {
            if (!map.get(a).equals(map.get(b))) return map.get(a) - map.get(b); // Lower first
            return b - a; // Higher first (for same freq)
        });
        for (int num : nums) pq.offer(num);
        
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = pq.poll();
        }

        return result;
    }
}