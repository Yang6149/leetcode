package jianzhiOffer;

public class L8 {
    public TreeLinkNode GetNext(TreeLinkNode pNode)
    {
        if(pNode.right!=null){
            return hasRight(pNode);
        }
        if(pNode.next==null)return null;
        while(pNode.next.right==pNode){
            pNode=pNode.next;
            if(pNode.next==null)return null;
        }
        return pNode.next;
    }
    public TreeLinkNode hasRight(TreeLinkNode pNode){
        TreeLinkNode child = pNode.right;
        while(child.left!=null){
            child=child.left;
        }
        return child;
    }
}
class TreeLinkNode {
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null;

    TreeLinkNode(int val) {
        this.val = val;
    }
}