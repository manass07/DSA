class Solution {
    public String frequencySort(String s) {
        int n=s.length();
      HashMap<Character,Integer> freq=new HashMap<>();
      for(char ch:s.toCharArray()){
        freq.put(ch,freq.getOrDefault(ch,0)+1);
      }
      List<Character> li=new ArrayList<>(freq.keySet());

      li.sort((a,b)-> freq.get(b)-freq.get(a));

      StringBuilder ans=new StringBuilder();
      for(char ch:li){
        int cnt=freq.get(ch);
        for(int i=0;i<cnt;i++){
            ans.append(ch);
        }
      }
      return ans.toString();
        
    }
}