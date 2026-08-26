class Solution {
    public int KOneSubstr(String s, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int ones = 0, ans = 0;

        for (char c : s.toCharArray()) {
            if (c == '1')  ones++;

            if (map.containsKey(ones - k))
                ans += map.get(ones - k);

            map.put(ones, map.getOrDefault(ones, 0) + 1);
        }

        return ans;
    }
}
