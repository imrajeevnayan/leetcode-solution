class Solution {
    public List<Integer> reverseLevelOrder(Node root) {
        List<Integer> ans = new ArrayList<>();
        if (root == null) return ans;
        Queue<Node> q = new LinkedList<>();
        List<List<Integer>> levels = new ArrayList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> level = new ArrayList<>();

            while (size-- > 0) {
                Node curr = q.remove();

                level.add(curr.data);

                if (curr.left != null)
                    q.add(curr.left);

                if (curr.right != null)
                    q.add(curr.right);
            }

            levels.add(level);
        }

        // Last level se first level
        for (int i = levels.size() - 1; i >= 0; i--) {
            ans.addAll(levels.get(i));
        }

        return ans;
    }
}
