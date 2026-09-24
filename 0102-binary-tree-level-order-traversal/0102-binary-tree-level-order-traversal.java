class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        // Final answer store karega (har level ki alag list)
        List<List<Integer>> ans = new ArrayList<>();

        // Agar tree empty hai to empty answer return kar do
        if (root == null)  return ans;

        // BFS ke liye Queue use karenge
        Queue<TreeNode> q = new LinkedList<>();

        // Root ko queue me daal do
        q.add(root);

        // Jab tak queue empty na ho
        while (!q.isEmpty()) {

            // Current level me jitne nodes hain unki count
            int n = q.size();

            // Current level ki values store karne ke liye
            List<Integer> list = new ArrayList<>();

            // Sirf current level ke nodes process karo
            for (int i = 0; i < n; i++) {

                // Queue se front node nikalo
                TreeNode curr = q.remove();

                // Current node ki value level list me add karo
                list.add(curr.val);

                // Agar left child hai to next level ke liye queue me add karo
                if (curr.left != null)
                    q.add(curr.left);

                // Agar right child hai to next level ke liye queue me add karo
                if (curr.right != null)
                    q.add(curr.right);
            }

            // Current level complete ho gaya, answer me add kar do
            ans.add(list);
        }

        // Final level order traversal return karo
        return ans;
    }
}