
package Tic_Tac_ToeWIthAi;

 abstract class Player_Class {
    String name;
    char mark;
    abstract void makemove();
     boolean isvalid(int row, int col){
               if(row>=0 && row<=2 && col>=0 && col<=2){
            if(LaunchGame.board[row][col]==' ')
            return true;
        }
        return false;
    }
    
}
