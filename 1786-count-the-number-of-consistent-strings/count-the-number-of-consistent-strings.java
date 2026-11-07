class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> set=new HashSet<>();
        for(char ch : allowed.toCharArray()){
            set.add(ch);
        }
        int cnt=0;
        for(String w : words){
            boolean contains=true;
            for(int i=0;i<w.length();i++){
                if(!set.contains(w.charAt(i))){
                    contains=false;
                    break;
                }
            } 
            if(contains) cnt++;

        }
        
        return cnt;
    }
}