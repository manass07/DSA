class Solution {
    private void findComb(int ind, int[] arr, int tar, List<List<Integer>> ans, List<Integer> ds,int cnt,int k) {
        if(cnt > k){
            return;
        }
        if (cnt==k && tar == 0) {
            ans.add(new ArrayList<>(ds));
            return;
        }
        for (int i = ind; i < arr.length; i++) {
            if (i > ind && arr[i] == arr[i - 1])
                continue;
            if (arr[i] > tar)
                break;
            ds.add(arr[i]);
            findComb(i + 1, arr, tar - arr[i], ans, ds,cnt+1,k);
            ds.remove(ds.size() - 1);

        }
    }

    public List<List<Integer>> combinationSum3(int k, int n) {
        int[] candidates = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int cnt = 0;
        int target = n;
        List<List<Integer>> ans = new ArrayList<>();
        findComb(0, candidates, target, ans, new ArrayList<>(), cnt, k);
        return ans;

    }
}