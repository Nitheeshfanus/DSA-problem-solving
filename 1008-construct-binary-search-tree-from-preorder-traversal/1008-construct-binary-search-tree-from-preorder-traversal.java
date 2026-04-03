
class Solution {
    public TreeNode bstFromPreorder(int[] preorder) {
        return buildtree(preorder, Integer.MAX_VALUE,new int[]{0});
    }
    public TreeNode buildtree(int[] a,int bound,int[] i){
        if(i[0] == a.length || a[i[0]] > bound) return null;
        TreeNode root= new TreeNode(a[i[0]++]);
        root.left= buildtree(a, root.val, i);
        root.right= buildtree(a, bound, i);
        return root;
    }
}