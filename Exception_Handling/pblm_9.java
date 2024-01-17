
package exception_handling;

import java.util.Scanner;

public class Throw_exception1 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int number;
           number =input.nextInt();
           try{
               if(number>10){
                   throw new MyException("hello this is myexception");
                //   throw new Exception("hello this is Exception");
                }
               System.out.println("try block end");
           }catch(MyException e){
             System.out.println(e);
           }
           catch(Exception e){
               e.printStackTrace();
           }
    }
}
class MyException extends Exception{
     public MyException(String s){
         super(s);
           
       }
     public MyException(){
         super("hello");
     }
}
