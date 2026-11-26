/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
 void dfs(TreeNode* root,vector<int>& ans){
        if(root==NULL){
            return ;

        }
       
        dfs(root->left,ans);
        ans.push_back(root->val);
        dfs(root->right,ans);

    }
    TreeNode* convert(vector<int>& res,int l,int h){
        if(l>h){
            return NULL;
        }
        int mid=(l+h)/2;
        TreeNode* root=new TreeNode(res[mid]);
        root->left=convert(res,l,mid-1);
        root->right=convert(res,mid+1,h);

        return root;

    }
    TreeNode* deleteNode(TreeNode* root, int key) {
        vector<int>ans;
        dfs(root,ans);
        vector<int>res;
        for(int i=0;i<ans.size();i++){
            if(ans[i]!=key){
            res.push_back(ans[i]);
            }
        }
     
      
       return convert(res,0,res.size()-1);
        
    }
};