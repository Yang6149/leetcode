package like100;

import org.junit.Test;

public class L3 {
    int dadada=5;
    protected int  dididi=10;
    public int lengthOfLongestSubstring(String s) {
        //n compare n-1
        //一种是n的内部和某一位到最后的比较
        if(s==null||s.length()==0||s.equals(""))return 0;
        int max=1;
        s=s.trim();
        int a[]=new int [200];



        char[]chars=s.toCharArray();
        int cur=0;
        for(int i=0;i<s.length();i++){
            if(a[chars[i]]==0){
                a[chars[i]]=1;
                cur++;
            }else{
                cur=1;
                a=new int[200];
                a[chars[i]]=1;
            }

            if(cur>max){
                max=cur;
            }
        }
        return max;
    }
    public int getTailNum(String s){
        char[] chars=s.toCharArray();
        int num=0;
        int a[]=new int [300];
        for(int i=s.length()-1;i>=0;i--){
            int location=chars[i];
            if(a[location]==0){
                a[location]=1;
                num+=1;
            }else{
                break;
            }
        }
        return num;
    }
    @Test
    public void test(){
        System.out.println(lengthOfLongestSubstring("dvdf"));
    }
}
