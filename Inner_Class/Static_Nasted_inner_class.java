/*Static nested classes are not technically inner classes. They are like a
static member of outer class.*/
        
package Static_Nasted_Inner_class;

public class Outer {
    private static void outerMerhod(){
        System.out.println("insider outermethod");
    }
    static class Inner{
        public static void display(){
            System.out.println("inside innermethod");
            outerMerhod();
        }
    }
}

//main class

package Static_Nasted_Inner_class;

public class Main {
    public static void main(String[] args){
    //  Outer out=new Outer(); 
    //inner class is static 
    //The inner class method can be called by Outer.Inner.display();
    Outer.Inner.display();
    }
}

