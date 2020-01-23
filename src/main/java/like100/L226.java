package like100;

public class L226 {
    public TreeNode invertTree(TreeNode root) {
        inverse(root);
        return root;
    }

    public void inverse(TreeNode root){
        if(root==null)return;
        TreeNode node = root.left;
        root.left=root.right;
        root.right=node;
        inverse(root.left);
        inverse(root.right);
    }
}
