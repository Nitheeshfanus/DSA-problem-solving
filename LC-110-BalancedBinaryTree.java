class Solution {
    public boolean isBalanced(TreeNode root) {
        return check(root) !=-1;
    }

    private int check(TreeNode node){

        if(node==null) return 0;
        
        int lefth=check(node.left);
        int righth=check(node.right);

        if(lefth==-1 || righth==-1) return -1;

        if(Math.abs(lefth-righth)>1){
            return -1;
        }   
        return 1+Math.max(righth,lefth);
    }
}
