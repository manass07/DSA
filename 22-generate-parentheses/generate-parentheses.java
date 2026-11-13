class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        solve(ans,"",n,n);
        return ans;
    }
    private void solve(List<String> result, String s, int open, int close) {

        if (open == 0 && close == 0) {
            result.add(s);
            return;
        }
        if (open > 0) {
            solve(result, s + '(', open - 1, close);
        }
        if (close > 0 && close > open) {
            solve(result, s + ')', open, close - 1);
        }
    }
}