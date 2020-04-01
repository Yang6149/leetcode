package everydayLeet;

public class L289 {
    class Solution {
        public void gameOfLife(int[][] board) {
            //0 死
            //1 活
            //2 当前状态为死，但马上就活
            //3 当前状态为活，但马上就死
            for(int i=0;i<board.length;i++){
                for(int j=0;j<board[0].length;j++){
                    change(board,i,j);
                }
            }
            for(int i=0;i<board.length;i++){
                for(int j=0;j<board[0].length;j++){
                    change2(board,i,j);
                }
            }
        }

        public void change(int [][] board,int x,int y){
            int deadNum = 0;
            int AliveNum = 0;
            int [][] nums = new int[8][2];
            for(int i = x-1;i<=x+1;i++){
                for(int j = y-1;j<=y+1;j++){
                    if(i==x&&j==y)continue;
                    if(i<0||j<0||i>=board.length||j>=board[0].length)continue;
                    if(board[i][j]==0||board[i][j]==2)deadNum++;
                    else AliveNum++;
                }
            }
            if(board[x][y]==1){
                if(AliveNum<2)board[x][y]=3;
                if(AliveNum>3)board[x][y]=3;
            }else{
                if(AliveNum==3)board[x][y]=2;
            }
        }

        public void change2(int [][] board,int x,int y){
            if(board[x][y]==2)board[x][y]=1;
            if(board[x][y]==3)board[x][y]=0;
        }
    }
}
