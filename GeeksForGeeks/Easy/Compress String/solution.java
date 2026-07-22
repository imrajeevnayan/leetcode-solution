class Solution {
    public String compressString(String s) {
        s = s.toLowerCase();
        StringBuilder sb=new StringBuilder();
        int count=1;
        for(int i=1;i<=s.length();i++){
            if(i<s.length()&& s.charAt(i)==s.charAt(i-1))count++;
            else{
                sb.append(s.charAt(i-1)).append(count);
                count=1;
            }
        }
        return sb.toString();
    }
}