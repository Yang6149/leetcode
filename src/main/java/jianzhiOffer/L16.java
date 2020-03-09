package jianzhiOffer;

public class L16 {
    //递归O（logn）
    public double Power(double base, int exponent) {
        if (exponent == 0)
            return 1;
        if (exponent == 1)
            return base;
        double res=1;
        boolean isNegative = false;
        if (exponent < 0) {
            exponent = -exponent;
            isNegative = true;
        }
        double pow = Power(base * base, exponent / 2);
        if (exponent % 2 != 0)
            pow = pow * base;
        return isNegative ? 1 / pow : pow;
    }
}
