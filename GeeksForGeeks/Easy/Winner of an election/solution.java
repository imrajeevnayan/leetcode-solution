class Solution {
    public List winner(List<String> arr) {
        HashMap<String, Integer> map = new HashMap<>();

        for (String candidate : arr) {
            map.put(candidate, map.getOrDefault(candidate, 0) + 1);
        }

        String winner = "";
        int maxVotes = 0;

        for (String candidate : map.keySet()) {
            int votes = map.get(candidate);

            if (votes > maxVotes || 
                (votes == maxVotes && candidate.compareTo(winner) < 0)) {
                winner = candidate;
                maxVotes = votes;
            }
        }

        List<String> result = new ArrayList<>();
        result.add(winner);
        result.add(String.valueOf(maxVotes));

        return result;
    }
}