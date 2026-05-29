class Solution {
    public Deque<Integer> dqInsertion(List<Integer> arr) {
        Deque<Integer> dq = new ArrayDeque<>();

        for (int x : arr) {
            dq.addLast(x);
        }

        return dq;
    }
}
