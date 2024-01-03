/*
//https://www3.ntu.edu.sg/home/ehchua/programming/java/J3b_OOPInheritancePolymorphism.html
// Composition EG. 2: The Point and Line Classes

A Point class models a 2D point at (x,y), as shown in the class diagram. It contains the following members:

2 private instance variables x and y, which maintain the location of the point.
Constructors, getters and setters.
A method setXY(), which sets the x and y of the point; and a method getXY(), which returns the x and y in a 2-element int array.
A toString(), which returns "(x,y)".
3 versions of overloaded distance():
distance(int x, int y) returns the distance from this instance to the given point at (x,y).
distance(Point another) returns the distance from this instance to the given Point instance (called another).
distance() returns the distance from this instance to (0,0).
  */
//The point class
package composition_3;

public class Point {
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


package composition_3;

public class TestPoint {
    public static void main(String[] args){
        Point p1=new Point(1,2);
        System.out.println(p1);
        Point p2=new Point();
        System.out.println(p2);
        
        p1.setX(3);
        p1.setY(4);
        System.out.println("X is : "+p1.getX());
        System.out.println("Y is :"+p1.getY());
        
        p1.setXY(5,6 );
        System.out.println(p1);
        System.out.println("X is : "+ p1.getXY()[0]);
        System.out.println("y is : "+p1.getXY()[1]);
        
        
        p2.setXY(10,11);
        //p2(x,y)=(10,11);
        //p1(x,y)=(5,6);
        
        System.out.println("distance is p1 : %.2f%n "+p1.distance(10,11));
        // distance is ((10-5)*(10-5)+(11-6)*(11-6))=7.07;
        System.out.println("distance is : "+p1.distance(p2));
        // distance is ((10-5)*(10-5)+(11-6)*(11-6))=7.07;
        System.out.println("distance is :"+p2.distance(p1));
        // distance is ((10-5)*(10-5)+(11-6)*(11-6))=7.07;
        System.out.println("distance is : "+p1.distance());
        //Distance is: 7.81
    }
    
}
