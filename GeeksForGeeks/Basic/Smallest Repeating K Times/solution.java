class Solution {
    public int findDuplicate(int[] arr, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int ans = Integer.MAX_VALUE;

        // Find smallest element with frequency k
        for (int num : map.keySet()) {

            if (map.get(num) == k) {
                ans = Math.min(ans, num);
            }
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}