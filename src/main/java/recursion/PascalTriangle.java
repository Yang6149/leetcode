package recursion;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public List<Integer> getRow(int rowIndex) {
        if(rowIndex<0)return new ArrayList<>();
        //上一层
        //下一层
        List<List<Integer>> arrays=new ArrayList<>();
        List<Integer> array=new ArrayList<>();
        array.add(1);

        arrays.add(array);
        return function(arrays,rowIndex);
    }
    public List<Integer> function(List<List<Integer>> arrays,int num){
        if(num==0)return arrays.get(arrays.size()-1);
        List<Integer> array=arrays.get(arrays.size()-1);
        List<Integer> nArray=new ArrayList<>();
        nArray.add(array.get(0));
        for(int i=0;i<array.size()-1;i++){
            nArray.add(array.get(i)+array.get(i+1));
        }
        nArray.add(array.get(array.size()-1));
        arrays.add(nArray);
        return function(arrays,num-1);
    }
}
