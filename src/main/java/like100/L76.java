package like100;

import org.junit.Test;


public class L76 {
    public String minWindow(String s, String t) {
        int [] count=new int[128];
        for(int c:t.toCharArray())count[c]++;

        int begin=0;int head=0;int end=0;
        char [] char1=s.toCharArray();
        int curlen=t.length();
        int d=Integer.MAX_VALUE;
        while(end<s.length()){
            if(count[char1[end++]]-->0)curlen--;
            while(curlen==0){
                if(end-begin<d)d=end-(head=begin);
                if(count[char1[begin++]]++==0)curlen++;
            }
        }

        return d!=Integer.MAX_VALUE ? s.substring(head,head+d):"";
    }

    @Test
    public void test(){
        String t1="ADOBECODEBANC";
        String t2="ABC";
        System.out.println(minWindow(t1,t2));
    }

}
