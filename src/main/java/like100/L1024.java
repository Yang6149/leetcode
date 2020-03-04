package like100;

import org.junit.Test;
import util.ArraysUtil;

import java.util.Arrays;
import java.util.Comparator;

public class L1024 {
    public int videoStitching(int[][] clips, int T) {
        Arrays.sort(clips, (o1,o2)->o1[0]-o2[0]);
        int index = 0;
        int curFarthest=0;
        int curEnd=0;
        int curLoc=0;
        int res=1;
        for(int i=0;i<clips.length;i++){
            curLoc = clips[i][0];
            int b = clips[i][1];
            if(curLoc>curEnd){
                if(curLoc>curFarthest){
                    return -1;
                }else{
                    res++;
                    curEnd=curFarthest;
                }
            }
            curFarthest = Math.max(curFarthest,b);
            if(curFarthest>=T)return res;

        }
        return -1;
    }
    @Test
    public void test(){
        int [][] clips  = ArraysUtil.String22DArray("[[0,1],[6,8],[0,2],[5,6],[0,4],[0,3],[6,7],[1,3],[4,7],[1,4],[2,5],[2,6],[3,4],[4,5],[5,7],[6,9]]");
        System.out.println(videoStitching(clips, 9));

    }




}
