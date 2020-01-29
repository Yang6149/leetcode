package like100;

import org.junit.Test;

import java.util.*;

public class L438 {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        int [] hash = new int[256];
        for (int i=0;i<p.length();i++){
            hash[p.charAt(i)]++;
        }
        int head=0;
        int teal=0;
        int count=0;
        while (teal<s.length()){
            if (hash[s.charAt(teal++)]-->=1)count++;
            if (count==p.length())list.add(head);
            if (teal-head==p.length()&&hash[s.charAt(head++)]++ >=0)count--;
        }
        return list;
    }
    @Test
    public void test(){
        System.out.println(findAnagrams("cbaebacbaccd","abcc"));
    }
}
