package everydayLeet;

import org.junit.Test;

import java.util.HashMap;

public class L76 {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer> need = new HashMap<>();
        HashMap<Character,Integer> windows = new HashMap<>();
        int right = 0;
        int left = 0;
        String res = s;
        int valid = 0;
        for(int i = 0;i<t.length();i++){
            need.put(t.charAt(i),need.getOrDefault(t.charAt(i),0)+1);
        }
        while(right<s.length()){
            char temp = s.charAt(right);
            right++;
            if(need.containsKey(temp)){
                windows.put(temp,windows.getOrDefault(temp,0)+1);
                if(need.get(temp)==windows.get(temp))valid++;
            }
            while(valid == need.size()){
                if(res.length()>right-left){
                    res = s.substring(left,right);
                }
                char temp2 = s.charAt(left);
                left++;
                if(need.containsKey(temp2)){

                    if(need.get(temp2)==windows.get(temp2)){
                        System.out.println(s.substring(left-1,right));
                        valid--;
                    }
                    windows.put(temp2,windows.get(temp)-1);
                }
            }
        }
        return res;
    }
    @Test
    public void test(){
    }
}
