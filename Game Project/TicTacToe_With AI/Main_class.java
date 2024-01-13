
package Tic_Tac_ToeWIthAi;

public class Main_class {
  public static void main(String[] args){
      LaunchGame l=new LaunchGame();
      Player p1=new Player("Israt",'X');
     AIPlayer p2= new AIPlayer("TAI",'O');
      
      Player_Class cp;
      cp=p1;
      while(true){
          System.out.println(cp.name+" trun");
         cp.makemove();
          LaunchGame.dispboard();
          
          if(LaunchGame.checkcolWin() || LaunchGame.checkrowwin() || LaunchGame.checkdiagonalWin()) 
        {
          System.out.println(cp.name+" has Won");
          break;
        }
          else if(LaunchGame.checkDraw()){
              System.out.println("Game is a Draw");
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
