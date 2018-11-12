package lab6;

public class SearhNSort {
	public static void mergeSort(String[] names) {
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

	public static boolean binSearch(String[] words, String x) {
		int left = 0;
		int right = words.length - 1;
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

