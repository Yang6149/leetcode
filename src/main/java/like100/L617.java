package like100;

import org.junit.Test;

public class L617 {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1==null&&t2==null)return null;
        int val = (t1==null?0: t1.val)+(t2==null?0:t2.val);
        TreeNode res=new TreeNode(val);
        res.left=mergeTrees(t1==null?null:t1.left,t2==null?null:t2.left);
        res.right=mergeTrees(t1==null?null:t1.right,t2==null?null:t2.right);
        return res;
    }
    @Test
    public void test(){
        TreeNode t1=TreeNode.stringToTreeNode("[1,3,2,5]");
        TreeNode t2=TreeNode.stringToTreeNode("[2,1,3,null,4,null,7]");
        TreeNode a=mergeTrees(t1,t2);
        System.out.println(a);
        System.out.println('1');
    }
}
