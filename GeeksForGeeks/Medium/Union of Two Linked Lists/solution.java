class Solution {
    public Node makeUnion(Node head1, Node head2) {
        HashSet<Integer> set = new HashSet<>();

        Node temp = new Node(0);
        Node curr = temp;

        while (head1 != null) {
            if (!set.contains(head1.data)) {
                set.add(head1.data);
                curr.next = new Node(head1.data);
                curr = curr.next;
            }
            head1 = head1.next;
        }

        while (head2 != null) {
            if (!set.contains(head2.data)) {
                set.add(head2.data);
                curr.next = new Node(head2.data);
                curr = curr.next;
            }
            head2 = head2.next;
        }

        return temp.next;
    }
}
