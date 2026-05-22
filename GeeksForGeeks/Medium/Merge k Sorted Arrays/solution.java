class Solution {
    static class Node {
        int val, row, col;
        Node(int val, int row, int col) {
            this.val = val;
            this.row = row;
            this.col = col;
        }
    }
    public ArrayList<Integer> mergeArrays(int[][] mat) {

        PriorityQueue<Node> pq =
                new PriorityQueue<>((a, b) -> a.val - b.val);

        ArrayList<Integer> res = new ArrayList<>();

        int k = mat.length;

        // add first element of each row
        for (int i = 0; i < k; i++) {
            pq.add(new Node(mat[i][0], i, 0));
        }

        while (!pq.isEmpty()) {

            Node curr = pq.poll();
            res.add(curr.val);

            int r = curr.row;
            int c = curr.col;

            if (c + 1 < mat[r].length) {
                pq.add(new Node(mat[r][c + 1], r, c + 1));
            }
        }

        return res;
    }
}