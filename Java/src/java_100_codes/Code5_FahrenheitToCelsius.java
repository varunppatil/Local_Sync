package java_100_codes;

import java.util.Scanner;

public class Code5_FahrenheitToCelsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float tempFehr;
		float degreeCel;

		Scanner sc = new Scanner(System.in);

		System.out.println("Taking input temperature in Fehreinheit");
		tempFehr = sc.nextFloat();
		System.out.println("Temperature in Fehreinheit is "+ tempFehr);
		degreeCel = fehreinheitToCelsious(tempFehr);
		System.out.println("Temperature in degres is " +degreeCel);
		
	System.out.println("Checking my feh temp is same or different after converting from cel to feh" +celsiusToFeh(degreeCel));

	}

	
	
	public static float fehreinheitToCelsious(float ftemp) {
		float cel;
		return cel = ((ftemp - 32) * 5) / 9;
	}
	
	public static float celsiusToFeh(float tempCel ){
		float fehTemp;
		fehTemp =((tempCel*9)/5) + 32 ;
		
		return fehTemp;
		
		
	}
}
