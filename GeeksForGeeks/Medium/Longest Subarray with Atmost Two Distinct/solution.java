class Solution {
    public int totalElements(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int left = 0,ans = 0;

        for (int right = 0; right < arr.length; right++) {
            map.put(arr[right], map.getOrDefault(arr[right], 0) + 1);

            // 2  se jyda distinct elements
            while (map.size() > 2) {
                map.put(arr[left], map.get(arr[left]) - 1);

                if (map.get(arr[left]) == 0) {
                    map.remove(arr[left]);
                }
                left++;
            }

            // Window has at most 2 distinct elements
            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }
}
