package pickOne;

import org.junit.Test;

public class L105 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length<1)return null;
        return sss(preorder,0,preorder.length-1,inorder,0,inorder.length-1);
    }
    public TreeNode sss(int[] preorder,int begin1,int end1, int[] inorder,int begin2,int end2){
        if(begin2>=preorder.length||begin1>end1)return null;

        TreeNode root = new TreeNode(preorder[begin1]);

        int target=-1;
        for(int i=begin2;i<=end2;i++){
            if(inorder[i]==preorder[begin1]){
                target=i;
            }
        }
        int dis=target-begin2;
        //有左无右


        //有右无左


            root.left=sss(preorder,begin1+1,begin1+dis,inorder,begin2,begin2+dis-1);


            root.right=sss(preorder,begin1+dis+1,end1,inorder,begin2+dis+1,end2);

        return root;
    }

    @Test
    public void test(){
        int [] a={1,2,3};
        int [] b={2,3,1};
        L98 cc=new L98();
        cc.inordertraversal(buildTree(a,b));
    }
}
