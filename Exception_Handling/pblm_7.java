
package exception_handling;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Mrthod_Exception {
    public static double safedivide(int no,int de){
         if(de==0)
             try {
                 throw new Exception();
         } catch (Exception ex) {
             Logger.getLogger(Mrthod_Exception.class.getName()).log(Level.SEVERE, null, ex);
         }
        return 0;
    }
         
    public static void mian(String[] args){
        Scanner o=new Scanner(System.in);
        try{
        int no= o.nextInt();
         int de= o.nextInt();
         double qu = safedivide(no,de);
         System.out.println(qu);
        }
        catch(Exception e){
            System.out.println("i can not do division by zero excception");
        }
        
    }

}
