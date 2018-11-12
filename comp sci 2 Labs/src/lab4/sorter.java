package lab4;

import java.util.Scanner;

public class sorter {
	
	static int bsComparisons = 0;
	static void bubbleSort(int arr[], int n)
    {
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < n - 1; i++)
        {
            swapped = false;
            for (j = 0; j < n - i - 1; j++)
            {
            	bsComparisons++;
                if (arr[j] > arr[j + 1])
                { 
                    // swap arr[j] and arr[j+1]
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
  
            // IF no two elements were
            // swapped by inner loop, then break
            if (swapped == false)
                break; 
        } 
    }
	
	static int msComparisons = 0;
	static void merge(int arr[], int l, int m, int r){
		// Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;
  
        /* Create temp arrays */
        int L[] = new int [n1];
        int R[] = new int [n2];
  
        /*Copy data to temp arrays*/
        for (int i=0; i<n1; ++i)
            L[i] = arr[l + i];
        for (int j=0; j<n2; ++j)
            R[j] = arr[m + 1+ j];
        
        /* Merge the temp arrays */
        // Initial indexes of first and second subarrays
        int i = 0, j = 0;
  
        // Initial index of merged subarry array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
            	msComparisons++;
                arr[k] = L[i];
                i++;
            } else {
            	msComparisons++;
                arr[k] = R[j];
                j++;}
            k++;
        }
  
        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
  
        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
  
    // Main function that sorts arr[l..r]
    static void mergeSort(int arr[], int l, int r) {
    	if (l < r)  {
    		msComparisons++;
            // Find the middle point
            int m = (l+r)/2;
  
            // Sort first and second halves
            mergeSort(arr, l, m);
            mergeSort(arr , m+1, r);
  
            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }
    
    static void printArray(int arr[]){
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("How large of an array would you like to sort: ");
		int len = keyboard.nextInt();
		int[] sorted = new int[len];
		int[] backwards = new int[len];
		int[] rando = new int[len];
		
		for(int i = 0; i < len; i++)
			sorted[i] = i;
		for(int i = len - 1; i > -1; i--)
			backwards[i] = len - 1 - i;
		for(int i = 0; i < len; i++)
			rando[i] = (int) (Math.random() * 100);
		
		int[] sorted2 = sorted;
		int[] backwards2 = backwards;
		int[] rando2 = rando;
		
		//printArray(sorted);
		//printArray(backwards);
		//printArray(rando);
		//printArray(sorted2);
		//printArray(backwards2);
		//printArray(rando2);
		System.out.println("merge sort comparisons: " + msComparisons);
		System.out.println("bubble sort comparisons: " + bsComparisons);
		
		System.out.println("-------Now sorting arrays-------");
				
		bubbleSort(sorted, len);
		mergeSort(sorted2, 0, len - 1);
		//printArray(sorted);
		//printArray(sorted2);
		System.out.println("merge sort comparisons on sorted list: " + msComparisons);
		System.out.println("bubble sort comparisons on sorted list: " + bsComparisons);
		msComparisons = 0;
		bsComparisons = 0;
		bubbleSort(backwards, len);
		mergeSort(backwards2, 0, len - 1);
		//printArray(backwards);
		//printArray(backwards2);
		System.out.println("merge sort comparisons on backwards list: " + msComparisons);
		System.out.println("bubble sort comparisons on backwards list: " + bsComparisons);
		msComparisons = 0;
		bsComparisons = 0;
		bubbleSort(rando, len);
		mergeSort(rando2, 0, len - 1);
		//printArray(rando);
		//printArray(rando2);
		System.out.println("merge sort comparisons on random list: " + msComparisons);
		System.out.println("bubble sort comparisons on random list: " + bsComparisons);
		
		keyboard.close();

	}

}
