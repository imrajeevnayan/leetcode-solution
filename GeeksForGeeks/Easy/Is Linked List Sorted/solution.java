class Solution {
    public boolean isSorted(Node head) {
        if (head == null || head.next == null) return true;
        

        boolean ascending = true;
        boolean descending = true;

        Node curr = head;

        while (curr.next != null) {
            if (curr.data > curr.next.data) {
                ascending = false;
            }

            if (curr.data < curr.next.data) {
                descending = false;
            }
            curr = curr.next;
        }
        return ascending || descending;
    }
}