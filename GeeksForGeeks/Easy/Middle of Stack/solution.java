class Solution {
    public int stackMiddle(Stack<Integer> st) {
        if (st.isEmpty()) throw new RuntimeException("Stack is empty");
        
        Stack<Integer> temp = new Stack<>();
        int mid = st.size() / 2;
        
        for (int i = 0; i < mid; i++) temp.push(st.pop());
        int result = st.peek();
        while (!temp.isEmpty()) st.push(temp.pop());
        
        return result;
    }
}