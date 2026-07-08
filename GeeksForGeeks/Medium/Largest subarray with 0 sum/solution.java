class Solution {
    int maxLength(int arr[]) {
    HashMap<Integer,Integer>map=new HashMap<>();
    map.put(0,-1);
    int psum=0,ans=0;
    for(int i=0;i<arr.length;i++){
        psum+=arr[i];
        if(map.containsKey(psum)){
         ans=Math.max(ans,i-map.get(psum));
        }
        else{
            map.put(psum,i);
        }
    }
       return ans; 
    }
}