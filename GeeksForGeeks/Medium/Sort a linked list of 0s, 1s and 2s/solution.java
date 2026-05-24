class Solution {
    static Node segregate(Node head) {

        Node zH = new Node(-1), oH = new Node(-1), tH = new Node(-1);
        Node z = zH, o = oH, t = tH;

        Node cur = head;

        while (cur != null) {

            if (cur.data == 0) {
                z.next = cur;
                z = z.next;
            }
            else if (cur.data == 1) {
                o.next = cur;
                o = o.next;
            }
            else {
                t.next = cur;
                t = t.next;
            }

            cur = cur.next;
        }

        z.next = (oH.next != null) ? oH.next : tH.next;
        o.next = tH.next;
        t.next = null;

        return zH.next;
    }
}