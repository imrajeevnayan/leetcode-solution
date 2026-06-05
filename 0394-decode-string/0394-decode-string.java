class Solution {
    public String decodeString(String s) {
        Stack<Integer> nums = new Stack<>();
        Stack<StringBuilder> strs = new Stack<>();
        StringBuilder cur = new StringBuilder();
        int n = 0;
        
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                n = n * 10 + (c - '0');
            } else if (c == '[') {
                nums.push(n);
                strs.push(cur);
                cur = new StringBuilder();
                n = 0;
            } else if (c == ']') {
                int k = nums.pop();
                StringBuilder prev = strs.pop();
                for (int i = 0; i < k; i++) prev.append(cur);
                cur = prev;
            } else {
                cur.append(c);
            }
        }
        return cur.toString();
    }
}