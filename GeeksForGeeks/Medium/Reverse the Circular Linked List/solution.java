import java.util.Stack;

class Solution {
    public Node reverseCircular(Node head) {
        if (head == null || head.next == head) return head;
        Stack<Node> stack = new Stack<>();
        Node curr = head;
        // push all nodes into stack
        do {
            stack.push(curr);
            curr = curr.next;
        } while (curr != head);

        // new head will be last node
        Node newHead = stack.pop();
        Node temp = newHead;

        // rebuild reversed links
        while (!stack.isEmpty()) {
            temp.next = stack.pop();
            temp = temp.next;
        }

        // make it circular again
        temp.next = newHead;

        return newHead;
    }
}