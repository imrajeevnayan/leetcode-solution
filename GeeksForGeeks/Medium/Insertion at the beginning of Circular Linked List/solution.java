class Solution {
    public Node insertAtBeginning(Node tail, int key) {
        Node newNode = new Node(key);

        if (tail == null) {
            newNode.next = newNode;
            return newNode;
        }
        newNode.next = tail.next;
        tail.next = newNode;

        return tail;
    }
}