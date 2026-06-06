class Solution {
    public Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
       if(q.isEmpty() || k<=0 || k > q.size()) return q;
       Stack<Integer>st=new Stack<>();
       int rem=q.size()-k;
       for(int i=0;i<k;i++) st.push(q.remove());
       while(!st.isEmpty())q.add(st.pop());
       for(int i=0;i<rem;i++) q.add(q.remove());
       return q;
    }
}