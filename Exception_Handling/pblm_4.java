
package exception_handling;

public class Exception_handling_2 {
  public static void main(String[] args){
        try{
        int[] a=new int[4];
      a[4]=10;
      System.out.println("array 4 :"+a[4]);  
     } catch(ArithmeticException e){
         System.out.println("array 4 :"+e);
  }  catch(ArrayIndexOutOfBoundsException e1){
      System.out.println("array 4 :"+e1);
  }  //catch(Exception e1){
//      System.out.println("array 4 :"+e1);
//  }
        finally{
            System.out.print("last line of the program");
        }
  }
}
