public class Solution {
    public int findLHS(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
     Map<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        int maxLen = 0;
        for (int num : freq.keySet()) {
            if (freq.containsKey(num + 1)) {
                int currentLen = freq.get(num) + freq.get(num + 1);
                maxLen = Math.max(maxLen, currentLen);
            }
        }
        return maxLen;
    }
}