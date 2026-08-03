class Solution {
    public boolean validateOp(int[] a, int[] b) {
        Stack<Integer> stack = new Stack<>();
        int j = 0;
        for (int x : a) {
            stack.push(x);
            while (!stack.isEmpty() && j < b.length && stack.peek() == b[j]) {
                stack.pop();
                j++;
            }
        }
        return j == b.length;
    }
}