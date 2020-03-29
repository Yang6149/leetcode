package temp;

import org.junit.Test;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Sync {

    volatile int a = 0;
    public synchronized void method1() throws InterruptedException {
        System.out.println(11);
        Thread.sleep(1500);
        System.out.println("1");

    }

    public synchronized void method2() throws InterruptedException {
        System.out.println(22);
        Thread.sleep(800);
        System.out.println("2");
    }

    public void addd(){
        for (int i = 0; i < 1000000; i++) {
            a++;
        }
        System.out.println(a);
    }

    public static void main(String [] args) throws InterruptedException {
        Sync a = new Sync();

        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.execute(new Runnable() {
            @Override
            public void run() {
                a.addd();
            }
        });
        executor.execute(new Runnable() {
            @Override
            public void run() {
                a.addd();
            }
        });
        executor.execute(new Runnable() {
            @Override
            public void run() {
                a.addd();
            }
        });


    }
}
