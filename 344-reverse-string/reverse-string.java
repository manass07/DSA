class Solution {
    public void reverseString(char[] s) {
      f(s,0);    
    }
    private void f(char[] s,int i){
        int n=s.length;
        if(i>=n/2) return;
        swap(s,i,n-i-1);
        f(s,i+1);
    }
    private void swap(char[] s,int i,int j){
        char temp=s[i];
        s[i]=s[j];
        s[j]=temp;
    }
}