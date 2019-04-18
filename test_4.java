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
}
}