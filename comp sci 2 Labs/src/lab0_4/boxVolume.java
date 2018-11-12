package lab0_4;

import java.util.Objects;
import java.util.Scanner;

public class boxVolume {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double length, width, height;
		boolean running = true;
		while(running) {
			System.out.print("Enter the length of the box: ");
			length = keyboard.nextDouble();
			System.out.print("Enter the width of the box: ");
			width = keyboard.nextDouble();
			System.out.print("Enter the height of the box: ");
			height = keyboard.nextDouble();
			System.out.println("Volume = " + calculate(length, width, height));
			System.out.print("Would you like to find the volume of another box? (y/n):");
			String term = keyboard.next();
			if(Objects.equals(term, "y")) {
				System.out.println("");
			}else if(Objects.equals(term, "n")) {
				running = false;
			}
		}
		keyboard.close();
	}
	
	public static double calculate(double length, double width, double height) {
		return length * width * height;
		
	}
	
}