class Solution {
    public long firstIndex(int arr[]) {
        int lo=0,hi=arr.length-1,idx=-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]==1){
                idx=mid;
                hi=mid-1;
            }
            else if(arr[mid]<1)lo=mid+1;
            else hi=mid-1;
        }
        return idx;
    }
}