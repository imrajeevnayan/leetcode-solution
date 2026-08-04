class Solution {
    public static Stack<Integer> push(int arr[]) {
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < arr.length; i++)  s.push(arr[i]);
        return s;
    }
    public static void printAndPop(Stack<Integer> s) {
        while (!s.isEmpty()) {
            System.out.print(s.pop() + " ");
        }
    }
}