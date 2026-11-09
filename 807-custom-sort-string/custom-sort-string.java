class Solution {
    public String customSortString(String order, String s) {
        HashMap<Character,Integer> freq =new HashMap<>();
        for(char ch : s.toCharArray()){
            freq.put(ch,freq.getOrDefault(ch,0)+1);
        }
        StringBuilder ans= new StringBuilder();

        for(char c : order.toCharArray()){
            if(freq.containsKey(c)){
                int values=freq.get(c);
                for(int i=0;i<values;i++){
                    ans.append(c);
                }
                freq.remove(c);  
            }
        }
        for(char c : freq.keySet()){
            int cnt=freq.get(c);
            for(int i=0;i<cnt;i++){
                ans.append(c);
            }
        }
        return ans.toString();
    }
}