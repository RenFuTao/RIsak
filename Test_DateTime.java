package test;

import java.time.*;
import java.time.format.*;
import java.util.Scanner;

public class Test_DateTime {
	void timeprint(LocalDateTime t){
  	  
	      System.out.println(t.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT,FormatStyle.SHORT)));
	      System.out.println(t.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM,FormatStyle.MEDIUM)));
          System.out.println(t.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG,FormatStyle.LONG)));
	      System.out.println(t.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL,FormatStyle.LONG)));
     }
   
	     public static void main(String[] args) {
	    	 
	         Scanner sc = new Scanner(System.in);
	         String s = sc.next();
	         LocalDate myDate = LocalDate.parse(s,DateTimeFormatter.ofPattern("yyyy-MM-dd"));
	         myDate = myDate.plusDays(7);
	         System.out.println(myDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
             LocalDateTime myDateTime = LocalDateTime.now(); //获取当前日期时间
             System.out.println(myDateTime);
             Test_DateTime T = new Test_DateTime(); 
             T.timeprint(myDateTime); 
             myDateTime = myDateTime.minusYears(2).minusMonths(2).minusDays(2).minusHours(2);
             T.timeprint(myDateTime);
             
	     }
	         
}