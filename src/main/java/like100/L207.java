package like100;

import org.junit.Test;

import java.util.*;

public class L207 {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int [] incomingedge=new int[numCourses];
        ArrayList<Integer> [] goCourses = new ArrayList[numCourses];
        for (int i=0;i<numCourses;i++){
            goCourses[i]=new ArrayList<>();
        }
        for (int[] prerequisite : prerequisites) {
            incomingedge[prerequisite[0]]++;
            goCourses[prerequisite[1]].add(prerequisite[0]);
        }
        Queue<Integer> queue=new ArrayDeque<>();

        for (int i=0;i<numCourses;i++){
            if(incomingedge[i]==0){
                queue.add(i);
            }
        }
        int edgeCut=prerequisites.length;
        while (!queue.isEmpty()){
            int cur=queue.poll();
            for (Integer goCour : goCourses[cur]) {
                edgeCut--;
                if(--incomingedge[goCour]==0){
                    queue.add(goCour);
                }
            }
        }
        return edgeCut==0;
    }


    @Test
    public void test(){
        int [][] nums={{0,1},{1,2}};
        System.out.println(canFinish(3,nums));
    }
}
