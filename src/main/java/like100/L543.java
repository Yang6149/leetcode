package like100;

public class L543 {
    int max=0;
    public int diameterOfBinaryTree(TreeNode root) {
        deep(root);
        return max!=0?max-1:0;
    }
    public int deep(TreeNode root){
        if (root==null)return 0;
        int left = deep(root.left);
        int right = deep(root.right);
        max=Math.max(left+right+1,max);
        return Math.max(left,right)+1;
    }
}
