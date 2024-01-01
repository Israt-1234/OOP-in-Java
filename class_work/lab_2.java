//class 1
package class_worklab;
 abstract class Animal {
    String name; int age;
    public Animal(String name,int age){
     this.name=name;
     this.age=age;
 }
    public String getname(){
        return name;
    }
    public int getage(){
        return age;
    }
   public abstract void makesound();        
}

//class 2

package class_worklab;

public class Dolpin extends Animal {
    String swimdepth;
    public Dolpin(String name,int age, String swimdepth){
        super(name, age);
        this.swimdepth=swimdepth;
    }
    public String getswimdepth(){
        return swimdepth;
    }
    public void makesound(){
        System.out.println("hi hi ");
    }
}
//class 3


package class_worklab;

 class Lion extends Animal {
    String manecolor;
    public Lion(String name, int age,String manecolor) {
        super(name, age);
        this.manecolor=manecolor;
    }
    public  String manecolor(){
        return manecolor;
    }

    @Override
    public void makesound() {
       System.out.println("roya");
    }
    
}

//class4

package class_worklab;

public class Monkey extends Animal{
    String tailength;
    public Monkey(String name, int age, String tailength ){
        super(name,age);
        this. tailength=tailength;
    }
    public String gettailength(){
       return  tailength;
    }
    public void makesound(){
        System.out.println("hello hello");
    }
}
//class 5

package class_worklab;

public class Zoo  {

  public void performdailyfoutine(Animal animal){  
     animal.makesound();
}
}
//main class
package class_worklab;

public class Class_worklab {

    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        Lion lion = new Lion("lion", 5, "pink");
        Monkey monkey = new Monkey("monkey ", 4, "black");
        Dolpin dolpin = new Dolpin("Dolpic ", 6, "white");

        zoo.performdailyfoutine(lion);
        zoo.performdailyfoutine(monkey);
        zoo.performdailyfoutine(dolpin);
        
        
    }

}


    
