package everydayLeet;

import org.junit.Test;

public class M46 {
    public int translateNum(int num) {
        String s = Integer.toString(num);
        return tosss(s);
    }
    public int tosss(String s){
        if(s.length()<2)return 1;
        char a = s.charAt(0);
        String b = s.substring(0,2);
        if(a!='0'&&Integer.parseInt(b)<26){
            return tosss(s.substring(1))+tosss(s.substring(2));
        }
        return tosss(s.substring(1));
    }

    @Test
    public void test(){
        System.out.println(translateNum(25));
    }
}
