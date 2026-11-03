class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int val:nums){
            mp.put(val,mp.getOrDefault(val,0)+1);
        }
        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {  
            Integer key = entry.getKey();
            Integer value=entry.getValue();
            if(value>1){
                ans.add(key);
            }
        }
        return ans;
    }
}