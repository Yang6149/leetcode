package interview100;

import org.junit.Test;

import java.util.concurrent.locks.ReentrantLock;

public class L1014 {
    public int maxScoreSightseeingPair(int[] A) {
        if(A.length<2)return 0;
        //设i在前 j在后
        int a[] = new int []{A[0],0};
        int b[] = new int []{A[1],1};
        int max = a[0]+b[0]-1;
        for(int i = 2;i<A.length;i++){

            //换掉A
            if((A[i]-i+b[0]+b[1])>(A[i]-i+a[0]+a[1])){
                if((A[i]-i+b[0]+b[1])>=max){
                    a[0] = A[i];
                    a[1] = i;
                    max = A[i]-i+b[0]+b[1];
                }
            }else{
                if((A[i]-i+a[0]+a[1])>=max){
                    b[0] = A[i];
                    b[1] = i;
                    max = A[i]-i+a[0]+a[1];
                }
            }

        }
        return max;

    }
    @Test
    public void test(){
        System.out.println(maxScoreSightseeingPair(new int[]{7,2,6,6,9,4,3}));
    }


    @Test
    public void testAutomicLang() throws InterruptedException {

        Pee p = new Pee();
        Ass ass = new Ass();
        ass.p = p;
        Hole hole = new Hole();
        hole.p = p;
        new Thread(ass).start();
        new Thread(hole).start();
        Thread.sleep(1000000);
    }
    class Ass implements Runnable{

        Pee p;
        @Override
        public void run() {
            while(true){
                p.s=0l;
                if(p.s!=0&&p.s!=-1){
                    System.out.println(p.s);
                }
            }

        }
    }
    class Hole implements Runnable{

        Pee p;
        @Override
        public void run() {
            while(true){
                p.s=-1l;
                if(p.s!=-1&&p.s!=0){
                    System.out.println(p.s);
                }
            }

        }
    }

    class Pee{
        long s = 0;
    }
}
