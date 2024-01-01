
package Nasted_Inner_class;
//outer class
public class Outer {
    //inner class
    // inner class excess all outer class properties
    class Inner{
        //inner method
        public void show(){
            System.out.println("in a nested inner class ");
        }
    }
}

package Nasted_Inner_class;

public class Main {
   public static void main(String[] args) {
       // created outer class object 
       Outer outer = new Outer();
       //inner class object is created
       Outer.Inner in=new Outer().new Inner();
       
       //inner class method show is calling
       in.show();
   }
       
}


