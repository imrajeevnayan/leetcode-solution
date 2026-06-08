class Solution {
    String to_upper(String str) {
        char[]ch=str.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i] >='a'&& ch[i]<='z'){
                ch[i]=(char)(ch[i]-32);
            }
        }
        return new String(ch);
    }
}