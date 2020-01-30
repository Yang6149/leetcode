package like100;

import org.junit.Test;

public class L739 {
    public int[] dailyTemperatures(int[] T) {
        int [] days = new int[T.length];
        days[days.length-1]=0;
        for (int i=T.length-2;i>=0;i--){
            for (int j=i+1;j<days.length;j++){
                if (T[i]<T[j]){
                    days[i]=j-i;
                    break;
                }else {
                    if (days[j]==0)break;
                    j+=days[j]-1;
                }
            }
        }
        return days;
    }
    @Test
    public void test(){
        int [] T={73, 74, 75, 71, 69, 72, 76, 73};
        System.out.println(dailyTemperatures(T));
    }
}
