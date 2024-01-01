//Inner class can be declared within a method of an outer class.


package Method_local_inner_class;

public class Outer {
    //outer method
    void outermethod(){

        System.out.println("inside outer method");
          //inner class
        class Inner{
            //inner method
             void Innermethod(){
                 System.out.println("insider inner method");
             }
        }
        Inner y=new Inner();
        y.Innermethod();
    }    
                
}
//main

package Method_local_inner_class;

public class Main {
    public static void main(String[] args){
        Outer out = new Outer();
         out.outermethod();
         
    }
}

