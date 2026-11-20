class Solution {
    private boolean ispalindrome(String s,int st,int e){
            while(st<=e){
                if(s.charAt(st++)!=s.charAt(e--))
                    return false;
            }
            return true;
        }
    private void solve(String s,int ind, List<List<String>> ans,List<String> ds){
        if(ind==s.length()){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=ind;i<s.length();++i){
            if(ispalindrome(s,ind,i)){
                ds.add(s.substring(ind,i+1));
                solve(s,i+1,ans,ds);
                ds.remove(ds.size()-1);
            }
        }
        
    }
    public List<List<String>> partition(String s){
        List<List<String>> ans=new ArrayList<>();
        List<String> ds=new ArrayList<>();
        solve(s,0,ans,ds);
        return ans;

    }
}