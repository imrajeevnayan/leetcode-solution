class Solution {
    public ArrayList<ArrayList<Integer>> levelSort(int[] arr) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int i = 0, level = 1;

        while (i < arr.length) {
            ArrayList<Integer> curr = new ArrayList<>();

            for (int j = 0; j < level && i < arr.length; j++) {
                curr.add(arr[i++]);
            }

            Collections.sort(curr);
            ans.add(curr);
            level *= 2;
        }

        return ans;
    }
}