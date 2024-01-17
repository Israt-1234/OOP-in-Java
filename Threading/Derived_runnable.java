
package threading;

public class Derived_runnable {
     public static void main(String[] args){
        A t1=new A();
       B t2=new B();  
       Thread obj=new Thread(t1);
        Thread obj1=new Thread(t2);
        obj.start();
        obj1.start();
       
     }
}

class A implements Runnable{
    @Override
    public void run(){
        System.out.println("class A");
    }
}

class B implements Runnable{
    @Override
    public void run(){
        System.out.println("class B");
    }
} 
