class TweetCounts {
    Map<String, List<Integer>> map;

    public TweetCounts() {
        map = new HashMap<>();
    }

    public void recordTweet(String tweetName, int time) {
        map.putIfAbsent(tweetName, new ArrayList<>());
        map.get(tweetName).add(time);
    }

    public List<Integer> getTweetCountsPerFrequency(
            String freq,
            String tweetName,
            int startTime,
            int endTime
    ) {

        List<Integer> times = map.getOrDefault(tweetName, new ArrayList<>());

        Collections.sort(times); // ensure order

        int interval = 1;

        if (freq.equals("minute")) interval = 60;
        else if (freq.equals("hour")) interval = 3600;
        else if (freq.equals("day")) interval = 86400;

        int size = (endTime - startTime) / interval + 1;
        int[] result = new int[size];

        for (int t : times) {
            if (t < startTime || t > endTime) continue;

            int idx = (t - startTime) / interval;
            result[idx]++;
        }

        List<Integer> ans = new ArrayList<>();
        for (int v : result) ans.add(v);

        return ans;
    }
}