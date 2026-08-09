class Sol {
    int getCount(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (i == 0 || s.charAt(i - 1) != ch) {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
        }
        int count = 0;
        for (char ch : map.keySet()) {
            if (map.get(ch) == k) {
                count++;
            }
        }
        return count;
    }
}