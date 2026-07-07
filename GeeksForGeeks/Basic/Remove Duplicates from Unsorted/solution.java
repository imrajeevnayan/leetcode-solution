class Solution {
    static ArrayList<Integer> removeDuplicate(int arr[]) {
        ArrayList<Integer> ans = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        for (int x : arr) {
            if (!set.contains(x)) {
                set.add(x);
                ans.add(x);
            }
        }

        return ans;
    }
}