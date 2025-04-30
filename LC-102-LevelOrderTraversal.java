class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result=new ArrayList<>();
        //When you use new ArrayList<>(), it creates a new ArrayList object.
        levelorder(root,0,result);
        return result;
    }
    private void levelorder(TreeNode node,int level,List<List<Integer>> res){
        if(node==null) return;


        if(level==res.size()){   // NOTE
            res.add(new ArrayList<>());
        }
        

        res.get(level).add(node.val);

        levelorder(node.left,level+1,res);
        levelorder(node.right,level+1,res);

    }
}
