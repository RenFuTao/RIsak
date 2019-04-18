package test;
import java.util.Scanner;

public class test_3 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
        
        Integer i = 10; //or Integer i = new Integer(10); 
        Boolean b = true;
        System.out.println("int-> integer: "+i+"  boolean -> Boolean:"+b);
        int num = i.intValue();boolean bo = b.booleanValue();
        System.out.println("Integer - > int:"+num+"  Boolean -> boolean:"+bo);
        Double d = Double.valueOf("8.88");
        System.out.println("str -> Double :"+d);
        String str = d.toString();
        System.out.println("Double -> str :"+str);
        int number = Integer.parseInt("6");
        System.out.println("str->int :"+number);
        str = String.valueOf(number);
        System.out.println("int -> str :"+str);
       
	}

}