// thread creat 2 ways 
// runable 
// inherite in 
package threading;
public class Make_work_Thread {

    public static void main(String[] args) throws InterruptedException {
  A oj=new A();
  oj.start();
    
         for(int i=0;i<10;i++){
          System.out.println(3);
              try {
                  Thread.sleep(500);
              } catch (InterruptedException ex) {
                 ex.printStackTrace();
              }
         }
  
    }
    
}
class A extends Thread{
  @Override
  public void run(){
       for(int i=0;i<10;i++){
        System.out.println(1);
              try {
                  Thread.sleep(500);
              } catch (InterruptedException ex) {
                 ex.printStackTrace();
              }
      }
  }
}
