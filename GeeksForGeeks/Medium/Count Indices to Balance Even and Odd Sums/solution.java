class Solution {
    public int cntWays(int[] arr) {
        int even = 0, odd = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0)
                even += arr[i];
            else
                odd += arr[i];
        }

        int leftEven = 0, leftOdd = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            if (i % 2 == 0)
                even -= arr[i];
            else
                odd -= arr[i];

            if (leftEven + odd == leftOdd + even)
                count++;

            if (i % 2 == 0)
                leftEven += arr[i];
            else
                leftOdd += arr[i];
        }

        return count;
    }
}
