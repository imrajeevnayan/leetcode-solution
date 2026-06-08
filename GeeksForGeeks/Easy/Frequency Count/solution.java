class Solution {
    public ArrayList<Integer> frequencyCount(int[] arr) {
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();

        for (int num:arr)map.put(num, map.getOrDefault(num, 0) + 1);
        
        ArrayList<Integer> result = new ArrayList<>();
        for (int val : map.values()) {
            result.add(val);
        }
        return result;
    }
}