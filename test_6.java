package test;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class test_6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r1 = new Random();
		int []array1 =new int[10];
		int []array2 = new int[10];
		for(int i=0; i<10;i++) {
			array1[i]=r1.nextInt(100);
		}
		System.arraycopy(array1, 0, array2, 0, 10);
        Arrays.sort(array2);
        for(int i=0;i<10;i++) {
            System.out.print(array2[i]+" ");
        }
        System.out.println("");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int index = Arrays.binarySearch(array2, x);
        System.out.println(""+index);
        
	}
}
