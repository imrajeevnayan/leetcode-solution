class Solution {
    public Node insertionSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node sorted = null;
        Node curr = head;

        while (curr != null) {
            Node next = curr.next;

            // Insert at beginning
            if (sorted == null || curr.val <= sorted.val) {
                curr.next = sorted;
                sorted = curr;
            } else {
                Node temp = sorted;

                while (temp.next != null && temp.next.val < curr.val) {
                    temp = temp.next;
                }

                curr.next = temp.next;
                temp.next = curr;
            }

            curr = next;
        }

        return sorted;
    }
}