class Solution {
    public ArrayList<Integer> findEvenOccurrences(int[] arr) {

        HashMap<Integer, Integer> freq = new HashMap<>();

        // Count frequency of each element
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        ArrayList<Integer> ans = new ArrayList<>();
        HashSet<Integer> visited = new HashSet<>();

        // Add elements having even frequency
        // in the order of their first occurrence
        for (int num : arr) {

            if (freq.get(num) % 2 == 0 && !visited.contains(num)) {
                ans.add(num);
                visited.add(num);
            }
        }

        // If no such element exists
        if (ans.isEmpty()) {
            ans.add(-1);
        }

        return ans;
    }
}