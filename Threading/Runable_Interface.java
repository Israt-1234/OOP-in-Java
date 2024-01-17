
package threading;

public class Runable_Interface {
    public static void main(String[] args){
       myThread t2=new myThread();
      Thread t3= new Thread(t2,"my thread 1");
       t3.start();
      // System.out.println(t3.getName());
      Thread t4= Thread.currentThread();
      System.out.println("inside the main mathod "+t4.getName());
       
  }


}

class myThread extends B implements Runnable{
    
    public void run(){
         System.out.println("inside the run mathod "+Thread.currentThread().getName());
        for(int i=0;i<10;i++){
            System.out.println("1");
            try{
                Thread.sleep(500);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
class B{
    
}

