class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        for (int x : nums) list.add(x);

        backtrack(list, new ArrayList<>(), ans);

        return ans;
    }

    void backtrack(List<Integer> remaining,
                   List<Integer> current,
                   List<List<Integer>> ans) {

        if (remaining.size() == 0) {
            ans.add(new ArrayList<>(current));
            return;
        }

        for (int i = 0; i < remaining.size(); i++) {

            int val = remaining.get(i);

            List<Integer> next = new ArrayList<>(remaining);
            next.remove(i);

            current.add(val);

            backtrack(next, current, ans);

            current.remove(current.size() - 1);
        }
    }
}