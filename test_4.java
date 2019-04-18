package test;

import java.util.regex.*;
import java.math.MathContext;
import java.util.*;

public class test_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String re = "\\(\\d{4}\\)\\d{4}\\-\\d{4}";
        //Scanner in = new Scanner(System.in);
        //String phone = in.nextLine();
        String phone = "(1234)2516-2644";
        if (phone.matches(re)==true)
        	System.out.println("the phone number matches the (0000)0000-0000");  //1
        String ip = "111.142.33.239--412222111.12.33.238";
        Pattern p = Pattern.compile("(\\d{1,3}\\.){3}\\d{1,3}");
        Matcher m = p.matcher(ip);
        while(m.find()) {
        	System.out.println(m.group()); //2
        	} 
            String s = "aaabbbcccddd111";
            String rs = s.replaceAll("(.)(\\1)*","$1");
            System.out.println(rs);  //3
            String s1 = "abcabcdes";
            String rs1 = s1.replaceAll("(abc)(\\1)*","$1");
            System.out.println(rs1);  // 4
            Scanner sc= new Scanner(System.in);
            System.out.println("Please input email :");
            String email = sc.nextLine();
            if (email.matches("[\\w]+@[\\w]+\\.[\\w]+"))
            	System.out.println("The email is legal.");  //5
            else 
            	System.out.println("The email is illegal");
            Scanner sc1 = new Scanner(System.in);
            System.out.println("Please input a string:");
            String str1 = sc1.nextLine();
            if(str1.matches("(.*)abc"))
           	 System.out.println("The string ends with abc "); //6
            else 
              	 System.out.println("The string does not ends with abc");
                 String  s2 = "ae256dd¡ªw348e6";
                 int[]a = new int[10];
                 Pattern p1= Pattern.compile("(\\d)+");
                 Matcher m1 = p1.matcher(s2);
                 int i=0;
                 while (m1.find()) { 
               	  a[i] = Integer.parseInt(m1.group());
               	  i++;
                 }
                 for(int c= 0;c<i;c++) {
               	  System.out.println(a[c]);//8
 } 
              StringBuffer buf = new StringBuffer();
 Pattern p2 = Pattern.compile("pupel");
 Matcher m2 = p2.matcher("pupel and eye pupel and nose pupel");
 while (m2.find()) {
	 m2.appendReplacement(buf, "pupil"); //9
}
}
}