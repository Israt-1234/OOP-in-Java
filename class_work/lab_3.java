/*
1. Create a `Student` class with private attributes:
- `name` (String)
- `age` (int)
- `studentID` (String)
- `grade` (double)

2. Implement setter and getter methods for each attribute to ensure encapsulation.

3. Include validation in the setter methods:
- Ensure the age is between 18 and 40.
- Ensure the grade is between 0 and 100.

4. Create a method `displayInfo()` to display the student's information.

5. In the main program:
- Create an instance of the `Student` class.
- Set information using the setter methods.
- Display the student's information using the `displayInfo` method.
  */

//student class
package Class_work2;
public class Student {
    private String nama;
    private int age;
    private String studentId;
    private double grade;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>=18 && age<=40){
        this.age = age;
    }
        else
            System.out.println("invalid age");
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        if(grade>=0 && grade<=100)
        this.grade = grade;
        else
            System.out.println("invalid grade");
    }
    
    public void displayinfo(){
        System.out.println("student name : "+getNama());
        System.out.println("student id : "+getStudentId());
        System.out.println("student age : "+getAge());
        System.out.println("student gread : "+getGrade());
        
  }
}

//main class

package Class_work2;

public class Main {
    public static void main(String[] args){
    Student student=new Student();
    student.setStudentId("223018312");
    student.setAge(21);
    student.setGrade(5.00);
    student.setNama("israt jahan");
    student.displayinfo();
    
    System.out.println("\n");
    //other student
     student.setStudentId("2230183342");
    student.setAge(20);
    student.setGrade(4.00);
    student.setNama("peter");
    student.displayinfo();
    }
}

/*
Output->
---------->
student name : israt jahan
student id : 223018312
student age : 21
student gread : 5.0


student name : peter
student id : 2230183342
student age : 20
student gread : 4.0
*/
