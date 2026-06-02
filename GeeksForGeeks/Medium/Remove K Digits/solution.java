import java.util.*;

class Solution {
    public String removeKdig(String s, int k) {
        Stack<Character> st = new Stack<>();

        for (char c : s.toCharArray()) {
            while (!st.isEmpty() && k > 0 && st.peek() > c) {
                st.pop();
                k--;
            }
            st.push(c);
        }

        while (k-- > 0) st.pop();

        StringBuilder sb = new StringBuilder();
        for (char c : st) sb.append(c);

        int i = 0;
        while (i < sb.length() && sb.charAt(i) == '0') i++;

        String res = sb.substring(i);
        return res.isEmpty() ? "0" : res;
    }
}