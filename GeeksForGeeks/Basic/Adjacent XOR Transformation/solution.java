class Solution {
    public ArrayList<Integer> xorArray(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < arr.length - 1; i++)
            ans.add(arr[i] ^ arr[i + 1]);

        ans.add(arr[arr.length - 1]);

        return ans;
    }
}