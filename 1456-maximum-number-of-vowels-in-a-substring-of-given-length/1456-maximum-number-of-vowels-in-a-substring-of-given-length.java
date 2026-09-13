class Solution {
    private boolean isVowels(char c) {
        return "aeiouAEIOU".indexOf(c)!=-1;
    }
    public int maxVowels(String s, int k) {
        int left=0,count=0,ans=0;
        for(int right=0;right<s.length();right++){
             if(isVowels(s.charAt(right))) count++;
            if(right-left+1==k){
             ans=Math.max(ans,count);
             if(isVowels(s.charAt(left)))count--;
             left++;
            }
        }
        return ans;
    }
}