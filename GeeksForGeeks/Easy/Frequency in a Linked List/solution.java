class Solution {
    public int count(Node head, int key) {
        int cnt = 0;
        Node curr = head;
    
        while (curr != null) {
            if (curr.data == key) cnt++;
            curr = curr.next;
        }
        return cnt;
    }
}