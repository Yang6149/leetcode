package like100;

import org.junit.Test;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class L337 {
    public int rob(TreeNode root) {
        if(root==null)return 0;
        int LL=0,LR=0,RL=0,RR=0,L=0,R=0;
        if (root.left!=null){
            L=rob(root.left);
            LL=root.left.left!=null?root.left.left.val:0;
            LR=root.left.right!=null?root.left.right.val:0;
        }
        if (root.right!=null){
            R=rob(root.right);
            RL=root.right.left!=null?root.right.left.val:0;
            RR=root.right.right!=null?root.right.right.val:0;
        }
        root.val=Math.max(L+R,LL+LR+RL+RR+root.val);
        return root.val;
    }
    @Test
    public void test(){
        TreeNode a=TreeNode.stringToTreeNode("[1,2,3,null,5,8,7,6,1,null,6,9,8,4,2]");
        System.out.println(rob(a));
    }
}
