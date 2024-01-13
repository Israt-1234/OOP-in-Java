
package Tic_Tac_Toa;


public class LaunchGame {
    public static void main(String[] args){
        TicTacToe t=new TicTacToe();
        Human_Player p1=new Human_Player("Israt",'X');
        Human_Player p2=new Human_Player("Raiyan",'O');
        
       Human_Player cp;
       cp=p1;
    while(true){
       System.out.println(cp.name+" Turn");
       cp.makeMove();
       TicTacToe.dispboard();
      if(TicTacToe.checkcolWin() || TicTacToe.checkrowWin() || TicTacToe.checkdiagonalWin()) 
      {
          System.out.println(cp.name+" has Won");
          break;
      }
      else{
          if(cp==p1)
              cp=p2;
          else
              cp=p1;
       }
     }      
  }
 }
