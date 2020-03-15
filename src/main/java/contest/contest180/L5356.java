package contest.contest180;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class L5356 {
    public List<Integer> luckyNumbers (int[][] matrix) {
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<matrix.length;i++){
            int min=matrix[i][0];
            for(int j=1;j<matrix[i].length;j++){
                min=Math.min(min,matrix[i][j]);
            }
            set.add(min);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0;i<matrix[0].length;i++){
            int max = matrix[0][i];
            for (int j=1;j<matrix.length;j++){
                max=Math.max(max,matrix[j][i]);
            }
            if(set.contains(max))list.add(max);
        }
        return list;
    }
}
