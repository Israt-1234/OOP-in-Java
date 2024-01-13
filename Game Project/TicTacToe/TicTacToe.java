package Tic_Tac_Toa;

public class TicTacToe {
  static char[][] board;
    
    //constructor
    public TicTacToe(){
        board=new char[3][3];
        initboard();
    }
    
    void initboard(){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                board[i][j]=' ';
            }
        }
    }
    
   static void dispboard(){
        System.out.println("-------------");
        for(int i=0;i<board.length;i++){
            System.out.print("| ");
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" | "); 
            }
            System.out.println();
            System.out.println("-------------");
        }
    }
    
   static void PlaceMark(int row,int col, char mark){
      // board[row][col]=mark; 
      if(row>=0 && row<3 && col>=0 && col<3){
           board[row][col]=mark; 
      }
      else
          System.out.println("You Input Invalid Position");
          
    }
   
  static boolean checkcolWin(){
         
       for(int i=0;i<=2;i++){
           if(board[0][i]!=' ' && board[0][i]==board[1][i] && board[1][i]==board[2][i])
               return true;
       }
        return false;
   }
  static boolean checkrowWin(){
     
       for(int i=0;i<=2;i++){
           if(board[i][0]!=' ' && board[i][0]==board[i][1] && board[i][1]==board[i][2])
               return true;
       }
        return false;
    }
   
  static boolean checkdiagonalWin(){
       if(board[0][0]!=' ' && board[0][0]==board[1][1] && board[1][1]==board[2][2])
           return true;
     
       else if(board[0][2]!=' '&& board[0][2]==board[1][1] && board[1][1]==board[0][2])
           return true;
       else
           return false;
   
   }
   
}
