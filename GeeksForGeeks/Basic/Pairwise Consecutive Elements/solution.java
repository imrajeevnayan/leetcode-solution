class GFG {
    public static boolean pairWiseConsecutive(Stack<Integer> st) {
        while (st.size() > 1) {
            int first = st.pop();
            int second = st.pop();
            if (Math.abs(first - second) != 1)return false;
        }
        return true;
    }
}