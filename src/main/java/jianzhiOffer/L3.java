package jianzhiOffer;

public class L3 {
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        if(numbers==null||numbers.length<1){
            //duplication[0]=-1;
            return false;
        }
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==i)continue;
            if(numbers[i]!=numbers[numbers[i]]){
                int temp = numbers[i];
                numbers[numbers[i]]=numbers[i];
                numbers[i]=temp;
            }else{
                duplication[0]=numbers[i];
                return true;
            }
        }
        return false;
    }
}
