package nowcode;

import org.junit.Test;

import java.util.HashSet;
import java.util.Scanner;

public class L1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int wordNum = sc.nextInt();
        int res=0;
        HashSet<String> set=new HashSet<>();
        for(int i=0;i<wordNum;i++){
            String word=sc.next();


            if(!set.contains(word)){
                res++;

                for(int j=0;j<word.length();j++){
                    set.add(word.substring(j)+word.substring(0,j));
                }
            }
        }
        System.out.println(res);
    }
    public void t(){
        ///Scanner sc = new Scanner(System.in);
        String [] wordd={"picture","turepic","icturep","word","ordw"};
        int wordNum = 5;
        int res=0;
        HashSet<String> set=new HashSet<>();
        for(int i=0;i<wordNum;i++){
            String word=wordd[i];
            if(!set.contains(word)){
                res++;

                for(int j=0;j<word.length();j++){
                    set.add(word.substring(j)+word.substring(0,j));
                }
            }
        }
        System.out.println(res);
    }
    @Test
    public void test(){
        t();
    }
}
