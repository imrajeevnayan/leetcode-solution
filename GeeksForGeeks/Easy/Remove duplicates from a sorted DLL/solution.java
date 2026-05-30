class Solution {
    Node removeDuplicates(Node headRef) {
        
        Node curr = headRef;
        while (curr != null && curr.next != null) {
            if (curr.data == curr.next.data) {
                curr.next = curr.next.next;
            } 
            else {
                curr = curr.next;
            }
        }
        return headRef;
    }
}