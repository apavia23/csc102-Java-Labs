package lab0_4;

import java.util.Scanner;

public class sums {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		while(true) {
			System.out.print("Enter an integer value to calculate it's summation or '0' to exit: ");
			int num = keyboard.nextInt();
			if(num == 0) {
				break;
			}else {
				System.out.println("The summation of " + num + " is " + summation(num));
			}
		}
		keyboard.close();
	}

	public static int summation(int num) {
		int answer = 0;
		while(num > 0) {
			answer = answer + num;
			num--;
		}
		return answer;
	}

}