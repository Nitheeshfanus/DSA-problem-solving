class Solution {
    int maxd=0;
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return maxd;
    }
    private int height(TreeNode node){
        if(node==null) return 0;

        int lefth=height(node.left);
        int righth=height(node.right);

        maxd=Math.max(lefth+righth,maxd);

        return 1+Math.max(lefth,righth);
    }
}
