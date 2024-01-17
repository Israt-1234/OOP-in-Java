
package exception_handling;

public class Exception_Handling {

    public static void main(String[] args) {        
    try{
       int x=12;
     int y=0;
     int result =x/y;
     System.out.println("result :"+result);
    }catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Exception: "+e);
          }catch(ArithmeticException e1){
        System.out.println("Exception: "+e1);
    }
    // this is super class .its always write last content
//    catch(Exception e_koliza) {
//        System.out.println("Exception: "+e_koliza);
//    }
    finally{
        System.out.println("late line of the program");
    }
    }
    
}
