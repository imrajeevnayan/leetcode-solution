class Solution {
    public int inOrderSuccessor(Node root, Node k) {

        Node successor = null;

        while (root != null) {

            if (k.data < root.data) {
                successor = root;
                root = root.left;
            } 
            else {
                root = root.right;
            }
        }
        return successor == null ? -1 : successor.data;
    }
}