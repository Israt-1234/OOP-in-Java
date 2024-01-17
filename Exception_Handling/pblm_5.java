
package exception_handling;

public class Exception_method {
    
    static int dividebyzero(int a, int b){
        int i=a/b;
        return i;
    }
    
    static int computedivision(int a,int b){
        int res=0;
        try{
            res=dividebyzero(a,b);
        }catch(Exception e){
            System.out.println(e);
        }
        return res;
    }
    
    public static void main(String[] args){
    int a=1;
    int b=0;
        
        try{
            int i= computedivision(a,b);
           
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
            
    }
}

