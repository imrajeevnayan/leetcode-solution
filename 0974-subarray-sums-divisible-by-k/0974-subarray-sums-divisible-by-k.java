class Solution {
    public int subarraysDivByK(int[] nums, int k) {
    HashMap<Integer,Integer>map=new HashMap<>();
    map.put(0,1);
    int count=0,sum=0;
    for(int n:nums){
        sum+=n;
        int rem=((sum %k)+k)%k;//it handle negative as well as positive number
        if(map.containsKey(rem))count+=map.get(rem);
        map.put(rem,map.getOrDefault(rem,0)+1);
    } 
     return count;   
    }
}