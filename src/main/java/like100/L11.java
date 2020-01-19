package like100;

import org.junit.Test;

import java.util.Arrays;

public class L11 {
    public int maxArea(int[] height) {
        //int [][] juzhen=new int[height.length][height.length];
        //return get(0,height.length-1,height,juzhen);
        int [] is= Arrays.copyOf(height,height.length);
        int [] js= Arrays.copyOf(height,height.length);
        //7  6  9  8  4  10  3  8
        //7  6  9  8  4  10  3  7
        //7 -1  9 -1 -2  10 -1 -2
        //-5-4 -3 -2 -1  10 -1  7
        for(int i=0,max=0,dist=0;i<is.length;i++){//7 -1 9 -1 -2 10 -1 -2 1
            if(is[i]>max){
                max=is[i];
                dist=0;
            }
            else{
                is[i]=--dist;

            }
        }
        for(int i=js.length-1,max=0,dist=0;i>=0;i--){//-5 -4 -3 -2 -1 10
            if(js[i]>max){
                max=js[i];
                dist=0;
            }
            else{
                js[i]=--dist;
            }
        }
//        System.out.println(Arrays.toString(height));
//        System.out.println(Arrays.toString(is));
//        System.out.println(Arrays.toString(js));
        int max=0;
        for(int i=height.length-1,dist=-1;i>=0;i+=dist,dist=-1){
            if(is[i]<0){
                dist=is[i];
                continue;
            }
            for(int j=0,dest=-1;j<height.length;j-=dest,dest=-1){
                if(js[j]<0){
                    dest=js[j];
                    continue;
                }
                int cur=Math.min(height[i],height[j])*Math.abs(j-i);
                if(cur>max)max=cur;
            }
        }
        return max;
    }

    @Test
    public void test(){
        int [] height={10,9,8,7,6,5,4,3,2,1};
        System.out.println(maxArea(height));

    }
    //07  17  06
    //27  16  05  16
}
