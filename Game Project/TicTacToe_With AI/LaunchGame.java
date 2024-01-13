
package Tic_Tac_ToeWIthAi;
public class LaunchGame{
   static char[][] board;
    
    public LaunchGame(){
       board=new char[3][3]; 
      initboard();
    }
    public void initboard(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                board[i][j]=' ';
            }
        }
    }
   static void dispboard(){
        System.out.println("--------------");
        for(int i=0;i<board.length;i++){
            System.out.print("| ");
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }
    
    static void placemark(int row,int col, char mark){
        if(row>=0 && row<3 && col>=0 && col<3)
            board[row][col]=mark;
        else
            System.out.println("your input invalid");
    }
    
    static boolean checkcolWin(){
        for(int i=0;i<=2;i++){
            if(board[0][i]!=' ' && board[0][i]==board[1][i] && board[1][i]==board[2][i])
               return true;
            }
             return false;
        }
    
    
    static boolean checkrowwin(){
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
     
      static boolean checkDraw(){
          for(int i=0; i<3; i++){
              for(int j=0;j<3;j++){
                 if(board[i][j]==' ')
                     return false;
              }
          }
          return false;
      }
    
 }

    

