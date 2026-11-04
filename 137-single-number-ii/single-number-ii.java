class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> fr=new HashMap<>();
        for(int num: nums){
            fr.put(num,fr.getOrDefault(num,0)+1);
        }
          for (int num : fr.keySet()) {
            if (fr.get(num) == 1) {
                return num;
            }
        }
        return -1;
    }
}