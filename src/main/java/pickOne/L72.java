package pickOne;

import org.junit.Test;

import java.util.ArrayList;

public class L72 {
    public int minDistance(String word1, String word2) {
        char [] w1=word1.toCharArray();
        char [] w2=word2.toCharArray();
        int [] char1=new int[word1.length()+1];
        for(int i=0;i<word1.length()+1;i++){
            char1[i]=i;
        }

        for(int i=1;i<word2.length()+1;i++){
            int leftup=char1[0];
            char1[0]=i;
            for(int j=1;j<word1.length()+1;j++){
                int newleftup=char1[j];
                if(w1[j-1]==w2[i-1]){
                    char1[j]=leftup;
                }else{
                    char1[j]=Math.min(Math.min(leftup,char1[j-1]),char1[j])+1;
                }
                leftup=newleftup;
            }
        }
        return char1[word1.length()];


    }
    @Test
    public void test(){
        String word1="horse";
        String word2="ros";
        System.out.println(minDistance(word1,word2));
    }
}
