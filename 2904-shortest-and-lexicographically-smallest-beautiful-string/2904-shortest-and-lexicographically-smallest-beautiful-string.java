class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        PriorityQueue<String> pq = new PriorityQueue<>(
            (a, b) -> {
                if (a.length() != b.length())
                    return a.length() - b.length();

                return a.compareTo(b);
            }
        );

        int ones = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {

            if (s.charAt(right) == '1')
                ones++;

            while (ones > k) {
                if (s.charAt(left) == '1')
                    ones--;
                left++;
            }

            if (ones == k) {
                while (s.charAt(left) == '0')
                    left++;

                pq.add(s.substring(left, right + 1));
            }
        }

        return pq.isEmpty() ? "" : pq.peek();
    }
}
