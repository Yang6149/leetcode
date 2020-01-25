package like100;

import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Deque;

public class L297 {
    private static char nul='X';
    private static char spliter=',';
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root==null)return "X";
        StringBuilder builder=new StringBuilder();
        Deque<TreeNode> queue=new ArrayDeque<>();
        queue.addLast(root);
        builder.append(root.val).append(spliter);
        while (!queue.isEmpty()){
            Deque<TreeNode> nextQueue=new ArrayDeque<>();
            while (!queue.isEmpty()){
                TreeNode curTree=queue.pollFirst();
                if(curTree.left!=null){
                    nextQueue.addLast(curTree.left);
                    builder.append(curTree.left.val).append(spliter);
                }else {
                    builder.append(nul).append(spliter);
                }
                if(curTree.right!=null){
                    nextQueue.addLast(curTree.right);
                    builder.append(curTree.right.val).append(spliter);
                }else {
                    builder.append(nul).append(spliter);
                }
            }
            queue=nextQueue;
        }
        return builder.replace(builder.length()-1,builder.length(),"").toString();
    }


    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String [] strs=data.split(",");
        int index=0;
        Deque<TreeNode> queue=new ArrayDeque<>();
        if(strs[0].equals("X"))return null;
        TreeNode head=new TreeNode(Integer.parseInt(strs[index++]));
        TreeNode res=head;
        queue.addLast(head);
        while (index<strs.length){
            TreeNode cur=queue.pollFirst();
            if(cur==null){
                continue;
            }
            if(strs[index].equals("X")){
                cur.left=null;
            }else {
                cur.left=new TreeNode(Integer.parseInt(strs[index]));
                queue.addLast(cur.left);
            }
            index++;
            if(strs[index].equals("X")){
                cur.right=null;
            }else {
                cur.right=new TreeNode(Integer.parseInt(strs[index]));
                queue.addLast(cur.right);
            }
            index++;

        }
        return res;
    }

    @Test
    public void test(){
        System.out.println(serialize(TreeNode.stringToTreeNode("[1,2,3,4,null,null,null,5]")));
        System.out.println(serialize(deserialize(serialize(TreeNode.stringToTreeNode("[1,2,3,4,null,null,null,5]")))));
    }
}
