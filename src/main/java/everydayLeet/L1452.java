package everydayLeet;

import java.util.*;

public class L1452 {
    public List<Integer> peopleIndexes(List<List<String>> favoriteCompanies) {
        ArrayList<Set<String>> list = new ArrayList<>();
        for(List<String> l:favoriteCompanies)list.add(new HashSet<>(l));
        int [][] dic = new int[list.size()][2];
        for(int i = 0;i<list.size();i++){
            dic[i][0] = i;
            dic[i][1] = favoriteCompanies.get(i).size();
        }
        Arrays.sort(dic,(a, b)->(a[1]-b[1]));
        ArrayList<Integer> res = new ArrayList<>();
        res.add(dic[0][0]);
        for(int i = 1;i<dic.length;i++){
            boolean flag = true;
            List<String> companies1 =favoriteCompanies.get(dic[i][0]);
            for(Integer a:res){
                if(list.get(a).containsAll(companies1)){
                    flag = false;
                    break;
                }
            }
            if(flag){
                res.add(dic[i][0]);
            }
        }
        return res;

    }
}
