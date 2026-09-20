class Solution {
    int countPairs(int arr[], int target) {
        Map<Integer,Integer>map=new HashMap<>();
        int count=0;
        for(int n:arr){
            int rem=target-n;
            if(map.containsKey(rem)){
                count+=map.get(rem);
            }
            map.put(n,map.getOrDefault(n,0)+1);
        }
        return count;
        
    }
}