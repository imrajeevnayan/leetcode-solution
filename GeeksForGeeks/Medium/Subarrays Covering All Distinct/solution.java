
class Solution {
    public int countAllDistinct(int[] arr) {
        // Find total distinct elements
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            set.add(num);
        }

        int totalDistinct = set.size();

        HashMap<Integer, Integer> map = new HashMap<>();

        int left = 0,count = 0;

        for (int right = 0; right < arr.length; right++) {
            map.put(arr[right], map.getOrDefault(arr[right], 0) + 1);

            while (map.size() == totalDistinct) {
                // All distinct elements are present.
                // Every subarray starting from left and ending
                // at right or later is valid.
                count += arr.length - right;

                map.put(arr[left], map.get(arr[left]) - 1);

                if (map.get(arr[left]) == 0) {
                    map.remove(arr[left]);
                }

                left++;
            }
        }

        return count;
    }
}
