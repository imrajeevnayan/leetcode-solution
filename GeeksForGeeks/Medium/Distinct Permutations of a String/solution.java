class Solution {
    static ArrayList<String> findPermutation(String s) {
        ArrayList<String> ans = new ArrayList<>();
        char[] arr = s.toCharArray();

        permute(arr, 0, ans);
        Collections.sort(ans);

        return ans;
    }

    static void permute(char[] arr, int index, ArrayList<String> ans) {
        if (index == arr.length) {
            ans.add(new String(arr));
            return;
        }

        HashSet<Character> used = new HashSet<>();

        for (int i = index; i < arr.length; i++) {
            if (used.contains(arr[i])) {
                continue;
            }

            used.add(arr[i]);

            swap(arr, index, i);
            permute(arr, index + 1, ans);
            swap(arr, index, i); // backtrack
        }
    }

    static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}