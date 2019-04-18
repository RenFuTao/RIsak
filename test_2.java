package test;

public class test_2  {
    public static void main(String[] args) {
   	 String str1 = new String("I am a student!");
   	 StringBuffer sb1 = new StringBuffer(str1);
   	 String str2 = new String(sb1);
   	 sb1.append("me too");
   	 System.out.println("添加： me too");
	     System.out.println(sb1);
	     System.out.println("删除： me too");
	     sb1.delete(15, 21);
	     System.out.println(sb1);
	     System.out.print("反转：");
	     System.out.println(sb1.reverse());
	     
   	   
    }
}



