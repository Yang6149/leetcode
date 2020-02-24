package jianzhiOffer;

public class L10_2 {
    public int RectCover(int target) {
        int pre = 1;
        int aft = 1;
        if(target==0)return 0;
        if(target==1)return 1;
        int index=1;
        while(index<target){
            int temp = aft;
            aft=pre+aft;
            pre=temp;
            index++;
        }
        return aft;
    }
}
