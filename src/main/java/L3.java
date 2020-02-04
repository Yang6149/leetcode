public class L3 {
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        int index=0;

        while (index<length){
            while (numbers[index]!=index){
                if (numbers[numbers[index]]==numbers[index]){
                    duplication[0]=numbers[index];
                    return true;
                }
                int a=numbers[numbers[index]];
                numbers[numbers[index]]=numbers[index];
                numbers[index]=a;
            }
            index++;
        }
        return false;

    }
}
