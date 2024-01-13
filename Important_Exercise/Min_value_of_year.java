/*
QUESTION :  Write a Java program to get the minimum value 
of year, month, week, date from the current date of a default calendar.

*/
package important_java_exercise;

import java.util.*;
public class Min_value_of_year {

  public static void main(String[] args){
        Calendar cal=Calendar.getInstance();
        
        System.out.println("current date and Time : "+cal.getTime());
        
        int ActualMinYear=cal.getActualMinimum(Calendar.YEAR);
        int ActualMinMonth=cal.getActualMinimum(Calendar.MONTH)+1; //month are zero based
        int ActualMinWeek=cal.getActualMinimum(Calendar.WEEK_OF_YEAR);
        int ActualMinDate=cal.getActualMinimum(Calendar.DATE);
        
        System.out.println("actual minimum year : "+ActualMinYear);
        System.out.println("actual minimum month : "+ActualMinMonth);
        System.out.println("actual minimum week : "+ActualMinWeek);
        System.out.println("actual minimum date : "+ActualMinDate);
        
        
    }
}
