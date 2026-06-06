class Geeks {
    static void enqueue(Queue<Integer> q, int k) {
        q.add(k);
    }

    static int findFrequency(Queue<Integer> q, int k) {
        int count = 0;
        // Iterate through the queue to count occurrences of k
        for (int num : q) {
            if (num == k) {
                count++;
            }
        }
        return count;
    }
}