package java_100_codes;

import java.util.Scanner;

public class Code4_ScannerForInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a;
		float b;
		String str;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entering a String");
		str = sc.nextLine();
		System.out.println("The input String is "+str);
		
		System.out.println("Entering a integer");
		a = sc.nextInt();
		System.out.println("The input integer is "+a);
		
		System.out.println("Entering a float");
		b = sc.nextFloat();
		System.out.println("The input float is "+b);
		
		
		
		
		
	}

}
