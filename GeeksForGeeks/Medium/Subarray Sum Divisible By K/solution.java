class Solution {
    public int subCount(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        long sum = 0,count = 0;
        for (int num : arr) {
            sum += num;
            int rem =(int) (sum % k);
            // Handle negative remainders
            if (rem < 0) rem += k;
            count += map.getOrDefault(rem, 0);
            map.put(rem, map.getOrDefault(rem, 0) + 1);
        }
        return (int)count;
    }
}