class Solution {
    public int kthElement(int a[], int b[], int k) {
        int c[]=new int [a.length+b.length];
        int i=0,j=0,l=0;
        while(i<a.length && j<b.length ){
            if(a[i]<b[j])c[l++]=a[i++];
            else c[l++]=b[j++];
        }
        while(i<a.length)c[l++]=a[i++];
        while(j<b.length)c[l++]=b[j++];
        return c[k-1];
    }
}