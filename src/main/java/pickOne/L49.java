package pickOne;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class L49 {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String,List> map=new HashMap<>();

        for(int i=0;i<strs.length;i++){
            String a=getNum(strs[i]);
            if(map.get(a)==null){
                ArrayList<String> strList=new ArrayList<String>();
                strList.add(strs[i]);
                map.put(a,strList);
            }else{
                map.get(a).add(strs[i]);
            }
        }
        List<List<String>> lists=new ArrayList<>();
        for (List<String> value : map.values()) {
            lists.add(value);
        }
        return lists;

    }

    public String getNum(String str){

        if(str.length()<1)return null;
        int result=0;
        char[] get=str.toCharArray();
        Arrays.sort(get);
        String a=String.valueOf(get);

        return a;
    }
    @Test
    public void test(){
        String [] strs={"duh","ill"};
        System.out.println(groupAnagrams(strs));
    }
}
