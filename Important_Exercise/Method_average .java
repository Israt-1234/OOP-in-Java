/*
QUESTION: Write a Java method to compute the average of three numbers.
*/
package important_java_exercise;

import java.util.Scanner;

public class Method_average {
    public static double Average(int x,int y,int z){
        return (x+y+z)/3;
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        
        System.out.println("enter the first number : ");
        int num1=input.nextInt();
        
        System.out.println("enter the first number : ");
        int num2=input.nextInt();
        
        System.out.println("enter the first number : ");
         int num3=input.nextInt();
         
         System.out.println("average num is = "+Average(num1,num2,num3));
    }
}
