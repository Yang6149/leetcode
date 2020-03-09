package jianzhiOffer;

public class L16 {
    public double Power(double base, int exponent) {
        double res=1;
        if(exponent>0){
            while(exponent-->0){
                res*=base;
            }
        }else if(exponent<0){
            while(exponent++<0){
                res/=base;
            }
        }

        return res;
    }
}
