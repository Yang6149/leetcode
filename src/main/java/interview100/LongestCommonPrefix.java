package interview100;

import java.util.HashSet;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String longest="";
        if (strs.length<1)return "";
        if (strs.length>1){
            if (strs[0].length()<1)return "";
            longest=strs[0];
        }
        for (int i=1;i<strs.length;i++){
            if (strs[i].length()<1)return "";
            for (int j=0;j<longest.length();j++){
                if (strs[i].length()==j||strs[i].charAt(j)!=longest.charAt(j)){
                    longest=longest.substring(0,j);
                    break;
                }
            }
        }
        return longest;

    }
}
