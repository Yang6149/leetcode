package gongsi.wangyi;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class L3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int D = sc.nextInt();
            PriorityQueue<State> pofang = new PriorityQueue<>(new Comparator<State>() {
                @Override
                public int compare(State o1, State o2) {
                    if (o1.pofang!=o2.pofang){
                        return o1.pofang-o2.pofang;
                    }else{
                        return o1.deman-o2.deman;
                    }
                }
            });
            PriorityQueue<State> deman = new PriorityQueue<>(new Comparator<State>() {
                @Override
                public int compare(State o1, State o2) {
                    return o1.deman-o2.deman;
                }
            });
            State s[] = new State[n];
            for(int i = 0;i<n;i++){
                s[i] = new State();
            }
            for(int i = 0;i<n;i++){
                s[i].pofang = sc.nextInt();
            }
            for(int i = 0;i<n;i++){
                s[i].deman = sc.nextInt();
            }
            for(State a:s){
                pofang.add(a);
                deman.add(a);
            }
            long res = 0;
            for(int i = 0;i<n;i++){
                while(pofang.peek().state){
                    pofang.poll();
                }
                while(deman.peek().state){
                    deman.poll();
                }
                if(D>=pofang.peek().pofang){
                    D++;
                    pofang.peek().state=true;
                }else{
                    D++;
                    res+=deman.peek().deman;
                    deman.peek().state=true;
                }
            }
            System.out.println(res);

        }
    }
    public static class State{
        int pofang;
        int deman;
        boolean state;
    }
}
