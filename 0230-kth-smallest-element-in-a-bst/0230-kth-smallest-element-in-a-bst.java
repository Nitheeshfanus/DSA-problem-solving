
class Solution {
    int count=0;
    int ans=0;

    public int kthSmallest(TreeNode root, int k) {
        inOrder(root,k);
        return ans;
    }
    public void inOrder(TreeNode root, int k){
        if(root == null){
            return;
        }
        inOrder(root.left, k);

        count++;
        if(k==count){
            ans= root.val;
            return;
        }
        inOrder(root.right,k);
    
    }
}