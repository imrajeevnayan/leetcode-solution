class Solution {
    public static void freqSorted(int arr[]) {
        TreeMap<Integer, Integer> map = new TreeMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

       for (Integer key : map.keySet()) {
        System.out.println(key + " " + map.get(key));
         }
    }
}