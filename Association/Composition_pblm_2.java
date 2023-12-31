/*A class called Author is designed as shown in the class diagram. It contains:

Three private member variables: name (String), email (String), and gender (char of either 'm' or 'f' - you might also use a boolean variable called isMale having value of true or false).
A constructor to initialize the name, email and gender with the given values.
(There is no default constructor, as there is no default value for name, email and gender.)
Public getters/setters: getName(), getEmail(), setEmail(), and getGender().
(There are no setters for name and gender, as these properties are not designed to be changed.)
A toString() method that returns "name (gender) at email", e.g., "Tan Ah Teck (m) at ahTeck@somewhere.com".

--name:string
--email:string
--gender:char
+author(string name, string email, char gender)
+getemail:string
+getname:string
+setemail(string:email)void
+getgender:char
+tostring:string
*/

//Author Class
package Composition_2;

public class Author {
    private String name;
    private String Email;
    private char gender;
    
    //constructor
    Author(String name, String Email, char gender){
        this.name=name;
        this.gender=gender;
        this.Email=Email;
    }
    
    //get method for name,gender, email;
    public String getName(){
        return name;
    }
    public char getgender(){
        return gender;
    }
   
    public String getEmail(){
        return Email;
    }
    //set method only email; no setter for gender and name
    public void setEmail(String Email){
        this.Email=Email;
    }
    //method
    public String tostring(){
        return name+" ("+gender+") at "+Email;
    }
}

//test class
package Composition_2;

public class TestAuthor {
    public static void main(String[] args){
        Author au = new Author("israt jahan","ijisrat5@gmail.com",'f'); // char must single qutation
        //before diclar setter 
        System.out.println(au.tostring());
        au.setEmail("223018312@eastdelta.edu.bd");
        System.out.println(au);
        System.out.println("this is getEmail : "+au.getEmail());
        System.out.println("this is getName : "+au.getName());
        System.out.println("this is gender : "+au.getgender());
                System.out.println(au);
        System.out.println(au.tostring());
        
        
    }
}

