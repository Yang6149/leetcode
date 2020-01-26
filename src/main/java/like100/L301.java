package like100;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class L301 {
    public List<String> removeInvalidParentheses(String s) {
        List<String> res=new ArrayList<>();
        remove(res,s,0,0,new char[]{'(',')'});
        return res;
    }
    public void remove(List<String> res,String s,int begin_i,int begin_j,char par[]){

        for (int stack=0,i=begin_i;i<s.length();i++){
            if (s.charAt(i)==par[0])stack++;
            if (s.charAt(i)==par[1])stack--;
            if(stack>=0)continue;
            for (int j=begin_j;j<=i;j++){
                if (s.charAt(j)==par[1]&&(j==begin_j||s.charAt(j-1)!=par[1])){
                    remove(res,s.substring(0,j)+s.substring(j+1,s.length()),i,j,par);
                }
            }
            return ;
        }
        String reversed = new StringBuilder(s).reverse().toString();
        if (par[0]=='('){
            remove(res,reversed,0,0,new char[]{')','('});
        }else {
            res.add(reversed);
        }
    }
    public void remove1(List<String> ans,String s,  int last_i, int last_j,  char[] par) {
        for (int stack = 0, i = last_i; i < s.length(); ++i) {
            if (s.charAt(i) == par[0]) stack++;
            if (s.charAt(i) == par[1]) stack--;
            if (stack >= 0) continue;
            for (int j = last_j; j <= i; ++j)
                if (s.charAt(j) == par[1] && (j == last_j || s.charAt(j - 1) != par[1]))
                    remove1(ans, s.substring(0, j) + s.substring(j + 1, s.length()), i, j, par);
            return;
        }
        String reversed = new StringBuilder(s).reverse().toString();
        if (par[0] == '(') // finished left to right
            remove1( ans,reversed, 0, 0, new char[]{')', '('});
        else // finished right to left
            ans.add(reversed);
    }
    @Test
    public void test(){
        String s=")(";
        System.out.println(removeInvalidParentheses(s));
        System.out.println("aa");
    }

}
