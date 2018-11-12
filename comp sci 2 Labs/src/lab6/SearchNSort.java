package lab6;

public class SearchNSort {
	public static void mergeSort(String[] names) {    //MAKE THIS NOT TAKE NULL... take begin and end index as parameters
		if (names.length >= 2) {
			String[] left = new String[names.length / 2];
			String[] right = new String[names.length - names.length / 2];
			for (int i = 0; i < left.length; i++) {
				left[i] = names[i];
			}

			for (int i = 0; i < right.length; i++) {
				right[i] = names[i + names.length / 2];
				}

			mergeSort(left);
			mergeSort(right);
			merge(names, left, right);
		}
	}

	public static void merge(String[] names, String[] left, String[] right) {
		int a = 0;
		int b = 0;
		for (int i = 0; i < names.length; i++) {
			if (b >= right.length || (a < left.length && left[a].compareToIgnoreCase(right[b]) < 0)) {
				names[i] = left[a];
				a++;
			} else {
				names[i] = right[b];
				b++;
			}
		}
	}
	
	static void bubbleSort(String arr[], int lastIndex) {
		int i, j;
		String temp;
		boolean swapped;
		for(i = 0; i < lastIndex - 1; i++) {
			swapped = false;
			for(j = 0; j < lastIndex - i - 1; j++) {
				if(arr[j].compareToIgnoreCase(arr[j + 1]) > 0){
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}
			}

			// IF no two elements were
			// swapped by inner loop, then break
			if (swapped == false) {
				break;
			}
		}
	}

	public static boolean binSearch(String[] words, String x, int lastIndex) {
		int left = 0;
		int right = lastIndex - 1;
		int mid;

		while(left <= right) {
			mid = (left+right) / 2;
			if(words[mid].compareToIgnoreCase(x) < 0) {
				left = mid + 1;
			}else if(words[mid].compareToIgnoreCase(x) > 0) {
				right = mid - 1;
			} else if(words[mid].compareToIgnoreCase(x) == 0){
				return true;
			}
		}
		return false;
	}
}

