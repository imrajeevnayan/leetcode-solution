class Solution {
    public ArrayList<Integer> twoSum(int[] arr, int target) {
        ArrayList<Integer> result = new ArrayList<>();

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                result.add(left + 1);   // 1-based index
                result.add(right + 1);
                return result;
            } 
            else if (sum < target) {
                left++;
            } 
            else {
                right--;
            }
        }

        result.add(-1);
        result.add(-1);
        return result;
    }
}