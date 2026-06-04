class Solution {
    public String removeDuplicateLetters(String s) {
        int[] freq = new int[26];
        HashSet<Character> map = new HashSet<>();
        Stack<Character> st = new Stack<>();

        for (char c : s.toCharArray()) freq[c - 'a']++;

        for (char c : s.toCharArray()) {
            freq[c - 'a']--;
            if (map.contains(c)) continue;
            while (!st.isEmpty() && st.peek() > c && freq[st.peek() - 'a'] > 0) {
                map.remove(st.pop());
            }
            st.push(c);
            map.add(c);
        }
        StringBuilder sb = new StringBuilder();
        for (char c : st) sb.append(c);
        return sb.toString();
    }
}