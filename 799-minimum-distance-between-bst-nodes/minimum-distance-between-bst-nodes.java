/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    void dfs(TreeNode root,List<Integer>l1){
        if(root==null){
            return;
        }
        l1.add(root.val);
        dfs(root.left,l1);
        dfs(root.right,l1);


    }
    public int minDiffInBST(TreeNode root) {
        List<Integer>l1=new ArrayList<>();
        dfs(root,l1);


int[] arr = l1.stream().mapToInt(Integer::intValue).toArray();
  int diff=Integer.MAX_VALUE;
  for(int i=0;i<arr.length-1;i++){
    for(int j=i+1;j<arr.length;j++){
        int absdiff=Math.abs(arr[i]-arr[j]);
        diff=Math.min(diff,absdiff);
    }
  }
  return diff;

        
    }
}