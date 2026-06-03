class Solution {
    public int gcd(int n, int arr[]) {
        int result = arr[0];

        for (int i = 1; i < n; i++) {
            result = findGCD(result, arr[i]);
        }

        return result;
    }

    private int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}