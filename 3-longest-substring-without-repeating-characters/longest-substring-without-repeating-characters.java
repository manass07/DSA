class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        HashMap<Character,Integer> mp=new HashMap<>();

        int l=0,r=0,maxlen=0;
        while(r<n){
            char c_char=s.charAt(r);
           if(mp.containsKey(c_char)){
            l=Math.max(l,mp.get(c_char)+1);
           }
             mp.put(c_char,r);
           
           int len=r-l+1;
           maxlen=Math.max(len,maxlen);
           r++;
            }
            return maxlen;
        } 

      }
        
    
