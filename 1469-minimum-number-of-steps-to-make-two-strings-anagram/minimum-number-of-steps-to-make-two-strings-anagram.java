class Solution {
    public int minSteps(String s, String t) {
        int cnt=0;
        HashMap<Character,Integer> mp=new HashMap<>();
        for(char ch:s.toCharArray()){
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }
           for(char ch:t.toCharArray()){
            mp.put(ch,mp.getOrDefault(ch,0)-1);
        }
        int ans=0;
        for (Map.Entry<Character, Integer> entry : mp.entrySet()){
            if(entry.getValue() > 0) ans+=entry.getValue();
        } 
        return ans;
    }
}