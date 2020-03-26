package temp;

import org.junit.Test;

public class P5to7 {
    @Test
    public void bi(){
        int begin=7;
        int end=23;
        double [] num = new double[end];
        num[0]=1;
        for(int i=0;i<end;i++){
            double [] newNum = new double[end];
            for (int i1 = 0; i1 < num.length; i1++) {
                double temp=num[i1]/begin;
                for (int j=i1+1;j<=i1+begin;j++){

                    newNum[j%end]+=temp;
                }
            }
            num=newNum;
        }
        for (double v : num) {
            System.out.println(v);
        }
    }
}
