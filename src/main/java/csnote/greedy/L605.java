package csnote.greedy;

import org.junit.Test;

public class L605 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int sum=0;
        for(int i=0;i<flowerbed.length;i++){
            if(flowerbed[i]==1){
                i++;
                continue;
            }
            if(i+1!=flowerbed.length&&flowerbed[i+1]==1){
                continue;
            }
            sum++;
            i++;
        }
        return sum>=n;
    }
    @Test
    public void test(){
        int [] a = {1,0,0,0,1};
        System.out.println(canPlaceFlowers(a,1));
    }
}
