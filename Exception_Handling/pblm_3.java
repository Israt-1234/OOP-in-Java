
package exception_handling;

import java.util.Scanner;

public class Exception_handaling_3 {
   public static void main(String[] args) {
    
      while(true){
             try{
            Scanner input=new Scanner(System.in);
       System.out.print("enter the num : ");
       int num1=input.nextInt();
       System.out.print("enter the 2nd number : ");
       int num2=input.nextInt();
       int result=num1/num2;
       
       System.out.println("result : "+num1+" "+num2+" = "+result);
 
       } catch(Exception e){
           System.out.println("Exception "+e);
           System.out.println("you must enter a integer place try again");
           
           
       }
      }
   }
}
