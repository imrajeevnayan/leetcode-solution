class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int n : nums)
            map.put(n, map.getOrDefault(n, 0) + 1);

        int sum = 0;

        for (int n : map.keySet()) {
            if (map.get(n) % k == 0)
                sum += n*map.get(n);
        }

        return sum;
    }
}