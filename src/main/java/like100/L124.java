package like100;

import org.junit.Test;

public class L124 {
    int maxValue=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        donwMax(root);
        return maxValue;
    }

    public int donwMax(TreeNode root){
        if(root==null)return 0;
        int left = donwMax(root.left);
        int right= donwMax(root.right);
        if(left+right+root.val>maxValue)maxValue=left+right+root.val;
        if(root.val>=maxValue)maxValue=root.val;
        if(Math.max(left,right)+root.val>maxValue)maxValue= Math.max(left,right)+root.val;
        return Math.max(Math.max(left,right),0)+root.val;
    }



    @Test
    public void test(){
        TreeNode root = TreeNode.stringToTreeNode("[9,6,-3,null,null,-6,2,null,null,2,null,-6,-6,-6]");
        System.out.println(maxPathSum(root));
    }
}
