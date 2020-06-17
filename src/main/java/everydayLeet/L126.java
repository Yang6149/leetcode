package everydayLeet;

import org.junit.Test;

import java.util.*;

public class L126 {
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        Map<String,Integer> String2ID = new HashMap<>();
        List<String> ID2String = new ArrayList<>();
        List<Integer> bian [] = new ArrayList[wordList.size()+1];
        List<List<String>> res = new ArrayList<>();
        for(int i = 0; i < (wordList.size()+1) ;i++){
            bian[i] = new ArrayList<>();
        }
        int id = 0;
        for(String s:wordList){
            String2ID.put(s,id++);
            ID2String.add(s);
        }
        String2ID.put(beginWord,id++);
        ID2String.add(beginWord);

        if(!String2ID.containsKey(endWord))return res;

        for(int i = 0;i<ID2String.size();i++){
            for(int j = i+1;j<ID2String.size();j++){
                if(difO(ID2String.get(i),ID2String.get(j))){
                    bian[i].add(j);
                    bian[j].add(i);
                }
            }
        }
        int dp[] = new int[wordList.size()+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[wordList.size()] = 0;

        //bfs
        Deque<List<Integer>> deque = new ArrayDeque<>();

        List<Integer> temp = new ArrayList<>();
        temp.add(wordList.size());
        deque.add(temp);
        while(deque.size()>0){
            List<Integer> list = deque.pollFirst();
            int last = list.get(list.size() - 1);
            if(last==String2ID.get(endWord)){
                List<String> t = new ArrayList<>();
                for (int index : list) {
                    t.add(ID2String.get(index)); // 转换为对应的word
                }
                res.add(t);
            }else{
                List<Integer> b = bian[last];
                for(Integer to : b){
                    if(dp[to]>=list.size()+1){
                        dp[to] = list.size()+1;
                        List<Integer> t = new ArrayList<>(list);
                        t.add(to);
                        deque.addLast(t);
                    }
                }
            }

        }


        return res;
    }
    public boolean difO(String a,String b){
        if(a.length()!=b.length())return false;
        int def = 0;
        for(int i = 0;i<a.length();i++){
            if(a.charAt(i)!=b.charAt(i))def++;
        }
        return def==1?true:false;
    }

    @Test
    public void test(){
        ArrayList<String> l = new ArrayList<>();
        l.add("hot");
        l.add("dot");
        l.add("dog");
        l.add("lot");
        l.add("log");

        l.add("cog");
        System.out.println(findLadders("hit", "cog", l));
    }

}
