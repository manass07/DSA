class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n=arr.length;
        int sum=0;
        for(int i=0;i<n;i++){
            int currsum=0;
            for(int j=i;j<n;j++){
                currsum+=arr[j];
                int len=j-i+1;
                if(len%2==1){
                    sum+=currsum;
                }
            }
        }
        return sum;
    }
}