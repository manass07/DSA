class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n=nums.length;
        int[] ans=new int[k];
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int num : nums){
            mp.put(num,mp.getOrDefault(num,0)+1);
        }
        for(int i=0;i<k;i++){
            int maxfreq=0;
            int maxkey=0;
             for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            int key = entry.getKey();
            int freq = entry.getValue();
            if(freq>maxfreq){
                maxfreq=freq;
                maxkey=key;
            }
        }
        ans[i]=maxkey;
        mp.remove(maxkey);
        }
        
        return ans;
    }
}