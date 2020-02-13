package csnote.greedy;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

public class L435 {
    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length<1)return 0;
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1]-o2[1];
            }
        });
        int count=1;
        int end=intervals[0][1];
        for (int i=1;i<intervals.length;i++){
            if (intervals[i][i]>=end){
                count++;
                end=intervals[i][1];
            }
        }
        return intervals.length-count;
    }

    @Test
    public void test(){
        int [][] ss= {{0,2},{1,3},{2,4},{3,5},{4,6}};
        System.out.println(eraseOverlapIntervals(ss));
    }
}
