package pickOne;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * Given a List of words, return the words that can be typed using letters of alphabet on only one row's of American keyboard like the image below.
 * Input: ["Hello", "Alaska", "Dad", "Peace"]
 * Output: ["Alaska", "Dad"]
 */
public class L500KeyBoardRow {
    public static String[] findWords(String[] words) {
        if(words.length<=0||words==null)return new String[0];
        ArrayList<String> list=new ArrayList<>();

        Set<Character> c=new HashSet<>();
        c.add('q');
        c.add('w');
        c.add('e');
        c.add('r');
        c.add('t');
        c.add('y');
        c.add('u');
        c.add('i');
        c.add('o');
        c.add('p');

        Set<Character> c2=new HashSet<>();
        c2.add('a');
        c2.add('s');
        c2.add('d');
        c2.add('f');
        c2.add('g');
        c2.add('h');
        c2.add('j');
        c2.add('k');
        c2.add('l');
        Set<Character> c22=new HashSet<>();
        c22.add('z');
        c22.add('x');
        c22.add('c');
        c22.add('v');
        c22.add('b');
        c22.add('n');
        c22.add('m');
        Set<Character> use=null;

        boolean f=true;
        for(int i=0;i<words.length;i++){
            if(c.contains(words[i].charAt(0))||c.contains((char)(words[i].charAt(0)+32))){
                use=c;
            }
            if(c2.contains(words[i].charAt(0))||c2.contains((char)(words[i].charAt(0)+32))){
                use=c2;
            }
            if(c22.contains(words[i].charAt(0))||c22.contains((char)(words[i].charAt(0)+32))){
                use=c22;
            }
            for(int j=1;j<words[i].length();j++){
                if(!use.contains(words[i].charAt(j))){
                    if(!use.contains((char)(words[i].charAt(j)+32))){

                        f=false;
                        break;
                    }
                }
            }
            if(f){
                list.add(words[i]);
            }
            f=true;
        }

        return list.toArray(new String[list.size()]);
    }

    public static void main(String[] args) {
       //
        String [] word={"Hello","Alaska","Dad","Peace"};
        String [] a=findWords(word);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
