class Solution {
    public String frequencySort(String s) {
        // Step 1: Frequency Map banao
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        // Step 2: Max-Heap banao (Frequency ke basis par sort hoga)
        // Jo character zyada baar aaya hai, wo upar rahega
        PriorityQueue<Character> pq = new PriorityQueue<>(
            (a, b) -> map.get(b) - map.get(a)
        );
        
        // Saare unique characters ko heap mein daal do
        pq.addAll(map.keySet());
        
        // Step 3: Result string build karo
        StringBuilder sb = new StringBuilder();
        
        while (!pq.isEmpty()) {
            char c = pq.poll(); // Sabse zyada frequency wala character nikalo
            int freq = map.get(c);
            
            // Us character ko 'freq' times append karo
            for (int i = 0; i < freq; i++) {
                sb.append(c);
            }
        }
        
        return sb.toString();
    }
}