package lab5;

import java.util.Scanner;

public class Sorter {
	static int comparisons = 0;
	static int partition(int arr[], int low, int high){
		int pivot = arr[high];
		int i = (low-1);
		for (int j=low; j<high; j++){
			if (arr[j] <= pivot){
				i++;
				comparisons++;

				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		int temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;

		return i+1;
	}

	static void qSort(int arr[], int low, int high) { 
		if (low < high){
			int pi = partition(arr, low, high);
			
			qSort(arr, low, pi-1);
			qSort(arr, pi+1, high);
		}
	}
	
	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("How large of an array would you like to sort: ");
		int len = keyboard.nextInt();
		keyboard.close();
		int[] sorted = new int[len];
		int[] backwards = new int[len];
		int[] rando = new int[len];
		
		for(int i = 0; i < len; i++) {
			sorted[i] = i;
		}
		for(int i = len - 1; i > -1; i--) {
			backwards[i] = len - 1 - i;
		}
		for(int i = 0; i < len; i++) {
			rando[i] = (int) (Math.random() * 100);
		}
		
		qSort(sorted, 0, len - 1);
		System.out.println("sorted list had " + comparisons + " comparisons");
		comparisons = 0;
		qSort(backwards, 0, len - 1);
		System.out.println("backwards list had " + comparisons + " comparisons");
		comparisons = 0;
		qSort(rando, 0, len - 1);
		System.out.println("random list had " + comparisons + " comparisons");
		
	}
}
