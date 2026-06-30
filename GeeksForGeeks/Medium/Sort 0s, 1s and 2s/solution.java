class Solution {
    public void sort012(int[] arr) {
        int zeroCount=0,oneCount=0,twoCount=0;
        for(int n :arr){
            if(n==0)zeroCount++;
            else if(n==1)oneCount++;
            else twoCount++;
        }
        int i=0;
        while(zeroCount-- >0)arr[i++]=0;
        while(oneCount-- >0)arr[i++]=1;
        while(twoCount-- > 0)arr[i++]=2;
    }
}