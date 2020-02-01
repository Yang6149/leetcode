package temp;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class VersionCompare {
    public int comp(String s1,String s2){
        Comparator<String> Version = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {

                ArrayList<String> l1 = new ArrayList(Arrays.asList(o1.split("\\.")));
                ArrayList<String> l2 = new ArrayList(Arrays.asList(o2.split("\\.")));
                for (int i=0;i<l1.size();i++){
                    int a=Integer.parseInt(l1.get(i));
                    int b=Integer.parseInt(l2.get(i));
                    if (a>b){
                        return 1;
                    }else if(a<b){
                        return -1;
                    }
                }
                return 0;
            }
        };
        return Version.compare(s1,s2);
    }

    @Test
    public void test(){
        String s1 = "1.0.4";
        String s2 = "1.1.4";

        System.out.println(comp(s1,s2));
    }
}
