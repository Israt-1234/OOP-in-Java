//The Circle and Cylinder Classes

package Inheritance1;
public class Circle {
    private double radius;
    private String color;
    
    public Circle(){
        System.out.println("constructor is calling default: ");
        this.color="red";
        this.radius=1.0;
    }
    
    public Circle(double radius){
        System.out.println("constructor for radius: ");
        this.radius=radius;
        this.color="red";
    }
    public Circle(double radius,String color){
        System.out.println("this constructor for radius and color: ");
        this.color=color;
        this.radius=radius;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color=color;
    }
    public String toString(){
        return "color= "+color+" radius ="+radius;
    }
    public double getArea(){
        return Math.PI*radius* radius;
    }
}


package Inheritance1;
public class Cylinder extends Circle{
    private double height;
    
    public Cylinder(){
       super();
      System.out.println("constructor for Cylinder() : ");
       this.height=1.0;
    }
     public Cylinder(double height){
         super();
         System.out.println("this constuctor for cyli(height): ");
         this.height=height;
     }
     public Cylinder(double height,double radius){
         super(radius);
         this.height=height;
     }
     public Cylinder(double height,double radius,String color){
         super(radius,color);
         this.height=height;
     }
     public double getHeight(){
         return height;
     }
     public void setHeight(double height){
         this.height=height;
     }
     public double getVolume(){
         return height*getArea();
     }
    @Override
     public String toString(){
         return "this is a cylinder";
     }    
}


package Inheritance1;
public class Main {
    public static void main(String[] args){
        Cylinder c=new Cylinder();
        System.out.println("radius is "+c.getRadius()+", Height is "+
          c.getHeight()+", color is "+c.getColor()+", bare are is "+
        c.getArea()+" ,volume is "+c.getVolume());
        
        Cylinder c1=new Cylinder(5.0,2.0);
        System.out.println("radius is "+c1.getRadius()+" ,height is "+c1.getHeight()
        +", color is "+c1.getColor()+" ,base are is "+c1.getArea()+" ,volume is "+
                c1.getVolume());        
    }    
        
}
/*
Output--->
----------->
constructor is calling default: 
constructor for Cylinder() : 
radius is 1.0, Height is 1.0, color is red, bare are is 3.141592653589793 ,volume is 3.141592653589793
constructor for radius: 
radius is 2.0 ,height is 5.0, color is red ,base are is 12.566370614359172 ,volume is 62.83185307179586
-------------------------
*/
