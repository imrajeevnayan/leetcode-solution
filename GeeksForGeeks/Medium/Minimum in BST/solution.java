class Solution {
    public int minValue(Node root) {
       if(root==null) return -1;
       Node curr=root;
       while(curr.left!=null){
           curr=curr.left;
       }
       return curr.data;
    }
}