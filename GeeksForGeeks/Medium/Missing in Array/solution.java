class Solution {
    int missingNum(int arr[]) {
        int n=arr.length+1;
        int res=0;
        for(int i=0;i<=n;i++){
            res^=i;
        }
        for(int num :arr) res^=num;
        return res;
        
    }
}