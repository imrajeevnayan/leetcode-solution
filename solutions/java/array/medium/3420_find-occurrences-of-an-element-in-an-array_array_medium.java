class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        List<Integer> positions = new ArrayList<>();
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == x) {
                positions.add(i);
            }
        }
        
        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            if (queries[i] <= positions.size()) {
                result[i] = positions.get(queries[i] - 1);
            } else {
                result[i] = -1;
            }
        }
        
        return result;
    }
}