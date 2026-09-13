class Solution {
    ArrayList<Integer> countDistinct(int arr[], int k) {
     ArrayList<Integer>res=new ArrayList<>();
     int n=arr.length;
     if(k>n)return res;
     Map<Integer,Integer>map=new HashMap<>();
     int left=0;
     for(int right=0;right<n;right++){
         map.put(arr[right],map.getOrDefault(arr[right],0)+1);
         if(right-left+1==k){
             res.add(map.size());
             int leftVal=arr[left];
             map.put(leftVal,map.getOrDefault(leftVal,0)-1);
             if(map.get(leftVal)==0)map.remove(leftVal);
             left++;
         }
     }
     return res;
        
    }
}