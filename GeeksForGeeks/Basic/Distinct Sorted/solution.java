class Solution {
    public ArrayList<Integer> uniqueSorted(int arr[]) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int num : arr)set.add(num);
        return new ArrayList<>(set);
    }
}