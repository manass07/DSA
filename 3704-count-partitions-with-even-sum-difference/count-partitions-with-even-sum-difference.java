class Solution {
    public int countPartitions(int[] nums) {
        int n=nums.length;
        int totalsum=0;
        int cnt=0;
        for(int i=0;i<n;i++){
            totalsum+=nums[i];
        }
       int diff=0;
       int lsum=0;
       for(int j=0;j<n-1;j++){
        lsum+=nums[j];
        diff=2*lsum-totalsum;
        if(diff%2==0) cnt++;

       }
       return cnt;
    }
}