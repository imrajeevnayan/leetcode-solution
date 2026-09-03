class TimeMap {
    Map<String, List<Pair>> map = new HashMap<>();

    class Pair {
        String value;
        int time;

        Pair(String value, int time) {
            this.value = value;
            this.time = time;
        }
    }

    public TimeMap() {}

    public void set(String key, String value, int timestamp) {
        map.putIfAbsent(key, new ArrayList<>());
        map.get(key).add(new Pair(value, timestamp));
    }

    public String get(String key, int timestamp) {
        if (!map.containsKey(key)) return "";

        List<Pair> list = map.get(key);
        int l = 0, r = list.size() - 1;
        String ans = "";

        while (l <= r) {
            int mid = (l + r) / 2;

            if (list.get(mid).time <= timestamp) {
                ans = list.get(mid).value;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        return ans;
    }
}
