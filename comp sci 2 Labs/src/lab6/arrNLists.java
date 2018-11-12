package lab6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
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

	public static void main(String[] args) throws IOException {
		boolean running = true;
		File file = new File("C:\\Users\\austi\\git\\csc102-Java-Labs\\comp sci 2 Labs\\src\\lab6\\lab6words.txt");
		String[] words = new String[30];
		Scanner keyboard = new Scanner(System.in);

		BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
		int initRead = 0;
		while(reader.ready() == true) {
			words[initRead] = reader.readLine();
			initRead++;
		}
		printArray(words);
		SearchNSort.mergeSort(words);
		printArray(words);
	}
}