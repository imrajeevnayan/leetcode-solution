class Solution {
    public ArrayList<Integer> findRepeating(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                int value = arr[i];
                int count = 1;

                // Count all occurrences
                int j = i - 1;
                while (j >= 0 && arr[j] == value) {
                    count++;
                    j--;
                }

                j = i + 1;
                while (j < arr.length && arr[j] == value) {
                    count++;
                    j++;
                }

                ans.add(value);
                ans.add(count);

                return ans;
            }
        }

        ans.add(-1);
        ans.add(-1);

        return ans;
    }
}