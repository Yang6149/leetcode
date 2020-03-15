package contest.contest180;

import like100.TreeNode;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class L5179 {
    public TreeNode balanceBST(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        bianli(root,list);
        //treeNode n  left *2+1  right *2+2
        goujian(list,0,list.size()-1);
        return root;
    }
    public void bianli(TreeNode root,ArrayList<Integer> list){
        if(root==null)return;
        bianli(root.left,list);
        list.add(root.val);
        bianli(root.right,list);
    }

    public TreeNode goujian(ArrayList<Integer> list,int begin , int end){
        if(begin==end){
            TreeNode t = new TreeNode(list.get(begin));
            return t;
        }
        int mid = (begin+end)/2;
        TreeNode midNode = new TreeNode(list.get(mid));
        midNode.left = goujian(list,begin,mid-1);
        midNode.right=goujian(list,mid+1,end);
        return midNode;
    }

    @Test
    public void test(){
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        a.right=b;
        TreeNode c = new TreeNode(3);
        b.right=c;
        TreeNode d = new TreeNode(4);
        c.right=d;
        TreeNode e = new TreeNode(5);
        d.right=e;

        balanceBST(a);
    }
}
