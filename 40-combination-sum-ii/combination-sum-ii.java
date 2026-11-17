class Solution {
    private void findComb(int ind,int [] arr,int tar, List<List<Integer>> ans,List<Integer> ds){
        if(tar==0){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=ind;i<arr.length;i++){
            if(i > ind && arr[i]==arr[i-1]) continue;
            if(arr[i]>tar) break;
            ds.add(arr[i]);
            findComb(i+1,arr,tar-arr[i],ans,ds);
            ds.remove(ds.size()-1);

        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans=new ArrayList<>();
        findComb(0,candidates,target,ans,new ArrayList<>());
        return ans;
        
    }
}