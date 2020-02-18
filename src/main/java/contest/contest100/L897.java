package contest.contest100;

import like100.TreeNode;
import org.junit.Test;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;

public class L897 {
    public TreeNode increasingBST(TreeNode root) {
        Queue<TreeNode> queue = new ArrayDeque<>();

        addin(root,queue);
        TreeNode res=null;
        if(queue.size()>0){
            res=queue.poll();
        }
        TreeNode cur = res;
        while(queue.size()>0){
            cur.right=queue.poll();
            cur=cur.right;
        }
        return res;
    }
    public void addin(TreeNode root,Queue<TreeNode> queue){
        if(root==null)return;
        addin(root.left,queue);
        queue.add(root);
        addin(root.right,queue);
        root.left=null;
        root.right=null;
    }
}
