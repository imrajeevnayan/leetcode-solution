class Solution {
    public ArrayList<Integer> printList(Node head) {
    ArrayList<Integer>res=new ArrayList<>();
    Node curr=head;
    while(curr!=null){
        res.add(curr.data);
        curr=curr.next;
    }
      return res;  
    }
}