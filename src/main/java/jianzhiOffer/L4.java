package jianzhiOffer;

public class L4 {
    public boolean Find(int target, int [][] array) {
        if(array.length<1||array[0].length<1)return false;
        int x=0;
        int y=array[0].length-1;
        while(true){
            if(y<0||x==array.length)return false;
            if(array[x][y]==target)return true;
            if(array[x][y]>target){
                y--;
                continue;
            }
            if(array[x][y]<target){
                x++;
                continue;
            }
        }

    }
}
