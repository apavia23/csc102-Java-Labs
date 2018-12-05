package lab6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class arrNLists {
	static void printArray(String[] arr) {
		for(String i : arr) {
			if(i != null) {
				System.out.println(i);
			}else {
				break;
			}
		}
	}

	public static void main(String[] args) {
		boolean running = true;
		File file = new File("src\\lab6\\lab6words.txt");
		String[] words = new String[30];
		Scanner keyboard = new Scanner(System.in);

		int currentIndex = 0;
		try(BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));) {
			if(!file.exists()) {
				file.createNewFile();
			}
			while(reader.ready() == true) {
				words[currentIndex] = reader.readLine();
				currentIndex++;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Word Sort Program\n1.Print word list\n2.Add word to list\n3.Search for a word in the list\n4.Exit");
		while(running == true) {
			System.out.print("Enter the number of the action you would like to preform: ");
			int choice = keyboard.nextInt();
			keyboard.nextLine();
			if(choice == 4) {
				try(BufferedWriter writer = new BufferedWriter(new FileWriter(file.getAbsoluteFile(), false));) {
					for(String i : words) {
						if(i != null) {
							writer.write(i + "\n");
						}else {
							break;
						}
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
				keyboard.close();
				running = false;
			}else if(choice == 1) {
				SearchNSort.bubbleSort(words, currentIndex);
				printArray(words);
			}else if(choice == 2) {
				System.out.print("Enter something to add to the list: ");
				String input = keyboard.nextLine();
				words[currentIndex] = input;
				currentIndex++;
				System.out.println(input + " was added to the list");
			}else if(choice == 3) {
				System.out.print("Enter a word to search for in the list: ");
				String input = keyboard.nextLine();
				SearchNSort.bubbleSort(words, currentIndex);
				if(SearchNSort.binSearch(words, input, currentIndex) == true) {
					System.out.println('"' + input + '"' + " is already in the list");
				}else {
					System.out.println('"' + input + '"' + " is not in the list");
				}
			}else {
				System.out.println('"' + choice + '"' + " was not an option");
			}
		}
	}
}