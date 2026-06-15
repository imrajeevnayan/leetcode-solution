class Solution {
    static ArrayList<Integer> nextGreatest(int arr[]) {
        int n = arr.length;
        ArrayList<Integer> result = new ArrayList<>();
        int maxRight = -1;

        for (int i = n - 1; i >= 0; i--) {
            int current = arr[i];
            result.add(maxRight); 
            maxRight = Math.max(maxRight, current);
        }
        Collections.reverse(result);
        return result;
    }
}