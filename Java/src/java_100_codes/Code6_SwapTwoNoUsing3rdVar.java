package java_100_codes;

import java.util.Scanner;

public class Code6_SwapTwoNoUsing3rdVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x,y,z;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Take a first number");
		x=sc.nextInt();
		System.out.println("The first Number is" +x);
		
		System.out.println("Take a second number");
		y=sc.nextInt();
		System.out.println("The second Number is" +y);
		
		System.out.println("First number before swapping "+x);
		System.out.println("Second number before swapping "+y);
		
		z=x;
		x=y;
		y=z;
		
		System.out.println("First number after swapping "+x);
		System.out.println("Second number after swapping "+y);
				
	
	}

}
