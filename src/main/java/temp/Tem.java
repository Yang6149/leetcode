package temp;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class Tem {

    public static void main(String[] args) {
        TreeNode a = new TreeNode(1);
        TreeNode b1 = new TreeNode(2);
        TreeNode b2 = new TreeNode(3);
        a.left = b1;
        a.right = b2;
        TreeNode c1 = new TreeNode(4);
        b1.left = c1;
        TreeNode c2 = new TreeNode(5);
        b1.right = c2;
        TreeNode c3 = new TreeNode(6);
        b2.left = c3;
        TreeNode c4 = new TreeNode(7);
        b2.right = c4;
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(a);
        //tr(a);
        tr2(queue);
    }

    public static void tr(TreeNode node ) {
        if (node == null) return;
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(node);
        while (queue.size() != 0) {
            Queue<TreeNode> newQueue = new ArrayDeque<>();
            while (queue.size() != 0) {
                TreeNode temp = queue.poll();
                if (temp.left != null) newQueue.add(temp.left);
                if (temp.right != null) newQueue.add(temp.right);
                System.out.println(temp.value);
            }
            queue = newQueue;
        }
    }
    public static void tr2( Queue<TreeNode> queue) {
            if(queue.size()==0)return ;
            Queue<TreeNode> newQueue = new ArrayDeque<>();
            while (queue.size() != 0) {
                TreeNode temp = queue.poll();
                if (temp.left != null) newQueue.add(temp.left);
                if (temp.right != null) newQueue.add(temp.right);
                System.out.println(temp.value);

            }
        tr2(newQueue);
    }

    static class TreeNode {
        int value;
        TreeNode left;
        TreeNode right;

        public TreeNode(int value) {
            this.value = value;
        }
    }

    public static void tr3(TreeNode node) {

    }
}
