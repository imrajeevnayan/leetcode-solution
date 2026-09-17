class Solution {
    public static ArrayList<ArrayList<Integer>> getPairs(int[] arr) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
          Arrays.sort(arr);
        int left = 0,right = arr.length - 1;
         while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == 0) {
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(arr[left++]);
                pair.add(arr[right--]);
                result.add(pair);
                //left++;
                //right--;
                // Skip duplicate values from the left to avoid repeating the same pair
                while (left < right && arr[left] == arr[left - 1]) {
                    left++;
                }
                // Skip duplicate values from the right
                while (left < right && arr[right] == arr[right + 1]) {
                    right--;
                }

            } else if (sum < 0) {
                left++;
            } else {
                right--;
            }
        }

        return result;
    }
}