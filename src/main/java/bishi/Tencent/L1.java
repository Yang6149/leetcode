package bishi.Tencent;

import org.junit.Test;

import java.util.Scanner;

public class L1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0;i<n;i++){
            int Q = sc.nextInt();
            int [] queue = new int[1000];
            int head = 0;
            int tail = 0;
            sc.nextLine();
            for(int j = 0;j<Q;j++){
                String command = sc.nextLine();
                String []commands = command.split(" ");
                if(commands.length>1){
                    queue[tail] = Integer.parseInt(commands[1]);
                    tail++;
                }
                if (commands[0].equals("TOP")){
                    if(tail<=head){
                        System.out.println(-1);
                    }else{
                        System.out.println(queue[head]);
                    }
                }
                if (commands[0].equals("POP")){
                    if(tail<=head){
                        System.out.println(-1);
                    }
                    head++;
                }
                if (commands[0].equals("SIZE")){
                    System.out.println(tail-head);
                }
                if (commands[0].equals("CLEAR")){
                    head=tail=0;
                }
            }
        }

        //System.out.println(ans);
    }
    @Test
    public void test(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String b = sc.nextLine();
        String c = sc.nextLine();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
