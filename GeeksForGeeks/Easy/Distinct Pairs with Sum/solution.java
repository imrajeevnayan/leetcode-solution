class Solution {
    public List<List<Integer>> distinctPairs(int[] arr, int target) {
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(arr);

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                result.add(Arrays.asList(arr[left], arr[right]));

                int leftVal = arr[left];
                int rightVal = arr[right];

                // Skip duplicates
                while (left < right && arr[left] == leftVal) {
                    left++;
                }

                while (left < right && arr[right] == rightVal) {
                    right--;
                }

            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return result;
    }
}
