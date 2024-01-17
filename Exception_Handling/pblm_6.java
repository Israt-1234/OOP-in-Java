
package exception_handling;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MOre_Throw_ex {
    public static void main(String[] args){
        
            A obj=new A();
            try{
                obj.print1();
            }catch(Exception e){
                e.printStackTrace();
            }
            obj.print2();
    }
}
class A{
    public void print1() throws Exception{
      System.out.println("print1");
    }
    public void print2() throws RuntimeException{
        System.out.println("print2");
    }
}
