
package threading;

public class Threading_c {
    public static void main(String[] args){
        int n=8;
        for(int i=0;i<n;i++){
         Multithread obj= new Multithread();
          obj.start();
        }
    }

}
class Multithread extends Thread{
    @Override
    public void run(){
        try{
            System.out.println("Thread"+Thread.currentThread().getId()+"is running");
        }catch(Exception e){
           System.out.println("exception is caught");
        }
   }

}
