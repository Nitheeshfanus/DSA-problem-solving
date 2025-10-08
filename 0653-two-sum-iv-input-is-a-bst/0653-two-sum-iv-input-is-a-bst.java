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
    public boolean findTarget(TreeNode root, int k) {
        Set<Integer> hs=new HashSet<>();
        return dfs(root,k,hs);
    }
    private boolean dfs(TreeNode node,int k, Set<Integer> hs){
        if(node == null){
            return false;
        }
        if(hs.contains(k-node.val)){
            return true;
        }
        hs.add(node.val);
        return dfs(node.left,k,hs) || dfs(node.right, k , hs);
    }
}