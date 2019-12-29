package pickOne;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class L17 {
    public List<String> letterCombinations(String digits) {
        List<List<String>> num=new ArrayList<>();
        num.add(new ArrayList<String>());
        List<String> d2=new ArrayList<>();
        d2.add("a");d2.add("b");d2.add("c");
        List<String> d3=new ArrayList<>();
        d3.add("d");d3.add("e");d3.add("f");
        List<String> d4=new ArrayList<>();
        d4.add("g");d4.add("h");d4.add("i");
        List<String> d5=new ArrayList<>();
        d5.add("j");d5.add("k");d5.add("l");
        List<String> d6=new ArrayList<>();
        d6.add("m");d6.add("n");d6.add("o");
        List<String> d7=new ArrayList<>();
        d7.add("p");d7.add("q");d7.add("r");d7.add("s");
        List<String> d8=new ArrayList<>();
        d8.add("t");d8.add("u");d8.add("v");
        List<String> d9=new ArrayList<>();
        d9.add("w");d9.add("x");d9.add("y");d9.add("z");
        num.add(d2);num.add(d3);num.add(d4);num.add(d5);num.add(d6);num.add(d7);num.add(d8);num.add(d9);
        List<String> list=new ArrayList<>();
        list.add("");
        return fuc(list,digits,num,0);
    }

    public List<String> fuc(List<String> list,String s,List<List<String>> num,int index){
        List<String> newlist=new ArrayList<>();
        for(String a:list){
            int i=Integer.parseInt(s.substring(index,index+1));
            for(String j:num.get(i-1)){
                newlist.add(a+j);
            }
        }
        if(index==s.length()-1)return newlist;
        return fuc(newlist,s,num,index+1);

    }

    @Test
    public void test(){
        String s="123";
        System.out.println(letterCombinations("3"));
    }
}
