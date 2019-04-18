package test;

import java.util.regex.*;
public class test_1  {
	   public static void main(String[] args) {
			String string="this is a test of java";
		    int count=0;
		    for(int i=0;i<string.length();i++) {
		    	char c=string.charAt(i);
		    	if(c=='s')
		    		count++;
		    }
		    System.out.println("S出现的次数:"+count);//1
		    
		    System.out.println("去除子字符串test:"+string.substring(10,14));//2
		    
		      char str[];
		      str= string.toCharArray();
		      System.out.println(str);//3
		      String regex = "[a-zA-Z]+";
		      Pattern p = Pattern.compile(regex);
		      Matcher m = p.matcher(string);
		      
		      while(m.find()) {
		    	  System.out.println(m.group().substring(0,1).toUpperCase()+m.group().substring(1));//4  
		      }

		      StringBuffer sb = new StringBuffer(string);
		      System.out.println("StringBuffer倒序输出"+sb.reverse()); //5
		      int i = 0;
		      System.out.print("for倒序输出:");
		      for(i=string.length()-1;i>=0;i--) {
		    	  System.out.print(string.charAt(i));//5
		      }
		      System.out.println();
		     Matcher m1 = p.matcher(string);
		     String [] s= new String[10];
		     i=0;
		     while(m1.find()) {
		    	 s[i]=m1.group();
		    	 i++;
		     }
		     for(i=0;s[i]!=null;i++)
		     System.out.println(s[i]);//6
		   }
		}