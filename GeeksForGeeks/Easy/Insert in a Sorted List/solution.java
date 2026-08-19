class Solution {
    public Node sortedInsert(Node head, int key) {
        Node newNode = new Node(key);

        if (head == null || key <= head.data) {
            newNode.next = head;
            return newNode;
        }

        Node temp = head;

        while (temp.next != null && temp.next.data < key) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;

        return head;
    }
}