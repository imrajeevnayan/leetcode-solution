class Solution {

    public ArrayList<Node> alternatingSplitList(Node head) {
        ArrayList<Node> result = new ArrayList<>();

        Node head1 = null;
        Node head2 = null;
        Node tail1 = null;
        Node tail2 = null;

        Node curr = head;
        boolean first = true;

        while (curr != null) {
            Node next = curr.next;
            curr.next = null;

            if (first) {
                if (head1 == null) {
                    head1 = curr;
                    tail1 = curr;
                } else {
                    tail1.next = curr;
                    tail1 = curr;
                }
            } else {
                if (head2 == null) {
                    head2 = curr;
                    tail2 = curr;
                } else {
                    tail2.next = curr;
                    tail2 = curr;
                }
            }

            first = !first;
            curr = next;
        }

        result.add(head1);
        result.add(head2);

        return result;
    }
}