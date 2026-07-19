class Solution {
    public ArrayList<Node> findAnagrams(Node head, String str) {
        ArrayList<Node> ans = new ArrayList<>();

        if (head == null || str.length() == 0)
            return ans;

        int k = str.length();

        int[] target = new int[26];
        for (char ch : str.toCharArray()) {
            target[ch - 'a']++;
        }

        int[] window = new int[26];

        Node start = head;
        Node end = head;
        int count = 0;

        while (end != null) {
            window[end.data - 'a']++;
            count++;

            if (count == k) {
                if (matches(target, window)) {
                    ans.add(start);

                    // Break the anagram from the original list
                    Node next = end.next;
                    end.next = null;
                    start = next;
                    end = next;
                    window = new int[26];
                    count = 0;
                    continue;
                }

                // Slide the window
                window[start.data - 'a']--;
                start = start.next;
                count--;
            }

            end = end.next;
        }

        return ans;
    }

    private boolean matches(int[] a, int[] b) {
        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i])
                return false;
        }
        return true;
    }
}