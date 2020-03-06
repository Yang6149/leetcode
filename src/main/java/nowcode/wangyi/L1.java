package nowcode.wangyi;

import org.junit.Test;

import java.text.DecimalFormat;
import java.util.Scanner;

public class L1 {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int peopleNum = in.nextInt();
        int [] mark = new int[peopleNum];
        int markPeople [] = new int[151];
        for(int i=0;i<peopleNum;i++){
            mark[i] = in.nextInt();
            markPeople[mark[i]]++;
        }
        int QueryTimes = in.nextInt();
        int sum = 0;
        for(int i=0;i<151;i++){
            sum+=markPeople[i];
            markPeople[i]=sum-1;
        }
        DecimalFormat df = new DecimalFormat("0.000000");
        for(int i=0;i<QueryTimes;i++){
            int query = in.nextInt();
            double res = ((double)markPeople[mark[query-1]]/(double)peopleNum)*100;
            System.out.println(df.format(res));
        }
    }

    @Test
    public void test(){
        DecimalFormat df = new DecimalFormat("0.000000");
        System.out.println(df.format(1.6548966513d));
    }
}
