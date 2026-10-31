class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        char[] types={'M','P','G'};
        int t_time=0;
        for(char ch: types){
            int truckTime=0;
            int curTravTime=0;
            for(int i=0;i<garbage.length;i++){
                if(i>0){
                    curTravTime+=travel[i-1];
                }
                int cnt=0;
                for(char c:garbage[i].toCharArray()){
                    if(c==ch) cnt++;
                }
                if(cnt>0){
                    truckTime+=curTravTime+cnt;
                    curTravTime=0;
                }
            }
            t_time+=truckTime;
        }
        
        return t_time;
    }
}