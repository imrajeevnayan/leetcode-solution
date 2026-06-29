class Solution {
    public int kthDistinctElement(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) map.put(num, map.getOrDefault(num, 0) + 1);
        int count = 0;
        for (int num : arr) {
            if (map.get(num) == 1) count++;
                if (count == k)  return num;
        }
        return -1;
    }
}