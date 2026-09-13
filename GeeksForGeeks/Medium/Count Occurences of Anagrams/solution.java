class Solution {
    int search(String pat, String txt) {
        int p=pat.length();
        int t=txt.length();
        if(t<p ) return 0;
        int []patfreq=new int[26];
        for(char c:pat.toCharArray()){
            patfreq[c-'a']++;
        }
        int currFreq[]=new int[26]; 
        int count=0,left=0;
        
        for(int right=0;right<t;right++){
            currFreq[txt.charAt(right)-'a']++;
            if(right-left+1==p){
                if(Arrays.equals(currFreq,patfreq))count++;
                currFreq[txt.charAt(left)-'a']--;
                left++;
            }
        }
        return count;
    }
}
