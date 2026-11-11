class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        fun(0,ans,nums,new ArrayList<>());
        return ans;
    }
    private void fun(int i,List<List<Integer>> ans,int [] nums,List<Integer> cur_subset){
        if(i == nums.length){
            ans.add(new ArrayList<>(cur_subset));
            return;
        }
        cur_subset.add(nums[i]);
        fun(i+1,ans,nums,cur_subset);

        cur_subset.remove(cur_subset.size()-1);
        fun(i+1,ans,nums,cur_subset);
    }
}