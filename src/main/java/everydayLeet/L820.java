package everydayLeet;

import org.junit.Test;

public class L820 {
    class TreeNode{
        char c;
        TreeNode [] child;
    }
    class Trie{
        TreeNode [] root;
        public Trie(){
            root = new TreeNode[26];
        }

        public void insert(String word){
            TreeNode [] cur = root;
            for (int i=word.length()-1;i>=0;i--){
                if (cur[word.charAt(i)-97]==null){
                    cur[word.charAt(i)-97]=new TreeNode();
                    cur[word.charAt(i)-97].c=word.charAt(i);
                    cur[word.charAt(i)-97].child = new TreeNode[26];
                }
                cur=cur[word.charAt(i)-97].child;
            }
        }
    }
    public int minimumLengthEncoding(String[] words) {
        Trie root = new Trie();
        for(String word:words){
            root.insert(word);
        }
        int [] res = new int[1];
        for (TreeNode treeNode : root.root) {
            search(treeNode,1,res);
        }
        return res[0];
    }
    public void search(TreeNode node,int level,int [] res){
        if (node==null) return ;
        boolean flag = true;
        for (int i=0;i<26;i++){
            TreeNode cur = node.child[i];
            if(cur==null)continue;
            flag = false;
            search(cur,level+1,res);
        }
        if (flag){
            res[0]+=level+1;
        }

    }

    @Test
    public void test(){
        String [] strs = {"time","me","bell"};
        System.out.println(minimumLengthEncoding(strs));

    }


}
