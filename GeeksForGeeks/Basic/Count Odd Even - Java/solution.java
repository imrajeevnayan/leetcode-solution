class Solution {
    public static void countOddEven(Integer arr[]) {

        int even = 0, odd = 0;

        for (int n : arr) {
            if (n % 2 == 0) even++;
            else odd++;
        }

        System.out.println(odd + " " + even);
    }
}