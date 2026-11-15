class Solution {
    public int numOfSubarrays(int[] arr) {
        int n=arr.length;
        int mod = 1_000_000_007;
        int cnt = 0;
        int sum = 0;
        int e = 1;
        int o = 0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum%2!=0){
                cnt=(cnt+e)%mod;
                o++;
            }
            else{
                cnt=(cnt+o)%mod;
                e++;
            }
        }
        return cnt;
    }
}