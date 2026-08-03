class Solution {
    public ArrayList<Integer> mergeThree(int[] a, int[] b, int[] c) {
        ArrayList<Integer> ans = new ArrayList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int x : a) pq.add(x);
        for (int x : b) pq.add(x);
        for (int x : c) pq.add(x);

        while (!pq.isEmpty()) ans.add(pq.poll());
        return ans;
    }
}