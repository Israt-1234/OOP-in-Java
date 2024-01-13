/*
Certainly! This Java program calculates and prints 
the name of the first day and the last day of a specific
month in a given year. Let's go through the code 
*/

package important_java_exercise;
import java.time.*;
import java.time.YearMonth;

public class First_Last_DayNameOf_Month {
    public static void main(String[] args){
   
        YearMonth ym=YearMonth.of(2024,2);
        String firstday=ym.atDay(1).getDayOfWeek().name();   
        String lastday=ym.atEndOfMonth().getDayOfWeek().name();
        System.out.println("first day of the month: "+firstday);
        System.out.println("last day of the month: "+lastday);
    }
}
