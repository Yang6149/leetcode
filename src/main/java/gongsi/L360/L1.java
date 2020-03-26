package gongsi.L360;

import java.util.Scanner;

public class L1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String [] st = get2String(in);
            String a = st[0];
            String b = st[1];
            comp(a,b);
        }
    }
    public static String[] get2String(Scanner in){
        String a = in.nextLine();
        String b = in.nextLine();
        return new String[]{a,b};
    }
    public static void comp(String a,String b){
        char [] str1 = a.toCharArray();
        char [] str2 = b.toCharArray();
        int T=0;
        int A=0;
        for (int i = 0; i < str1.length; i++) {
            if(str1[i]==str2[i])continue;
            if(str1[i]=='A')A++;
            else T++;
        }
        System.out.println(T>A?T:A);
    }
}
