package lab2;

/**
 @author Austin Pavia
 9/20/18
 csc 102 lab 2
 */

import java.util.ArrayList;
import java.util.Scanner;

public class listyThingy {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		boolean runtime = true;
		while(true) {
			System.out.print("Enter a positive Integer to add to the list: ");
			int temp = keyboard.nextInt();
		
			if(temp <= 0) {
				System.out.println("That was not a positive integer");
			}else {
				nums.add(temp);                //add first number to list
				break;
			}
		}
		
		while(runtime) {
			System.out.print("Enter another positive Integer to add to the list or '0' to finish: ");
			int temp = keyboard.nextInt();
			if(temp == 0) {
				runtime = false;               //If enter 0 kill main loop
			}else if(temp < 0) {
				System.out.println("That was not a positive integer");  //If enter negative integer tell them try again
			}else {
				for(int i = 0; i < nums.size(); i++) {    //iterate through each member of list
					if(temp <= nums.get(i)) {
						nums.add(i, temp);                //if input less than value at current index : insert input to that index
						break;
					}
				}
			}
			if(temp > nums.get(nums.size() - 1)) {    //This feels like a poor way to handle this... but it was easy and works so here it is
				nums.add(temp);                       // If the input was larger than the current largest : slap that baby on the end
			}
		}
		System.out.println(nums);
		keyboard.close();
	}

}