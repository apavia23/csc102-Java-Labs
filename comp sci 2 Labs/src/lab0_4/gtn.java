package lab0_4;

import java.util.Scanner;
import java.util.Random;

public class gtn {

	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();
		
		while(true){
			int answer = rand.nextInt(101);
			int tries = 1;
			boolean gameTime = true;
			
			System.out.println("Try to guess the random number from 1-100 in as few guesses as possible");
			while(gameTime == true) {
				System.out.print("Enter a number from 1 - 100: ");
				int guess = keyboard.nextInt();
			
				if(guess == answer) {
					System.out.println("you guessed correct the answer was " + answer + ". It took you " + tries + " tries");
					gameTime = false;
				}else if(guess > answer && guess <= 100) {
					System.out.println("your guess was too high");
					tries ++;
				}else if(guess < answer && guess >= 0) {
					System.out.println("your guess was too low");
					tries ++;
				}else {
					System.out.println("Invalid input try again");
				}
			}
			
			System.out.print("Would you like to play again? Enter 1 for yes, or 0 for no: ");
			int playAgain = keyboard.nextInt();
			
			if(playAgain == 0) {
				break;
			}else if(playAgain == 1) {
				System.out.println("");
			}
			
		}
		
		keyboard.close();
	}
}