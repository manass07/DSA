class Solution {
    public int elevatorRequests(int n, int[] req) {
        int m=req.length;
        int sum=0;
        int cur=0;
        for(int i=0;i<m;i++){
            sum+=Math.abs(req[i]-cur);
            cur=req[i];   
        }
        return sum;
    
    }
}