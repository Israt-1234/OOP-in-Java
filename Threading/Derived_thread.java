
package threading;

public class Derived_thred {
    public static void main(String[] args){
       A t1=new A();
       B t2=new B();
       t1.start();
       t2.start();
    }
}

class A extends Thread{
    @Override
    public void run(){
        System.out.println("class A");
    }
}

class B extends Thread{
    @Override
    public void run(){
        System.out.println("class B");
    }
} 
