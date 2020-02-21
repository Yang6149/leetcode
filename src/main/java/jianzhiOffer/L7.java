package jianzhiOffer;

import like100.TreeNode;

import java.util.HashMap;

public class L7 {
    HashMap<Integer,Integer> hashMap = new HashMap<>();
    public TreeNode reConstructBinaryTree(int [] pre, int [] in) {
        for(int i=0;i<in.length;i++){
            hashMap.put(in[i],i);
        }
        return reConstructBinaryTree(pre,0,pre.length-1,0);
    }
    private TreeNode reConstructBinaryTree(int [] pre,int preL,int preR,int inL){
        if(preL>preR)return null;
        TreeNode treeNode = new TreeNode(pre[preL]);
        int index = hashMap.get(pre[preL]);
        int leftsize = index-inL;
        treeNode.left = reConstructBinaryTree(pre,preL+1,preL+leftsize,inL);
        treeNode.right = reConstructBinaryTree(pre,preL+leftsize+1,preR,inL+leftsize+1);
        return treeNode;
    }
}
