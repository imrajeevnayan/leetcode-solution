class Solution {
    public int multiply(int[] arr) {
        int mid = arr.length / 2;
        int a = 0, b = 0;

        for (int i = 0; i < mid; i++)
            a += arr[i];

        for (int i = mid; i < arr.length; i++)
            b += arr[i];

        return a * b;
    }
}