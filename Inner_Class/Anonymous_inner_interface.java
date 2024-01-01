/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Annonimus_inner_Interface_static;

public interface Demo {
    public void show();
}



package Annonimus_inner_Interface_static;

public class Anon {
        static Demo d=new Demo(){

        @Override
        public void show() {
          
            System.out.println(" iam is my class");
        }
    };
}
//
/*
main class{
    psvm(){
        anon.d.show();
}
*/
