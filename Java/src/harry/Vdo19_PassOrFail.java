package harry;
import java.util.Scanner;

public class Vdo19_PassOrFail {
	public static void main(String[] args) {

		System.out.println("Taking input of Threee Subjects : ");	
		Scanner sc = new Scanner(System.in);
		System.out.println("Taking First Subject Marks : ");
		int a = sc.nextInt();
		System.out.println("Taking Second Subject Marks : ");
		int b = sc.nextInt();
		System.out.println("Taking Third Subject Marks : ");
		int c = sc.nextInt();
	
		//Assuming marks 
		if (a >= 33 && b >= 33 && c >= 33) {
			int percentage = (a+b+c)/3;
			System.out.println(percentage);
			if (percentage >= 40) {
				System.out.println("The Student is PASS");
			}
			else System.out.println("The Student is FAIL");
		}
		else
			System.out.println("The Student is FAIL");
	}

}
