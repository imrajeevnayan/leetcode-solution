class Solution {
    public int exactlyK(int arr[], int k) {
        return atMostK(arr, k) - atMostK(arr, k - 1);
    }

    private int atMostK(int[] arr, int k) {
        if (k == 0) return 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        int left = 0;
        int count = 0;

        for (int right = 0; right < arr.length; right++) {
            map.put(arr[right], map.getOrDefault(arr[right], 0) + 1);

            while (map.size() > k) {
                map.put(arr[left], map.get(arr[left]) - 1);

                if (map.get(arr[left]) == 0) {
                    map.remove(arr[left]);
                }

                left++;
            }

            // Number of subarrays ending at right
            count += right - left + 1;
        }

        return count;
    }
}
