class Solution {
    Node divide(Node head) {
        Node even = new Node(0), odd = new Node(0);
        Node e = even, o = odd;

        while (head != null) {
            if (head.data % 2 == 0) {
                e.next = head;
                e = e.next;
            } else {
                o.next = head;
                o = o.next;
            }
            head = head.next;
        }

        e.next = odd.next;
        o.next = null;

        return even.next;
    }
}
