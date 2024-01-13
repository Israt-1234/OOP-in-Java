
package important_java_exercise;

import java.util.Calendar;

public class Maximum_value_ofthe_year {
    public static void main(String[] args){
        Calendar cal=Calendar.getInstance();
        System.out.println("Current date and time : "+cal.getTime());
        
        int maxYear=cal.getActualMaximum(Calendar.YEAR);
        int maxMonth=cal.getActualMaximum(Calendar.MONTH)+1;
        int maxWeek=cal.getActualMaximum(Calendar.WEEK_OF_YEAR);
        int maxDate=cal.getActualMaximum(Calendar.DATE);
        
       System.out.println("maximum year: "+maxYear);
       System.out.println("maximum Month: "+maxMonth);
       System.out.println("maximum week: "+maxWeek);
       System.out.println("maximum date: "+maxDate);        
    }
}
/*
output--->
--------->
Current date and time : Fri Jan 05 12:12:20 BDT 2024   //shows  current time
maximum year: 292278994
maximum Month: 12
maximum week: 52
maximum date: 31
*/
