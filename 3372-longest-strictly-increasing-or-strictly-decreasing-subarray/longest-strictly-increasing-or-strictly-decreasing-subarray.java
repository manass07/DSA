class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int n=nums.length;
        int maxlen=1;
        for(int i=0;i<n;i++){
            int inclen=1;
            for(int j=i+1;j<n;j++){
                if(nums[j]>nums[j-1]) inclen++;
                else break;
            }
        maxlen = Math.max(maxlen, inclen);

        int declen=1;
        for(int j=i+1;j<n;j++){
            if(nums[j]<nums[j-1]){
                declen++;
            }
            else break;
        }
        maxlen = Math.max(maxlen, declen);
        }
        return maxlen;
    }
}