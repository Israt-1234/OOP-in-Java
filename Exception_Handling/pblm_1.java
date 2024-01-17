
package exception_handling;

import java.util.Scanner;

public class Excep_throw {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        int  home= input.nextInt();
        int away = input.nextInt();
        try{
            if(home==0 && away==0)
            throw new Exception("match is cancled .");
            else if(home==0)
                throw new Exception("home is lost");
            else if(away==0)
               throw new Exception("away is lost");
                }
        catch(Exception e){
            System.out.println(e+" "+e.getMessage());
            
        }
        
    }
}
