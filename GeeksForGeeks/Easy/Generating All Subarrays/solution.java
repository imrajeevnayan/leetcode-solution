class Solution {
    public List<List<Integer>> getSubArrays(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        generate(arr, 0, 0, result);
        return result;
    }
    private void generate(int[] arr, int start, int end,
                          List<List<Integer>> result) {

        if (start == arr.length) return;
        
        if (end == arr.length) {
            generate(arr, start + 1, start + 1, result);
            return;
        }
        List<Integer> subarray = new ArrayList<>();

        for (int i = start; i <= end; i++) {
            subarray.add(arr[i]);
        }
        result.add(subarray);

        generate(arr, start, end + 1, result);
    }
}