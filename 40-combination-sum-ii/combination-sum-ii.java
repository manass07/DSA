class Solution {
    private void findComb(int i,int [] arr,int tar, List<List<Integer>> ans,List<Integer> ds,int n){
        if(i==n){
            if(tar==0){
                ans.add(new ArrayList<>(ds));
            }
            return ;
        }
        if(arr[i]<=tar){
            ds.add(arr[i]);
            findComb(i+1,arr,tar-arr[i], ans,ds,n);
            ds.remove(ds.size()-1);
        }
        while(i+1 < n && arr[i]==arr[i+1]){
            i++;
        }
        findComb(i+1,arr,tar,ans,ds,n);
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans=new ArrayList<>();
        int n=candidates.length;
        findComb(0,candidates,target,ans,new ArrayList<>(),n);
        return ans;
        
    }
}