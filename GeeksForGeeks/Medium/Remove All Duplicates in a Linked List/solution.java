class Solution {
    public Node removeDuplicates(Node head) {
        // Dummy node use karte hain (easy handling ke liye)
        Node dummy = new Node(0);
        dummy.next = head;

        Node prev = dummy;
        Node current = head;

        while (current != null) {
            // Check karo current node ke aage duplicates hain ya nahi
            boolean isDuplicate = false;

            while (current.next != null && current.data == current.next.data) {
                isDuplicate = true;
                current = current.next;  // saare duplicates skip karo
            }

            if (isDuplicate) {
                // Saare duplicates hata do
                prev.next = current.next;
            } else {
                // Unique hai → prev aage badhao
                prev = prev.next;
            }

            current = current.next;
        }

        return dummy.next;
    }
}