class Solution {
    public ArrayList<Integer> subsetSums(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        cal(0, 0, arr, result);
        Collections.sort(result);
        return result;
    }
    
    private void cal(int index, int currentSum, int[] arr, ArrayList<Integer> result) {
        if (index == arr.length) {
            result.add(currentSum);
            return;
        }
        
        cal(index + 1, currentSum + arr[index], arr, result);
        cal(index + 1, currentSum, arr, result);
    }
}