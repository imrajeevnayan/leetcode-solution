class Solution {
    public int[] dupLastIndex(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int index = -1;
        int value = -1;

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                index = i;
                value = arr[i];
            }
            map.put(arr[i], i);
        }

        return new int[]{index, value};
    }
}