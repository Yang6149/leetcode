package like100;

public class L1187 {
    public int makeArrayIncreasing(int[] arr1, int[] arr2) {
        int ope=0;
        boolean isSord=false;
        for(int i=0;i<arr1.length-1;i++){
            if(arr1[i]<arr1[i+1]){
                //遍历排序完成
            }else{
                break;
                //未完成
            }
            isSord=true;
        }
        while(!isSord){
            int temp=ope;
            for(int i=0;i<arr1.length-1;i++){
                if(arr1[i]>=arr1[i+1]){

                }

            }
        }

        return ope;
    }

    public static void main(String[] args) {

    }
}
