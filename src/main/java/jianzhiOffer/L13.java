package jianzhiOffer;

import org.junit.Test;

public class L13 {
    public int movingCount(int threshold, int rows, int cols)
    {
        int [][] d = new int[rows][cols];
        return move(0,0,rows,cols,threshold,d);
    }
    public int move(int x,int y,int rows,int cols,int threshold,int [][] d){

        int cx=x,cy=y;
        int xSize=0;
        int ySize=0;
        if(x>=rows||y>=cols){
            return 0;
        }
        if(d[x][y]==1)return 0;
        while(x>0){
            xSize+=x%10;
            x=x/10;
        }
        while(y>0){
            ySize+=y%10;
            y=y/10;
        }
        if(xSize+ySize>threshold){
            return 0;
        }
        int res=0;
        d[cx][cy]=1;
        return 1+move(cx,cy+1,rows,cols,threshold,d)+move(cx+1,cy,rows,cols,threshold,d);
    }
    @Test
    public void test(){
        System.out.println(movingCount(3,100,100));
    }
}
