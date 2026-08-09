class Solution {
    public int firstElement(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int x : arr) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        for (int x : arr) {
            if (map.get(x) == k) return x;
        }
        return -1;
    }
}