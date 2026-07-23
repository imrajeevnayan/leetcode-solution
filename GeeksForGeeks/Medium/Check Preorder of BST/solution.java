class Solution {
    public boolean canRepresentBST(List<Integer> arr) {
        Stack<Integer> st = new Stack<>();
        int root = Integer.MIN_VALUE;
        for (int value: arr) {
            if (value < root) return false;
            while (!st.isEmpty() && value >st.peek())root = st.pop();
            st.push(value);
        }
        return true;
    }
}
