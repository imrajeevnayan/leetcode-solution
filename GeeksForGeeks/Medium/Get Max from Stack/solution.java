class SpecialStack {
    Stack<Integer> st = new Stack<>();
    Stack<Integer> max = new Stack<>();

    public SpecialStack() {
    }

    public void push(int x) {
        st.push(x);

        if (max.isEmpty() || x >= max.peek())
            max.push(x);
    }

    public void pop() {
        if (st.isEmpty())
            return;

        int x = st.pop();

        if (x == max.peek())
            max.pop();
    }

    public int peek() {
        if (st.isEmpty())
            return -1;

        return st.peek();
    }

    boolean isEmpty() {
        return st.isEmpty();
    }

    public int getMax() {
        if (max.isEmpty())
            return -1;

        return max.peek();
    }
}
