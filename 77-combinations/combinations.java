class Solution {
    private void comb(int ind,int n, int k,List<Integer> ds,List<List<Integer>> ans){
        if(ds.size()==k){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=ind;i<=n;i++){
            ds.add(i);
            comb(i+1,n,k,ds,ans);
            ds.remove(ds.size()-1);
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans=new ArrayList<>();
        comb(1,n,k,new ArrayList<>(),ans);
        return ans;
    }
}