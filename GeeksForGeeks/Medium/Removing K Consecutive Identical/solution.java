import java.util.*;

class Solution {
    public String reducedString(int k, String s) {
        
        if (k == 1) {
            return "";
        }

        Stack<Character> st = new Stack<>();
        Stack<Integer> cnt = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (!st.isEmpty() && st.peek() == ch) {
                int c = cnt.pop() + 1;

                if (c == k) {
                    st.pop();
                } else {
                    cnt.push(c);
                }
            } else {
                st.push(ch);
                cnt.push(1);
            }
        }

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < st.size(); i++) {
            ans.append(String.valueOf(st.get(i)).repeat(cnt.get(i)));
        }

        return ans.toString();
    }
}