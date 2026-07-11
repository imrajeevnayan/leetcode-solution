class Solution {
    public int countSubarray(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int sum = 0,count = 0;
        for (int num : arr) {
            if (num == 0) sum += -1;
            else sum += 1;

            if (map.containsKey(sum)) {
                count += map.get(sum);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}