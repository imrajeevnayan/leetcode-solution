class Solution {
    int countPairs(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int left = 0, ans = 0;

        for (int right = 0; right < arr.length; right++) {

            if (map.containsKey(arr[right])) {
                left = Math.max(left, map.get(arr[right]) + 1);
            }
            ans += right - left;
            map.put(arr[right], right);
        }
        return ans;
    }
}
