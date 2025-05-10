class Solution {
    int maxv=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        maxsum(root);
        return maxv;
    }
    private int maxsum(TreeNode node){
        if(node==null) return 0;

        int leftv=Math.max(maxsum(node.left),0);
        int rightv=Math.max(maxsum(node.right),0);

        maxv=Math.max(maxv,leftv+rightv+node.val);

        return node.val + Math.max(leftv,rightv);
    }
}
