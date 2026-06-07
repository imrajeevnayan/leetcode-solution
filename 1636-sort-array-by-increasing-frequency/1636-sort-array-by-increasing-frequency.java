class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums)map.put(n, map.getOrDefault(n,0) + 1);

        List<Integer> list = new ArrayList<>();
        for (int num : nums)list.add(num);
        
        Collections.sort(list, (a, b) -> {
            int comp = map.get(a) - map.get(b);
            return comp != 0 ? comp : b - a;
        });
        
        int[] result = new int[nums.length];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}