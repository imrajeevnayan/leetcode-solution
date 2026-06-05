class Solution {
    public int maxVowels(String s, int k) {
     String vow = "aeiou";
      int curr = 0, max = 0;
      for (int i = 0; i < k; i++) {
       if (vow.indexOf(s.charAt(i)) != -1) curr++;
         }
      max = curr;
     for (int i = k; i < s.length(); i++) {
     if (vow.indexOf(s.charAt(i)) != -1) curr++;
     if (vow.indexOf(s.charAt(i - k)) != -1) curr--; 
     max = Math.max(max, curr);
       }
     return max;    
    }
}