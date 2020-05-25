package everydayLeet;

import like100.TreeNode;
import org.junit.Test;

import java.util.HashMap;

public class L475 {
    int res = 0;
    public int pseudoPalindromicPaths (TreeNode root) {
        res = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        judge(map,root);
        return res;
    }
    public void judge(HashMap<Integer,Integer> map,TreeNode root){
        boolean isRemove = false;
        if(map.containsKey(root.val)){
            isRemove = true;
            map.remove(root.val);
        }else{
            map.put(root.val,1);
        }
        if(root.left==null&&root.right==null){
            if(map.size()<2)res++;
            if(isRemove){
                map.put(root.val,1);
            }else{
                map.remove(root.val);
            }
            return;
        }

        if(root.left!=null){
            judge(map,root.left);
        }
        if(root.right!=null){
            judge(map,root.right);
        }
        if(isRemove){
            map.put(root.val,1);
        }else{
            map.remove(root.val);
        }
    }
    @Test
    public void test(){
        TreeNode a = new TreeNode(2);
        TreeNode b = new TreeNode(3);
        b.right = new TreeNode(1);
        TreeNode c = new TreeNode(2);
        TreeNode d = new TreeNode(1);
        a.right = d;
        d.right = new TreeNode(1);
        a.left = b;
        b.left = c;
        System.out.println(pseudoPalindromicPaths(a));
    }

}
