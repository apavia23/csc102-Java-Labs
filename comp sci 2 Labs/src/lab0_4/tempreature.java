package lab0_4;

import java.util.Scanner;

public class tempreature {
	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the farenheit degree you would like to convert to celcius: ");
		double input = keyboard.nextDouble();
		
		System.out.println((input - 32.0) * (5.0/9.0));
		keyboard.close();
	}
}