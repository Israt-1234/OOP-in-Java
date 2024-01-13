
package Tic_Tac_ToeWIthAi;

import java.util.Random;
import java.util.Scanner;

public class AIPlayer extends Player_Class{
   
   AIPlayer(String name, char mark){
        this.name=name;
        this.mark=mark;
    }
    
   @Override
    void makemove(){
        System.out.println("enter the row and col : ");
        Scanner scan =new Scanner(System.in);
        int row,col;
        do{
           
            Random r=new Random();
             row=r.nextInt(3);
            col=r.nextInt(3);
        }while(!isvalid(row,col));
        LaunchGame.placemark(row, col, mark);
    }
    
}


