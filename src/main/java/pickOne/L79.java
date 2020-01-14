package pickOne;

import org.junit.Test;

public class L79 {
    public boolean exist(char[][] board, String word) {
        char [] cs=word.toCharArray();
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                if(board[i][j]==cs[0]){//检索
                    if(find(board,cs,i,j,0))return true;

                }
            }
        }
        return false;
    }

    public boolean find(char[][] board,char[] cs,int i,int j,int index){
        if(i==-1||j==-1||i==board.length||j==board[0].length||board[i][j]!=cs[index])return false;
        if(board[i][j]==cs[index]){
            char cur=board[i][j];
            board[i][j]='-';
            if(index==cs.length-1)return true;
            boolean flag=
                find(board,cs,i-1,j,index+1)||
                find(board,cs,i+1,j,index+1)||
                find(board,cs,i,j-1,index+1)||
                find(board,cs,i,j+1,index+1);
            board[i][j]=cur;
            if(flag)return true;
        }
        return false;
    }

    @Test
    public void test(){
        char[][] board={{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        System.out.println(exist(board,"ABCCED"));

    }
}
