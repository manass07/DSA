class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == divisor) return 1;
        boolean sign = true;
        if (dividend >= 0 && divisor < 0) sign = false;
        if (dividend < 0 && divisor >= 0) sign = false;
        long n = Math.abs((long) dividend);
        long d = Math.abs((long) divisor); 
        
        if (d > n) return 0; 

        long ans = 0;
        while (n >= d) {
            long cnt = 0;
            while (n >= (d << (cnt + 1))) {
                cnt++;
            }
            ans += 1L << cnt;
            n = n - (d << cnt);
        }
        if (ans >= (1L << 31) && sign == true) return Integer.MAX_VALUE;
        if (ans >= (1L << 31) && sign == false) return Integer.MIN_VALUE;
        int finalAns = (int) ans;

        return sign ? finalAns : -finalAns;
    }
}