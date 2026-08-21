class Solution {
    public Stack<Integer> cloneStack(Stack<Integer> st) {
        Stack<Integer> temp = new Stack<>();

        for (int x : st)  temp.push(x);
        return temp;
    }
}
