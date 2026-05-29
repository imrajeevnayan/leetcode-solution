class Solution {
    public void reverseArray(int[] arr) {
        Stack<Integer>st=new Stack<>();
        for(int a :arr)st.add(a);
        int i=0;
        while(!st.isEmpty()){
          arr[i++]= st.pop();
        }
    }
}
