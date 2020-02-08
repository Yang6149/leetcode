package nowcode.aiqiyi;

import java.util.Scanner;

public class aiqiyi2020 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        long [] position = new long[3];
        long [] kan = new long[3];
        position[0]=625  ;
        position[1]=945297  ;
        position[2]=543   ;
        long splits=310290;
        long [] max = new long[2];

        while(splits>0){
            max[0]=Integer.MAX_VALUE;
            max[1]=0;
            if(position[0]>1){
                if (kan[0]<max[0]){
                    max[0]=kan[0];
                    max[1]=0;
                }
            }
            if(position[1]>1){
                if (kan[1]<max[0]){
                    max[0]=kan[1];
                    max[1]=1;
                }
            }
            if(position[2]>1){
                if (kan[2]<max[0]){
                    max[0]=kan[2];
                    max[1]=2;
                }
            }
            if (position[0]==1&&position[1]==1&&position[2]==1)break;
            kan[(int)max[1]]++;
            position[(int)max[1]]--;
            splits--;
        }
        long res=(kan[0]+1)*(kan[1]+1)*(kan[2]+1);
        System.out.println(res);
    }

}
