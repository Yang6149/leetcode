package contest.contest172;

import org.junit.Test;

public class L1 {
    public int maximum69Number (int num) {
        int copy=num;
        for(int i=9;i>=0;i--){

            if(num/ten(1,i)==6){
                copy+=ten(3,i);
                break;
            }
            num=num%ten(1,i);

        }
        return copy;
    }
    public int ten(int tar,int a){

        for(int i=0;i<a;i++){
            tar=tar*10;
        }
        return tar;
    }

    @Test
    public void tets(){
        System.out.println(maximum69Number(9996));
    }
}
