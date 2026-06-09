class Solution {
    public double medianOf2(int a[], int b[]) {
        int m=a.length;
        int n=b.length;
        int []merge=new int[n+m];
        int i=0,j=0,k=0;
        while(i<m && j<n){
            if(a[i]<b[j])merge[k++]=a[i++];
            else merge[k++]=b[j++];
        }
        while(i< m)merge[k++]=a[i++];
        while(j<n)merge[k++]=b[j++];
        
        int l=merge.length;
        if(l%2==1) return merge[l/2];
        else return (merge[l/2]+merge[(l/2)-1])/2.0;
        
    }
}