class Solution {
    public int mostFreqEle(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int x : arr) map.put(x, map.getOrDefault(x, 0) + 1);

        int max = 0, ans = 0;

        for (int x : map.keySet()) {
            if (map.get(x) > max || 
                (map.get(x) == max && x > ans)) {
                max = map.get(x);
                ans = x;
            }
        }

        return ans; 
        
    }
}