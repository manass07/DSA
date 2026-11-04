class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer,Integer> fr=new HashMap<>();
        for(int num: nums){
            fr.put(num,fr.getOrDefault(num,0)+1);
        }
        int [] ans=new int[2];
        int i=0;
         for (int num : fr.keySet()) {
            if (fr.get(num) == 1) {
                ans[i]=num;
                i++;
            }
         }
        return ans;
    }
}