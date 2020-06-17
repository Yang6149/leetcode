package util;

import like100.TreeNode;
import org.junit.Test;

import java.util.*;

public class TreeUtil {

    public String serialize(TreeNode root) {
        if(root==null)return "[]";
        StringBuilder str = new StringBuilder();
        Deque<TreeNode> deque = new LinkedList<>();
        str.append("[");
        int valid = 1;
        deque.addLast(root);
        while(valid>0){
            TreeNode node = deque.pollFirst();
            if(node!=null){
                valid--;
                str.append(node.val);
                str.append(",");
                if(node.left!=null){
                    valid++;
                    deque.addLast(node.left);
                }else{
                    deque.addLast(null);
                }
                if(node.right!=null){
                    valid++;
                    deque.addLast(node.right);
                }else{
                    deque.addLast(null);
                }
            }else{
                str.append("null,");
            }
        }
        str.setLength(str.length()-1);
        str.append("]");
        return str.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        Deque<TreeNode> deque = new ArrayDeque<>();
        String temp = data.substring(1,data.length()-1);
        if(temp.length()==0) return null;
        String [] nodes = temp.split(",");
        TreeNode root = new TreeNode(Integer.valueOf(nodes[0]));
        deque.addLast(root);
        int valid = 1;
        int index = 1;
        while(index<nodes.length){
            TreeNode node = deque.pollFirst();
            if(node!=null){
                String left = nodes[index++];


                if(!left.equals("null")){
                    node.left = new TreeNode(Integer.valueOf(left));
                    deque.addLast(node.left);

                }else{
                    node.left = null;
                }
                if(index>=nodes.length) break;
                String right = nodes[index++];
                if(!right.equals("null")){
                    node.right = new TreeNode(Integer.valueOf(right));
                    deque.addLast(node.right);
                }else{
                    node.right = null;
                }

            }
        }
        return root;

    }

    @Test
    public void test(){
        String s = "[1,2]";
        System.out.println(serialize(deserialize(s)));

    }
}
