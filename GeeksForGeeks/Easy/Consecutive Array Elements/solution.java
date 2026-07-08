class Solution {
    public boolean areConsecutives(int[] arr) {
        HashSet<Integer>set=new HashSet<>();
        int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(set.contains(arr[i]))return false;
            set.add(arr[i]);
            max=Math.max(max,arr[i]);
            min=Math.min(min,arr[i]);
        }
        for(int i=min;i<=max;i++){
            if(!set.contains(i)) return false;
        }
        return true;
    }
}