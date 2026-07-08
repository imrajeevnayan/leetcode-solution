class Solution {
    public int lengthOfLongestSubstring(String s) {
       Set<Character>set=new HashSet<>();
       int start=0,maxLen=0;
       for(int end=0;end<s.length();end++){
          char ch=s.charAt(end);
          while(set.contains(ch)){
             set.remove(s.charAt(start));
             start++;
        }
        set.add(ch);
        maxLen=Math.max(maxLen,end-start+1); ///1 bcq of 0 based  indexing
       }
       return maxLen;
    }
}