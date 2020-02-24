package jianzhiOffer;

public class L10 {
    public int Fibonacci(int n) {
        int pre = 0;
        int aft = 1;
        if(n==0)return 0;
        if(n==1)return 1;
        int index=1;
        while(index<n){
            int temp = aft;
            aft=pre+aft;
            pre=temp;
            index++;
        }
        return aft;
    }
}
