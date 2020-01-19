package like100;

public class L114 {
    public void flatten(TreeNode root) {
        if(root==null)return ;
        TreeNode cao=root;
        if(root.left!=null){
            cao=cao.left;
            TreeNode cur=root.right;
            while (cao.right!=null){
                cao=cao.right;
            }
            cao.right=cur;
            root.right=root.left;
            root.left=null;
        }
        flatten(root.right);
    }
}
