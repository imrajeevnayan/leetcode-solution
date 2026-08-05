class Solution {
    public static ArrayList<Integer> alternateSort(int[] arr) {
        Arrays.sort(arr);
        ArrayList<Integer> ans = new ArrayList<>();
        int left = 0,right = arr.length - 1;

        while (left <= right) {
            if (left != right) {
                ans.add(arr[right]); 
                right--;

                ans.add(arr[left]);  
                left++;
            } else {
                ans.add(arr[left]); 
                left++;
            }
        }
        return ans;
    }
}