class Solution {
    public String frequencySort(String s) {
        int[] freq = new int[26];

        // Count frequencies
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        List<int[]> list = new ArrayList<>();

        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                list.add(new int[]{i, freq[i]});
            }
        }

        // Sort by frequency, then lexicographically
        Collections.sort(list, (a, b) -> {
            if (a[1] != b[1]) {
                return a[1] - b[1];
            }
            return a[0] - b[0];
        });

        StringBuilder ans = new StringBuilder();

        for (int[] p : list) {
            for (int i = 0; i < p[1]; i++) {
                ans.append((char) ('a' + p[0]));
            }
        }

        return ans.toString();
    }
}