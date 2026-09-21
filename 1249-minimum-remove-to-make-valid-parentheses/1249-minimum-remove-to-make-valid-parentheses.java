class Solution {
    public String minRemoveToMakeValid(String s) {
         Deque<Integer> stack = new ArrayDeque<>();
       Set<Integer> removeIndices = new HashSet<>();
    
    for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) == '(') {
            stack.push(i);
        } else if (s.charAt(i) == ')') {
            if (stack.isEmpty()) removeIndices.add(i); // unmatched )
            else stack.pop();
        }
    }
    // Remaining ( in stack are unmatched
    while (!stack.isEmpty()) removeIndices.add(stack.pop());
    
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < s.length(); i++) {
        if (!removeIndices.contains(i)) sb.append(s.charAt(i));
    }
    return sb.toString();
    }
}