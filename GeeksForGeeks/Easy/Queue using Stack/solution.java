class myQueue {
    ArrayList<Integer> q = new ArrayList<>();

    void enqueue(int x) {
        q.add(x);
    }
    void dequeue() {
        if (!q.isEmpty()) {
            q.remove(0);
        }
    }
    int front() {
        if (!q.isEmpty()) {
            return q.get(0);
        }
        return -1;
    }

    int size() {
        return q.size();
    }
}