class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int x : nums) map.put(x, map.getOrDefault(x, 0) + 1);
        int max = 0, ans = 0;

        for (int x : map.keySet())
            max = Math.max(max, map.get(x));

        for (int x : map.keySet())
            if (map.get(x) == max)
                ans += max;

        return ans;
    }
}
