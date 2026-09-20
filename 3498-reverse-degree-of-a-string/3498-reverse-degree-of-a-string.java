class Solution {
    public int reverseDegree(String s) {
        long ans=0;
        for(int i=0;i<s.length();i++){
            int reverseVal='z'-s.charAt(i)+1;
            ans+=reverseVal *(i+1);
        }
        return(int) ans;
    }
}