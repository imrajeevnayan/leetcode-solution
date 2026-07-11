class Solution {
    int findFrequency(int arr[], int x) {
        int count=0;
        for(int a: arr){
            if(a==x)count++;
        }
    return count;
    }
}