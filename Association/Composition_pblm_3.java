/*
Let's design a Book class. Assume that a book is written by one (and exactly one) author.
The Book class (as shown in the class diagram) contains the following members:

Four private member variables: name (String), author (an instance of the Author class we have just created, 
assuming that each book has exactly one author), price (double), and qty (int).
The public getters and setters: getName(), getAuthor(), getPrice(), setPrice(), getQty(), setQty().
A toString() that returns "'book-name' by author-name (gender) at email". You could reuse the Author's toString() method,
which returns "author-name (gender) at email".
*/


//author class
package Composition_1;

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
//book class
//A Book is written by one Author - Using an "Object" Member Variable
package Composition_1;

public class Book {
   private String name;
   private Author author;
   private int qty;
   private double price;
   
   public Book(String name, int qty,Author author, double price){
       this.author=author;
      this.qty=qty;
       this.name=name;
       this.price=price;
   }
//   public void setname(String name){
//       this.name=name;
//   }
   public Author getAuthor(){
       return author;
   }
   public String getname(){
       return name;
   }
   public double getprice(){
       return price;
   }
   public int getqty(){
       return qty;
   }
   public void setqty(int qty){
       this.qty=qty;
   }
   public void setprice(double price){
       this.price =price;
   }
   
   public String tostring(){
       return "'"+name+"' by "+author.getName();
   }
} 

//main class

package Composition_1;

public class TestBook {
    public static void main(String[] args){
        Author aut=new Author("israt jahan ","ijisrat5@gmail.com ",'F');
        
        Book book=new Book("java is domies",344,aut,23344);
        System.out.println(book);
        book.setprice(100000.89);
        book.setqty(10000);
        System.out.println("author is :"+book.getAuthor());//invoke Author
        System.out.println("name is: "+book.getname());
        System.out.println("price is : "+book.getprice());
        System.out.println("qty is :"+book.getqty());
        System.out.println("author name is :"+book.getAuthor().getName());
        System.out.println("Author mail is : "+book.getAuthor().getEmail());
        System.out.println("Author gender is : "+book.getAuthor().getgender());
        
         System.out.println(book.tostring());
         //another book 
         
         System.out.println("\n\n\n");
         Book morebook=new Book("java for more dummies",12,new Author("peter lee","peter34@gamil.com",'m'),19.11);
         System.out.println(morebook);
        System.out.println("author is :"+morebook.getAuthor());//invoke Author
        System.out.println("name is: "+morebook.getname());
        System.out.println("price is : "+morebook.getprice());
        System.out.println("qty is :"+morebook.getqty());
        System.out.println("author name is :"+morebook.getAuthor().getName());
        System.out.println("Author mail is : "+morebook.getAuthor().getEmail());
        System.out.println("Author gender is : "+morebook.getAuthor().getgender());
        
         System.out.println(morebook.getAuthor().tostring());
         System.out.println(morebook.tostring());

    }
}

/*
output---->
----------->
Composition_1.Book@5ca881b5
author is :Composition_1.Author@4f023edb
name is: java is domies
price is : 100000.89
qty is :10000
author name is :israt jahan 
Author mail is : ijisrat5@gmail.com 
Author gender is : F
'java is domies' by israt jahan 




Composition_1.Book@65ab7765
author is :Composition_1.Author@1b28cdfa
name is: java for more dummies
price is : 19.11
qty is :12
author name is :peter lee
Author mail is : peter34@gamil.com
Author gender is : m
peter lee (m) at peter34@gamil.com
'java for more dummies' by peter lee
*/
