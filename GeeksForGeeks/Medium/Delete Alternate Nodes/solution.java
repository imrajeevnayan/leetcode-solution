
class Solution {
    public void deleteAlt(Node head) {
        if(head==null)return;
        Node curr=head;
        while(curr!=null && curr.next!=null){
            curr.next=curr.next.next;
            curr=curr.next;
        }
        
    }
}