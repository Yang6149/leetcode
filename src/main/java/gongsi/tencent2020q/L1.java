package gongsi.tencent2020q;

import java.util.Scanner;
import java.util.Stack;

public class L1 {
//    public static void main(String [] args){
//        Scanner in = new Scanner(System.in);
//        String i = in.nextLine();
//        System.out.println(get(i));
//    }
//    public static String get(String s){
//        Stack<Integer> stack = new Stack<>();
//        int begin = 0;
//        StringBuilder res = new StringBuilder();
//        for(int i=0;i<s.length();i++){
//            if(s.charAt(i)==']'){
//                if(stack.size()==1){
//                    String sub = s.substring(stack.pop()+1,i);
//                    int gang = 1;
//                    for(int j=0;j<sub.length();j++){
//                        if (sub.charAt(j)=='|'){
//                            gang=j;
//                            break;
//                        }
//                    }
//                    Integer times = Integer.parseInt(sub.substring(0,gang));
//                    String com = sub.substring(gang+1);
//                    String r = get(com);
//                    for (Integer integer = 0; integer < times; integer++) {
//                        res.append(r);
//                    }
//                }else{
//                    stack.pop();
//                }
//            }else if(s.charAt(i)=='['){
//                stack.push(i);
//            }else if(stack.size()==0){
//                res.append(s.substring(i,i+1));
//            }
//        }
//        return res.toString();
//    }
public static void main(String [] args){
    Scanner in = new Scanner(System.in);
    String s = in.nextLine();
    System.out.println(g(s));
}
    public static String g(String s){
        String res = "";
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='['){
                stack.push(i);
            }else if(s.charAt(i)==']'){
                if(stack.size()==1){
                    int begin = stack.pop();
                    int end = i;
                    String sub = s.substring(begin+1,end);
                    int gang = 0;
                    while(sub.charAt(gang)!='|')gang++;
                    Integer num = Integer.parseInt(sub.substring(0,gang));
                    String right = sub.substring(gang+1);
                    right=g(right);
                    for(int o=0;o<num;o++){
                        res+=right;
                    }
                }else{
                    stack.pop();
                }

            }else if(stack.size()==0){
                res+=s.charAt(i);
            }
        }
        return res;
    }
}
