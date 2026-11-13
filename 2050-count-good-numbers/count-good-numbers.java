class Solution {
    long MOD = 1_000_000_007;
    public int countGoodNumbers(long n) {
        long even=n/2+n%2;
        long odd=n/2;
        long ans = (pow(5, even) * pow(4, odd))%MOD;
        return (int) ans;    
    }
    private long pow(long x,long y){
        if(y==0) return 1;
        long ans=pow(x,y/2);
        ans*=ans;
        ans%=MOD;
        if(y%2==1) ans*=x;
        ans%=MOD;
        return ans;
    }
}