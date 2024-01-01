
package Annonimas_public;

public class Demo {
    void show(){
        System.out.println("iam in show method of super class");
  }
}


package Annonimas_public;
public class Anon {
    public Demo d=new Demo(){

        @Override
        void show() {
            super.show(); 
            System.out.println(" iam is my class");
        }
    };
}

//main class

package Annonimas_public;

public class Myclass {
    public static void main(String[] args){
        Anon an=new Anon();
        an.d.show();
    }
}
/*
output-->
--------------
iam in show method of super class
iam is my class
*/
