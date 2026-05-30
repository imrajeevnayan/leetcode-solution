class Solution {
    public Node deleteHead(Node head) {
        if (head == null) return null;
        head = head.next;
        return head;
    }
}