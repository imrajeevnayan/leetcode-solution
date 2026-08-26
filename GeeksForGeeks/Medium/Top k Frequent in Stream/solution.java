class Solution {
    public ArrayList<ArrayList<Integer>> kTop(int k, int[] arr) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int x : arr) {
            map.put(x, map.getOrDefault(x, 0) + 1);

            ArrayList<Integer> list = new ArrayList<>(map.keySet());

            list.sort((a, b) -> {
                if (map.get(a).equals(map.get(b)))
                    return a - b;
                return map.get(b) - map.get(a);
            });

            ArrayList<Integer> top = new ArrayList<>();

            for (int i = 0; i < Math.min(k, list.size()); i++) {
                top.add(list.get(i));
            }

            ans.add(top);
        }

        return ans;
    }
}
