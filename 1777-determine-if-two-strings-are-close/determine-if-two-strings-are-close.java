class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length()!=word2.length()) return false;
        HashMap<Character,Integer> mp1=new HashMap<>();
        for(char ch:word1.toCharArray()){
            mp1.put(ch,mp1.getOrDefault(ch,0)+1);
        }
        HashMap<Character,Integer> mp2=new HashMap<>();
         for(char ch:word2.toCharArray()){
            mp2.put(ch,mp2.getOrDefault(ch,0)+1);
        }
        if (!mp1.keySet().equals(mp2.keySet())) return false;
        
        List<Integer> list1 = new ArrayList<>(mp1.values());
        List<Integer> list2 = new ArrayList<>(mp2.values());
        Collections.sort(list1);
        Collections.sort(list2);
        return list1.equals(list2);


    }
}