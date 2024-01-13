package Tic_Tac_Toa;
import java.util.Scanner;

public class Human_Player {
    String name;
    char  mark;
    
    Human_Player(String name, char mark){
        this.name=name;
        this.mark=mark;
    }
    void makeMove(){
        System.out.println("Enter the row and col : ");
        Scanner Scan=new Scanner(System.in);
        int row,col;
        do{
            row=Scan.nextInt();
            col=Scan.nextInt();
        }while(!isValidmove(row, col));
        
        TicTacToe.PlaceMark(row, col, mark);
        
    }
    boolean isValidmove(int row,int col){
        if(row>=0 && row<=2 && col>=0 && col<=2){
            if(TicTacToe.board[row][col]==' ')
            return true;
        }
        return false;
    }
    
}
