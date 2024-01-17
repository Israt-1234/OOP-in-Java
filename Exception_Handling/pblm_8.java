package exception_handling;

import java.util.Scanner;

public class Throw_exception {
    public static void main(String[] args){
        int num;
        Scanner input =new Scanner(System.in);
        try{
            num=input.nextInt();
            if(num>10)
              throw new Exception();
            
            System.out.println("this is try");
        }
        catch(Exception e){
            System.out.println("NUmber cant be greater");
        }
    }
}
