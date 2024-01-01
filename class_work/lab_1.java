//class 1
package classw;

public class ClassW {

    public static void main(String[] args) {
      Student s1=new Student();
    
      s1.setGrade(89);
      s1.setId("gjfh");
      s1.setAge(34);
      s1.setName("hello");
      s1.getName();
      s1.getGrade();
      s1.getAge();
      s1.getId();
      s1.display();
    }
    
}


package classw;
public class Student {
   String name;
   int age;
   String id;
   double grade;


    public void setName(String name) {
       
        this.name = name;
    }

    public void setAge(int age) {
         if(age>=18 && age<=40){
        this.age = age;
         }
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setGrade(double grade) {
        if(grade>0 && grade<100){
    
        this.grade = grade;
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getId() {
        return id;
    }

    public double getGrade() {
        return grade;
    }
    
    public void  display(){
        System.out.println(grade + " "+name+" "+age+" "+" "+ id+" ");
    
}
}
 
