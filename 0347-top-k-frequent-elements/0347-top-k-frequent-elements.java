class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // 1. Frequency Map banao
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // 2. Max-Heap banao (Zyada frequency wala upar rahega)
        // Note: Integer.compare use karna safe hai overflow se bachne ke liye
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> 
            Integer.compare(map.get(b), map.get(a))
        );
        
        pq.addAll(map.keySet());

        // 3. Top K elements nikal lo
        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = pq.poll();
        }
        
        return ans;
    }
}