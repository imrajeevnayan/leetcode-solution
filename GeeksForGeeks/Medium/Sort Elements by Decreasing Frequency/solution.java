class Solution {
    public ArrayList<Integer> sortByFreq(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr)map.put(num, map.getOrDefault(num, 0) + 1);
        ArrayList<Integer> keys = new ArrayList<>(map.keySet());
        keys.sort((a, b) -> {
            if (!map.get(a).equals(map.get(b))) {
                return map.get(b) - map.get(a);
            }
            return a - b;
        });
        ArrayList<Integer> ans = new ArrayList<>();
        for (int key : keys) {
            int freq = map.get(key);
            while (freq-- > 0) {
                ans.add(key);
            }
        }
        return ans;
    }
}