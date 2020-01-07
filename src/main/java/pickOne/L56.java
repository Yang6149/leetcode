package pickOne;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class L56 {
    public int[][] merge(int[][] intervals) {
        for (int[] ints : intervals) {
            for (int anInt : ints) {
                System.out.print(anInt);
            }
            System.out.println();
        }
        sort(intervals,0,intervals.length-1);
        for (int[] ints : intervals) {
            for (int anInt : ints) {
                System.out.print(anInt);
            }
            System.out.println();
        }
        if(intervals.length<1)return intervals;
        int lastNum=intervals[0][1];
        int beginNum=intervals[0][0];
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<intervals.length;i++){
            if(intervals[i][0]<=lastNum){
                if(intervals[i][1]>lastNum){
                    lastNum=intervals[i][1];
                }
            }else {
                list.add(beginNum);
                list.add(lastNum);

                beginNum=intervals[i][0];
                lastNum=intervals[i][1];
            }

        }
        list.add(beginNum);
        list.add(lastNum);

        //System.out.println(list);
        int [][] result=new int[list.size()/2][];
        for(int i=0;i<list.size()/2;i++){
            result[i]=new int[]{list.get(i*2),list.get(i*2+1)};
        }
        return result;
    }
    public void sort(int [][]intervals,int begin,int end){
        int i=begin;
        int j=end;
        if(i>=j)return ;
        int [] keng=intervals[i];
        while (i<j){
            while(intervals[j][0]>keng[0]&&i<j)j--;
            if(i<j&&intervals[j][0]<=keng[0]){
                intervals[i]=intervals[j];
                i++;
            }
            while(intervals[i][0]<keng[0]&&i<j)i++;
            if(i<j&&intervals[i][0]>=keng[0]){
                intervals[j]=intervals[i];
                j--;
            }
        }
        intervals[i]=keng;
        sort(intervals,begin,i-1);
        sort(intervals,i+1,end);
    }
    @Test
    public void test(){
        int [][]a={{1,3},{2,6},{8,10},{15,18}};
        int b[][]=merge(a);
//        for (int[] ints : b) {
//            for (int anInt : ints) {
//                System.out.print(anInt);
//            }
//            System.out.println();
//        }
    }

}
