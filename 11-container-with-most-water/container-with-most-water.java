class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int area=0;
        int l=0;
        int h=n-1;
        while(l<h){
            int w=Math.abs(l-h);
            int ht=Math.min(height[l],height[h]);
            area=Math.max(area,ht*w);
            if(height[l]<height[h]) l++;
            else h--;
        }
        return area;   
    }
}