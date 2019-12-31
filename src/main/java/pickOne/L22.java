package pickOne;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class L22 {
    public List<String> generateParenthesis(int n) {

        List<String> list=new ArrayList<>();
        if(n<1)return list;
        got(list,"",n,n);
        return list;
    }
    public void got(List<String> list,String s,int left,int right){
        if(right==0){
            list.add(s);
            return;
        }
        if(left==right){
            got(list,s+"(",left-1,right);
        }
        if(left<right&&left>0){//左右都可以
            got(list,s+"(",left-1,right);
            got(list,s+")",left,right-1);
        }
        if(left==0){
            got(list,s+")",left,right-1);
        }
    }
    @Test
    public void test(){
        System.out.println(generateParenthesis(1));
    }

}
