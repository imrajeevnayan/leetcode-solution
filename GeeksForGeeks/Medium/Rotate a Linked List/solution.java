class Solution {
    public Node rotate(Node head, int k) {
        
        // Agar list empty hai ya sirf ek node hai
        // ya k = 0 hai, toh kuch change nahi karna
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        // Pehle list ki length aur last node find karo
        int n = 1;
        Node tail = head;

        while (tail.next != null) {
            tail = tail.next;
            n++;
        }

        // Agar k length se bada hai,
        // toh k ko chhota kar do
        k = k % n;

        if (k == 0) {
            return head;
        }

        // k-th node tak jao
        Node curr = head;

        for (int i = 1; i < k; i++) {
            curr = curr.next;
        }

        // curr ke next wala node new head hoga
        Node newHead = curr.next;

        // Last node ko purane head se connect karo
        tail.next = head;

        // k-th node ke baad connection tod do
        curr.next = null;

        // New head return karo
        return newHead;
    }
}
