class Solution {
    public String sortVowels(String s) {
        int [] cnt=new int[128];
        char[] ch=s.toCharArray();
        for(char c:ch){
            if(isVowel(c)){
                cnt[c]++;
            }
        }
        int ptr=0;
        for(int i=0;i<ch.length;i++){
            if(isVowel(ch[i])){
                while(cnt[ptr]==0){
                    ptr++;
                }
                ch[i]=(char) ptr;
                cnt[ptr]--;
            }
        }
        return new String(ch);
        
    }
    private boolean c(char c){
        return c=='A' || c=='E' || c=='I' || c=='O' || c=='U';
    }
    private boolean isVowel(char c){
        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u' ||
                c=='A' || c=='E' || c=='I' || c=='O' || c=='U';
               
    }
}