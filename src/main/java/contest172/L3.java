package contest172;

import pickOne.TreeNode;

public class L3 {
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        if(root==null)return root;
        isNull(root ,root.left ,target ,true);
        isNull(root ,root.right ,target ,false);
        if(root.left==null&&root.right==null&&root.val==target){
            root=null;
        }
        return root;
    }

    public void isNull(TreeNode par,TreeNode root,int target,boolean isLeft){
        if(root==null)return;
        isNull(root ,root.left ,target ,true);
        isNull(root ,root.right ,target ,false);
        if(root.left==null&&root.right==null&&root.val==target){
            if(isLeft){
                par.left=null;
            }else {
                par.right=null;
            }
        }
    }


}
