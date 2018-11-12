package lab2;

import java.util.ArrayList;
import java.util.Scanner;

public class listThing {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		ArrayList<Integer> nums = new ArrayList<Integer>();
		while(true) {
			System.out.print("Enter a positive Integer to add to the list: ");
			int temp = keyboard.nextInt();
		
			if(temp <= 0) {
				System.out.println("That was not a positive integer");
			}else {
				nums.add(temp);
				break;
			}
		}
		
		while(true) {
			System.out.print("Enter a positive Integer to add to the list or '0' to exit: ");
			int temp = keyboard.nextInt();
			int midIndex = nums.size() / 2;
			if(temp == 0) {
				break;
			}else if(temp  < 0) {
				System.out.println("That was not a positive integer");
			}else {
				if(temp == nums.get(midIndex)) {		                                 // 1 3 6 7 8 9
					nums.add(midIndex, temp);                                            // 0 1 2 3 4 5
				}else if(temp > nums.get(midIndex)) {                                    // 1 2 3 4 5 6
					for(int i = midIndex; i < nums.size(); i++) {
						if(temp <= nums.get(i + 1) && i < nums.size() - 2) {
							nums.add(i + 1, temp);
						}
					}
				}
			}
		}
		keyboard.close();
	}

}
