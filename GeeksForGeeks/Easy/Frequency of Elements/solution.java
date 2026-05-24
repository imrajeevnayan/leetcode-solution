class Solution {
    public ArrayList<ArrayList<Integer>> countFreq(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int num : arr) map.put(num, map.getOrDefault(num, 0) + 1);
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        
        for (int key : map.keySet()) {
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(key);
            temp.add(map.get(key));
            res.add(temp);
        }
        return res;
    }
}