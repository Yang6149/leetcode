package temp;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class ConcurrentCompute {
    public static class Compute implements Callable<Double> {
        private double a;
        private double b;
        private boolean f;
        public Compute(double a,double b,boolean f) {
            this.a=a;
            this.b=b;
            this.f=f;
        }

        @Override
        public Double call() throws Exception {
            if(f){
                return a*b;
            }else{
                return a/b;
            }
        }
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        List<Future<Double>> list;
        list = executorService.invokeAll(Arrays.asList(new Compute(1,2,true),new Compute(3,4,false)));
        double sum=0;
        for (Future<Double> doubleegerFuture : list) {
            sum+=doubleegerFuture.get();
        }
        System.out.println(sum);
        executorService.shutdown();
    }
}
