class Solution {
    int findSum(int[] arr) {
        int sum=0;
        Set<Integer>s=new HashSet<>();
        for(int n:arr){
            if(s.add(n))sum+=n;
        }
        return sum;
    }
}