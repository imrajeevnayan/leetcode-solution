class Solution {
    public String reverseParentheses(String s) {

        Stack<String> stack = new Stack<>();
        StringBuilder current = new StringBuilder();

        for (char ch : s.toCharArray()) {

            if (ch == '(') {
                // Current string ko save karo
                stack.push(current.toString());

                // Naya substring start karo
                current = new StringBuilder();

            } 
            else if (ch == ')') {
                // Current substring reverse karo
                current.reverse();

                // Previous string ke saath jodo
                String previous = stack.pop();

                current = new StringBuilder(previous + current);
            } 
            else {
                // Normal character
                current.append(ch);
            }
        }

        return current.toString();
    }
}
