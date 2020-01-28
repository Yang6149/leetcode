package like100;

import org.junit.Test;

import java.util.*;

public class L406 {
    public int[][] reconstructQueue(int[][] people) {
        LinkedList<int[]> linkedList = new LinkedList<>();
        int [][] res = new int[people.length][2];
        Arrays.sort(people, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]==o2[0]?o1[1]>o2[1]?1:-1:o1[0]>o2[0]?-1:1;
            }
        });
        for (int[] person : people) {
            linkedList.add(person[1],person);
        }
        return linkedList.toArray(new int[people.length][]);
    }
    @Test
    public void test(){
        int [][] nums = {{7,0},{4,4},{7,1},{5,0},{6,1},{5,2}};
        for (int[] ints : reconstructQueue(nums)) {
            for (int anInt : ints) {
                System.out.print(anInt);
            }
            System.out.println();
        }
    }
}
