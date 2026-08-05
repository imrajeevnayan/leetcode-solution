class Solution {
    public int minProduct(int[] arr, int k) {
        Arrays.sort(arr);
        long mod = 1000000007L;
        long product = 1;
        for (int i = 0; i < k && i < arr.length; i++) {
            product = (product * arr[i]) % mod;
        }
        return (int) product;
    }
}