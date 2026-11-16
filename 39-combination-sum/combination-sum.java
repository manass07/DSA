class Solution {
    private void findCombinations(int i,int [] arr,int tar,List<List<Integer>> ans, List<Integer> ds,int n){
        if(i==n){
            if(tar==0){
                ans.add(new ArrayList<>(ds));
            }
            return ;
        }
        if(arr[i]<=tar){
            ds.add(arr[i]);
            findCombinations(i,arr,tar-arr[i],ans,ds,n);
            ds.remove(ds.size()-1);
        }
        findCombinations(i+1,arr,tar,ans,ds,n);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        int n=candidates.length;
        List<List<Integer>> ans=new ArrayList<>();
        findCombinations(0,candidates,target,ans,new ArrayList<>(),n);
        return ans;
    }
}