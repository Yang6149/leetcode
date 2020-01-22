package like100;

import org.junit.Test;

import java.util.ArrayList;

public class L208 {
    /** Initialize your data structure here. */
    class CharTree{
        CharTree [] next = new CharTree[26];
        boolean isend;
    }
    private CharTree root;
    public L208() {
        root=new CharTree();
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        char [] words=word.toCharArray();
        CharTree t=root;
        for (char c : words) {
            if(t.next[c-97]==null){
                t.next[c-97]=new CharTree();
            }
            t=t.next[c-97];
        }
        t.isend=true;
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        char [] words=word.toCharArray();
        CharTree t=root;
        for (char c : words) {
            t=t.next[c-97];
            if(t==null)return false;
        }
        if (!t.isend)return false;
        return true;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        char [] words=prefix.toCharArray();
        CharTree t=root;
        for (char c : words) {
            t=t.next[c-97];
            if(t==null)return false;
        }
        return true;
    }

    @Test
    public void test(){
        String s1="apple";
        String s2="app";
        String s3="ook";
        L208 l=new L208();
        l.insert(s1);
        System.out.println(l.search(s1));
        System.out.println(l.search(s2));
        System.out.println(l.search(s3));
        System.out.println(l.startsWith(s2));


        ArrayList<String> list=new ArrayList<>(10000*10000);

        for (int i = 0; i < list.size(); i ++) {
            list.add("123");
        }
        long start=System.currentTimeMillis();
        for (int i = 0; i < list.size(); i ++) {
            for (int j = 0; i < list.size(); i ++) {
                String s = list.get(j);
            }

        }
        System.out.println("LinkedList for i++ on 1000*1000 records time waste: " + (System.currentTimeMillis() - start));
        start = System.currentTimeMillis();
        for (String s : list) {
            for (String s4 : list) {
                //
            }
        }
        System.out.println("LinkedList foreach on 1000*1000 records time waste: " + (System.currentTimeMillis() - start));

    }
}
