class Solution {
    public boolean searchKey(Node head, int key) {
        Node curr=head;
        while(curr!=null){
            if(key==curr.data)return true;
            curr=curr.next;
        }
        return false;
    }
}