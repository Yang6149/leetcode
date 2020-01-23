package like100;

import org.junit.Test;

import java.util.Stack;

public class L236 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//        Stack<TreeNode> stack = new Stack<>();
//        stack.add(root);
//        TreeNode maxDeep=null;
//        int num=0;
//        int level=Integer.MAX_VALUE;
//        while(!stack.isEmpty()){
//            TreeNode cur=stack.pop();
//
//            while (cur!=null){
//                stack.add(cur);
//                cur=cur.left;
//            }
//            cur=stack.pop();
//            if(cur.val==p.val||cur.val==q.val){
//                num++;
//                if(num==1){
//                    level=stack.size();
//                }
//            }
//            if(level>=stack.size()&&num>=1){
//                level--;
//                maxDeep=cur;
//            }
//            if (num==2)return maxDeep;
//            stack.add(cur.right);
//        }
        if (root == null || root == p || root == q) return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        return left == null ? right : right == null ? left : root;
    }


    @Test
    public void test(){
        TreeNode root=TreeNode.stringToTreeNode("[1,2]");
        TreeNode p=TreeNode.stringToTreeNode("[1]");
        TreeNode q=TreeNode.stringToTreeNode("[2]");
        System.out.println(lowestCommonAncestor(root,p,q));
    }





}
