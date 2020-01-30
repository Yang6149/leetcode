package like100;

import org.junit.Test;

import java.util.ArrayList;

public class L621 {
    public int leastInterval(char[] tasks, int n) {
        int [][] letters = new int[26][2];//0 个数  1 距离
        for (int i=0;i<tasks.length;i++){
            letters[tasks[i]-'A'][0]++;
        }

        ArrayList<Character> list = new ArrayList<>();
        int count=0;
        while (true){
            int []max={-1,0};//0 index 1 个数
            for (int i=0;i<letters.length;i++){
                if (letters[i][0]>max[1]&&letters[i][1]<=list.size()){
                    max[1]=letters[i][0];
                    max[0]=i;
                }
            }
            if (count==tasks.length)break;
            if (max[0]!=-1&&letters[max[0]][1]<=list.size()){
                count++;
                list.add((char)(max[0]+'A'));
                letters[max[0]][0]--;
                letters[max[0]][1]=list.size()+n;
            }else{
                list.add('-');
            }

        }
        return list.size();
        /**
         * time O(n)的解法，不过我不会证明
         */
//        public int leastInterval(char[] tasks, int n) {
//            int[] counter = new int[26];
//            int max = 0;
//            int maxCount = 0;
//            for(char task : tasks) {
//                counter[task - 'A']++;
//                if(max == counter[task - 'A']) {
//                    maxCount++;
//                }
//                else if(max < counter[task - 'A']) {
//                    max = counter[task - 'A'];
//                    maxCount = 1;
//                }
//            }
//
//            int partCount = max - 1;
//            int partLength = n - (maxCount - 1);
//            int emptySlots = partCount * partLength;
//            int availableTasks = tasks.length - max * maxCount;
//            int idles = Math.max(0, emptySlots - availableTasks);
//
//            return tasks.length + idles;
//        }
    }
    @Test
    public void test(){
        char [] tesk = {'A','A','A','B','B','B'};
        System.out.println(leastInterval(tesk, 2));
    }
}
