package jianzhiOffer;

public class L10_4 {
    public int JumpFloorII(int target) {
        int [] step = new int[target+1];
        int res=1;
        while(target-->1){
            res=res<<1;
        }
        return res;
    }
}
