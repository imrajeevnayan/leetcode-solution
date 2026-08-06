class Solution {
    public void sortByLength(String[] arr) {
        Arrays.sort(arr, (a, b) -> a.length() - b.length());
    }
}
