package everydayLeet;

import like100.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class L102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Deque<TreeNode> queue = new ArrayDeque<>();
        List<List<Integer>> res = new ArrayList<>();
        queue.add(root);
        while(queue.size()>0){
            Deque<TreeNode> subQueue = new ArrayDeque<>();
            ArrayList<Integer> subRes = new ArrayList<>();
            while(queue.size()>0){
                TreeNode temp = queue.poll();
                subRes.add(temp.val);
                if (temp.left!=null){
                    subQueue.add(temp.left);
                }else if (temp.right!=null){
                    subQueue.add(temp.right);
                }
            }
            queue = subQueue;
            res.add(subRes);
        }
        return res;
    }
}
