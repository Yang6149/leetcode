package contest.contest172;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class L2 {
    public List<String> printVertically(String s) {
        ArrayList<String> list=new ArrayList<>();
        char [] chars=s.toCharArray();
        int index=0;
        int oneWordMaxLen=0;

        while(index<s.length()){
            int curLen=0;
            int begin=index;
            while(index<s.length()&&chars[index]!=' '){
                curLen++;
                index++;
            }
            if(oneWordMaxLen<curLen){
                oneWordMaxLen=curLen;
            }
            list.add(s.substring(begin,index));
            index++;
        }
        ArrayList<StringBuilder> res=new ArrayList<>(oneWordMaxLen);
        for (int i=0;i<oneWordMaxLen;i++){
            res.add(new StringBuilder());
        }
        for (int i=0;i<oneWordMaxLen;i++){
            StringBuilder cur=res.get(i);
            for(int j=0;j<list.size();j++){
                String onepiece;
                if(list.get(j).length()<=i){
                    onepiece=" ";
                }else{
                    onepiece=list.get(j).substring(i,i+1);
                }
                cur.append(onepiece);
            }
        }
        for(int i=0;i<res.size();i++){
            while (res.get(i).subSequence(res.get(i).length()-1,res.get(i).length()).equals(" ")){
                res.get(i).delete(res.get(i).length()-1,res.get(i).length());
            }
            while(res.get(i).subSequence(0,1).equals(" ")){
                res.get(i).delete(0,1);
            }
        }
        ArrayList<String> res2=new ArrayList<>();
        for(int i=0;i<res.size();i++){
            res2.add(res.get(i).toString());
        }
        return res2;

    }
    @Test
    public void test(){
        String s = "TO BE OR NOT TO BE";
        System.out.println(printVertically(s));
    }
}
