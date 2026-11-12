class Solution {
    public boolean check(int[] nums) {
        return f(nums,0,0);
    }
    private boolean f(int[] nums, int i, int cnt) {
        int n = nums.length;
        if(i==n) return cnt<=1;
        
        if(nums[i] > nums[(i+1)%n]) cnt++;
        if(cnt>1) return false;

        return f(nums,i+1,cnt);
}
}