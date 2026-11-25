class Solution {
    public int mostFrequentEven(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int num : nums) {
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }
        int ans=-1;
        int maxfreq=0;
        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            int key = entry.getKey();
            int freq = entry.getValue();
            if(key%2==0 && (freq>maxfreq || (freq==maxfreq && key<ans))){
                maxfreq=freq;
                ans=key;
            }
        }
        return ans;
    }
}