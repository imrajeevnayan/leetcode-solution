class myStack {
    Queue<Integer> q = new LinkedList<>();

    void push(int x) {
        q.add(x);
    }

    void pop() {
        if (q.isEmpty()) return;
        // Rotate until the last element is at the front
        for (int i = 0; i < q.size() - 1; i++) {
            q.add(q.poll());
        }
        q.poll(); // Remove the last element (now at front)
    }

    int top() {
        if (q.isEmpty()) return -1;
        // Rotate until the last element is at the front
        for (int i = 0; i < q.size() - 1; i++) {
            q.add(q.poll());
        }
        int res = q.peek();
        q.add(q.poll()); // Put it back at the end to maintain order
        return res;
    }

    int size() {
        return q.size();
    }
}