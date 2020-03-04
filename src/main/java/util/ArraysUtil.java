package util;

public class ArraysUtil {
    public static int [][] String22DArray(String s){
        s.trim();
        s=s.substring(2,s.length()-2);
        String [] ss=s.split("],\\[");
        int [][] res = new int[ss.length][];
        for(int i=0;i<res.length;i++){
            String [] s1 = ss[i].split(",");
            int [] a = new int[s1.length];
            for (int j=0;j<a.length;j++){
                a[j]=Integer.valueOf(s1[j]);
            }
            res[i]=a;
        }
        return res;
    }

    public static void main(String[] args) {
        String22DArray("[[0,1],[6,8],[0,2],[5,6],[0,4],[0,3],[6,7],[1,3],[4,7],[1,4],[2,5],[2,6],[3,4],[4,5],[5,7],[6,9]]");
    }
}
