/*
//The point and circle class--->link:::  https://www3.ntu.edu.sg/home/ehchua/programming/java/J3b_OOPInheritancePolymorphism.html

Two private member variables: a radius (double) and a center (an instance of Point class, which we created earlier).
The constructors, public getters and setters.
Methods getCenterX(), setCenterX(), getCenterY(), setCenterY(), getCenterXY(), setCenterXY(), etc.
A toString() method that returns a string description of this instance in the format of "Circle[center=(x,y),radius=r]". You should re-use the Point's toString() to print "(x,y)".
A distance(Circle another) method that returns the distance from the center of this instance to the center of the given Circle instance (called another).
*/


//point
package Composition_4;
public class Point {
    //The point class
    private int x,y;
    
    public Point(){
        this.x=0;
        this.y=0;
    }
    public Point(int x,int y){
        this.x=x;
        this.y=y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    
    public void setX(int x){
        this.x=x;
    }
    public void setY(int y){
    this .y=y;
    }
    public String tostring(){
        return "("+x+", "+y+ ")";
    }
    
    //+getXY=int[2];
   public int[] getXY(){    
       int[] results =new int[2]; // declaring the array (size of 2)
       results[0]=this.x;
       results[1]=this.y;
       return results;
   }
   
   public void setXY(int x,int y){
       this.x=x;
       this.y=y;
   }
   
   public double distance(int x,int y){
       int xdiff=this.x-x;
       int ydiff=this.y-y;
       return Math.sqrt(xdiff*xdiff+ydiff*ydiff);
   
   }
   public double distance(Point another){
       int xdiff=this.x-another.x;
       int ydiff=this.y-another.y;
      return Math.sqrt(xdiff*xdiff+ydiff*ydiff);
   }
   
   public double distance(){
       return Math.sqrt(this.x*this.x+this.y*this.y);
   }       
}



//circle
package Composition_4;

public class Circle {
    private Point center;
    private double radius;
    
    Circle(){
        this.center=new Point(); //constrator point at(0,0)
        this.radius=1.0;
    }
    
    Circle(int xcenter, int ycenter, double radius){
      this.center=new Point(xcenter, ycenter);
       this.radius=3.00;
    }
    
    public Circle(Point center, double radius){
        this.center=center;  // The caller had constructed a Point instance
        this.radius=radius;
    }
      
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public Point getCenter(){
        return this.center;    //return a Point instance
    }
    public void setCenter(Point center){
        this.center=center;  //instance
    }
    
    public int getCenterX(){
        return center.getX(); //// Point's getX()   
    }
    
    public void setCenterX(int x){
        this.center.setX(x);
    }
    
    public int getCenterY(){
        return center.getY();
    }
    public void setCenterY(int y){
        this.center.setY(y);
    }
    public int[] getCenterXY(){
        return center.getXY();
    }
    public void setCenterXY(int x,int y){
        this.center.setXY(x, y);
    }
    public String toString(){
        return "Center[center="+center+", radius="+radius+"]";
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }
    
    public double getcircumference(){   //poridi
        return 2.0*Math.PI*radius;
    }
    
    public double distance(Circle Another){
        return center.distance(Another.center);
    }
    
}

//main
package Composition_4;

public class TestCircle {
    public static void main(String[] args){
        Circle c1=new Circle();
        System.out.println(c1);
        Circle c2=new Circle(1,2,2.3);
        System.out.println(c2);
        Circle c3=new Circle(new Point(4,5),6.6);
        System.out.println(c3);
        
        
        c1.setCenter(new Point(11,10));
        c1.setRadius(13.3);
        System.out.println(c1);   //circles to string
        System.out.println("center is: "+c1.getCenter());
        System.out.println("radius is: "+c1.getRadius());
        
        c1.setCenterX(21);
        c1.setCenterY(22);
        System.out.println(c1);
        System.out.println("center's x is: " +c1.getCenterX());
        System.out.println("center's y is: " +c1.getCenterY());
        c1.setCenterXY(31,32);
       System.out.println("center's x is: " +c1.getCenterXY()[0]);
       System.out.println("center's y is: " +c1.getCenterXY()[1]);
        
       
       System.out.println("area is : "+c1.getArea());
       System.out.println("circumference is : "+c1.getcircumference());
       
       System.out.println("distance is : "+c1.distance(c2));
       System.out.println("distance is :"+ c2.distance(c1));
        System.out.println("distance is :"+ c2.distance(c3));
       
    }
}

