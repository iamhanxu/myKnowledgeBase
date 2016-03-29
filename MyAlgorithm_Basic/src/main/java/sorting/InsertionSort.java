package sorting;

import java.util.Arrays;


/*
 * use recursion to solve the insertion sort
 * 
 * 
 * start from the index 0 , insert the element into previous position so the whole array is sorted
 * 
 *  
 * 
 * 
 * 
 */

public class InsertionSort {

	public int[] sort(int[] list) {
		if (list == null || list.length == 0)
			return list;

		int[] input = Arrays.copyOfRange(list, 0, list.length);
		this.sort(input, 1);
		return input;
	}

	private void sort(int[] list, int end) {
		if (end >= list.length )
			return;

		for (int i = end; i >= 1; i--) {

			if (list[i] < list[i - 1]) {
				this.swap(list, i, i - 1);
			} else {
				break;
			}
		}

		sort(list, end + 1);
	}

	private void swap(int[] list, int a, int b) {
		if (list == null || list.length - 1 < a || list.length - 1 < b
				|| a == b)
			return;

		int tmp = list[a];
		list[a] = list[b];
		list[b] = tmp;
	}

	public static void main(String[] args) {
		int[] input = { 3, 78, 21, 1, 90, 32, 11, 123, 908, 0, -1, -10, -98, 21 };

		InsertionSort sortAlgo = new InsertionSort();
		int[] result = sortAlgo.sort(input);

		System.out.println("Before insertion sort: " + Arrays.toString(input));
		System.out.println("After insertion sort : " + Arrays.toString(result));

	}

}
