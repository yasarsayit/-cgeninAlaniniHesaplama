package java101;

import java.util.Scanner;

public class Exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, b;
		double c;
		
		Scanner girdi = new Scanner(System.in);
	    System.out.print("1.kenarı giriniz:");
		a= girdi.nextInt();
	    System.out.print("2. kenarı giriniz:");
	    b= girdi.nextInt();
		
		c =(a*b/2);
		System.out.println("alan : "+ c );

	}
	

}
