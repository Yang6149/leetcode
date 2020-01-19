package like100;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Stack;

public class L98 {
    public boolean isValidBST(TreeNode root) {

        return less(root,new int[]{Integer.MIN_VALUE,0});

    }
    public boolean less(TreeNode root,int [] nums){

        boolean mine=false;
        boolean a=root.left==null?true:less(root.left,nums);
        if(root.val>nums[0]||(root.val==Integer.MIN_VALUE&&nums[1]==0)){
            mine=true;
            nums[0]=root.val;
        }
        if(nums[1]==0)nums[1]++;
        boolean b=root.right==null?true:less(root.right,nums);
        return a&&b&&mine;
    }
    public void inordertraversal(TreeNode root){
        ArrayList<TreeNode> list=new ArrayList<>();
        Stack<TreeNode> stack=new Stack<>();
        while (root!=null||!stack.isEmpty()){
            while (root!=null){
                stack.push(root);
                root=root.left;
            }
            root=stack.pop();
            list.add(root);
            root=root.right;
        }
        System.out.println(list);
    }
    @Test
    public void test(){
        TreeNode a=new TreeNode(10);


        TreeNode b=new TreeNode(5);
        TreeNode c=new TreeNode(15);
        TreeNode d=new TreeNode(12);
        TreeNode e=new TreeNode(20);
        a.left=b;
        a.right=c;
        c.left=d;
        c.right=e;
        System.out.println(isValidBST(a));
        inordertraversal(a);
    }
}
