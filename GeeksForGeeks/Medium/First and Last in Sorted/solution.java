class Solution {
    ArrayList<Integer> find(int arr[], int x) {
       int first = firstOcc(arr, x);
       int last = lastOcc(arr, x);
       ArrayList<Integer> ans = new ArrayList<>();
        ans.add(first);
        ans.add(last);
        return ans;
    }  
     int firstOcc(int[] arr, int x) {
        int low = 0, high = arr.length - 1,ans = -1;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(arr[mid] == x) {
                ans = mid;
                high = mid - 1;
            }
            else if(arr[mid] < x) low = mid + 1;
            else high = mid - 1;
        }
        return ans;
    }
    int lastOcc(int[] arr, int x) {
        int low = 0, high = arr.length - 1,ans = -1;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(arr[mid] == x) {
                ans = mid;
                low = mid +1;
            }
            else if(arr[mid] < x) low = mid + 1;
            else high = mid - 1;
        }
        return ans;
    }
    
}
