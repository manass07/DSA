class Solution {
    public int compress(char[] chars) {
        int i=0;
        int j=0;
        
        while(i<chars.length){
            char ch=chars[i];
            int cnt=0;
            while(i<chars.length && ch==chars[i]){
                i++;
                cnt++;
            }
            chars[j]=ch;
            j++;

            if(cnt>1){
                String cntStr= String.valueOf(cnt);
                for(char digit: cntStr.toCharArray()){
                    chars[j]=digit;
                    j++;
                }
            }
        }
        return j;
        
    }
}