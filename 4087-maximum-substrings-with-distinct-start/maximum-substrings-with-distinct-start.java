class Solution {
    public int maxDistinct(String s) {
        HashMap<Character,Integer> mp=new HashMap<>();
        for(char ch: s.toCharArray()){
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }
        return mp.size();
        
    }
}