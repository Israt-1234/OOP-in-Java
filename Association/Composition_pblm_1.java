//Engine Class
package Cmposition;

public class Engine{
    
    String name; 
   int price; int model;
   Engine(String name, int price, int model){
       this.model=model;
       this.name=name;
       this.price=price;
   }
}

//car class
package Cmposition;

public class Car {
     Engine engine;
    int nam,mod;
    Car(Engine engine, int nam, int mod){
        this.engine=engine;
        this.mod=mod;
        this.nam=nam;    
    }
      void display(){
     System.out.println(nam+" "+mod);
     System.out.println(engine.name+" "+engine.model+" "+engine.price);
   }
}

// test class
package Cmposition;

public class TestCompo{
     public static void main(String[] args){
    Engine en=new Engine("toyota",100000,4244);
    Car cr=new Car(en,345,6733);
    cr.display();
    }    
}
