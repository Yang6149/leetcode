package csnote.greedy;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

public class L452 {
    public int findMinArrowShots(int[][] points) {
        if (points.length<1)return 0;
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
        int end=points[0][1];
        int count=0;
        for (int i=1;i<points.length;i++){
            if (points[i][0]>end){
                count++;
                end=points[i][1];
            }else {
                end=Math.min(end,points[i][1]);
            }
        }
        return ++count;
    }
    @Test
    public void test(){
        int [][] points = {{10,16},{2,8},{1,6},{7,12}};
        System.out.println(findMinArrowShots(points));
    }
}
