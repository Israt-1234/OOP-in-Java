
package Tic_Tac_ToeWIthAi;

import java.util.Scanner;

public class Player extends Player_Class{ 
    Player(String name, char mark){
        this.name=name;
        this.mark=mark;
    }
    
    void makemove(){
        System.out.println("enter the row and col : ");
        Scanner scan =new Scanner(System.in);
        int row,col;
        do{
            row=scan.nextInt();
            col=scan.nextInt();
            
        }while(!isvalid(row,col));
        LaunchGame.placemark(row, col, mark);
    }
    
    
}
