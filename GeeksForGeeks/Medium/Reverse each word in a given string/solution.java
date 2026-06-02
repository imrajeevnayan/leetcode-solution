class Solution {
    public String reverseWords(String s) {
    StringBuilder sb=new StringBuilder();
     String w[]=s.trim().split("\\s+");
     for(int i=0;i< w.length;i++){
         sb.append(new StringBuilder(w[i]).reverse());
         if(i!=w.length-1)sb.append(" ");
     }
     return sb.toString();
        
    }
}
