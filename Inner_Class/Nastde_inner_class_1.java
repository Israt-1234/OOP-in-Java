
package Nasted_inner_class_1;


public class Outerclass {
    private int outervar;
    public Outerclass(int var){
       outervar=var;
    }
    public void outerMethod(){
        System.out.println("this is outer method");
    }
    public class Innerclass{
        private int Innervar;
        public Innerclass(int var){
            Innervar=var;
        }
        public void innerMethod(){
            System.out.println("this is INner method "+Innervar);
        }
        public void accessOuterVar(){
            System.out.println("Outer variable from inner class "+outervar);
        }
    }
}

//main class
package Nasted_inner_class_1;


public class Main {
    public static void main(String[] args){
        Outerclass out=new Outerclass(10);
        Outerclass.Innerclass inn =out.new Innerclass(21);
        inn.innerMethod();
        inn.accessOuterVar();
        out.outerMethod();
        
    }
}

    
