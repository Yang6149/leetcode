package pickOne;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;

/**
 * All DNA is composed of a series of nucleotides abbreviated as A, C, G, and T, for example: "ACGAATTCCG". When studying DNA,
 * it is sometimes useful to identify repeated sequences within the DNA.
 *
 * Write a function to find all the 10-letter-long sequences (substrings) that occur more than once in a DNA molecule.
 */
public class L187RepeatedDNA {
    public static  List<String> findRepeatedDnaSequences(String s) {
        List<String> list=new ArrayList<>();
        if(s.length()<10){
            return list;
        }
        HashMap<String,Integer> table=new HashMap<>();
        for(int i=0;i<s.length()-9;i++){
            String sub=s.substring(i,i+10);

//            if(table.get(sub)==null){
//                table.put(sub,1);
//                continue;
//            }
            if(table.containsKey(sub)){
                if(table.get(sub)==1){
                    list.add(sub);
                    table.put(sub,2);
                }
            }else {
                table.put(sub,1);
            }


        }

        return list;
    }

    public static void main(String[] args) {
        String a="AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        System.out.println(findRepeatedDnaSequences(a));
    }
}
