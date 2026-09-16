public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        
        ListNode a = headA, b = headB;
        
        while (a != b) {
            a = (a == null) ? headB : a.next; // khatam? doosri list pe jump
            b = (b == null) ? headA : b.next;
        }
        return a; // intersection node YA null (dono case sahi)
    }
}