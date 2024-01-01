//As a subclass of the specified type(static)
/*
Anonymous inner classes are declared without any name at all. They
are created in two ways.

As a subclass of the specified type

As an implementer of the specified interface
*/

package Anonymous_Inner_Static;

public class Demo {
    void show(){
        System.out.println("iam in show method of super class");
}
}

package Anonymous_Inner_Static;

public class Anon {
    static Demo d = new Demo(){
        void show(){
            super.show();
            System.out.println("i am in my class");
        }
           
    };
}

//main

package Anonymous_Inner_Static;

public class MyClass {
    public static void main(String[] args){
      // object cant creat bz demo obj is static -->see annon clss
        Anon.d.show();
    }
}


/*
run: output
iam in show method of super class
i am in my class
*/
        
