
class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        return search(root, val);
    }
    public TreeNode search(TreeNode root, int v){

        if(root == null){
            return null;
        }
        if(root.val == v){
            return root;
        }
        else if(root.val > v)
        return search(root.left, v);

        else
        return search(root.right, v);

    }
}