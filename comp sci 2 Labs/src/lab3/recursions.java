package lab3;

import java.util.Scanner;

public class recursions {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int input1, input2;
		boolean runtime = true;
		
		System.out.println("Recursive methods calc");
		System.out.println("1. Factorial\n2. Power\n3. Summation\n4. Euclid GCD\n5. Exit");
		
		while(runtime) {
			System.out.print("\nEnter the number of the calculater you'd like to use: ");
			int choice = keyboard.nextInt();
			if(choice < 1 || choice > 5){
				System.out.println(choice + " was not an option");
			}else if(choice == 5) {
				runtime = false;
			}else if(choice == 1) {
				System.out.print("Enter the integer you would like to find the factorial of: ");
				input1 = keyboard.nextInt();
				System.out.println("The factorial of " + input1 + " is " + recursiveFuncs.factorial(input1));
			}else if(choice == 2) {
				System.out.print("Enter the integer base: ");
				input1 = keyboard.nextInt();
				System.out.print("Enter the integer power: ");
				input2 = keyboard.nextInt();
				System.out.println(input1 + " to the power of " + input2 + " is " + recursiveFuncs.pow2(input1, input2));
			}else if(choice == 3) {
				System.out.print("Enter the integer you would like to find the summation of: ");
				input1 = keyboard.nextInt();
				System.out.println("The summation of " + input1 + " is " + recursiveFuncs.summation(input1));
			}
			else if(choice == 4) {
				System.out.print("Enter the first integer you want to find the gcd of: ");
				input1 = keyboard.nextInt();
				System.out.print("Enter the second integer you want to find the gcd of: ");
				input2 = keyboard.nextInt();
				System.out.println("The GCD of " + input1 + " and " + input2 + " is " + recursiveFuncs.euclidGCD(input1, input2));
			}
		}
		keyboard.close();
	}

}
