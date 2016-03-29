package sorting;

import java.util.Arrays;
/*
 * 
 * use recursion to solve the selection sort
 * 
 * 
 * divide into small problem domain
 * 
 * start with the whole list, pick index 0 as start point, and find the min/max of the list, and swap it with the index 0, so the index 0 will be max/min
 * 
 * then move to index 1, until index = list.length-1;
 * 
 * 
 */
public class SelectionSort {

	public int[] sort(int[] list) {

		if (list == null || list.length == 0)
			return list;

		int[] input = Arrays.copyOfRange(list, 0, list.length);

		this.sort(input, 0);

		return input;

	}

	private void sort(int[] list, int start) {

		if (start == list.length - 1) {
			return;
		}

		int min_index = start;
		int min = list[start];

		for (int i = start; i < list.length; i++) {

			if (min > list[i]) {
				min = list[i];
				min_index = i;
			}
		}

		this.swap(list, min_index, start);

		sort(list, start + 1);

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

		SelectionSort sortAlgo = new SelectionSort();
		int[] result = sortAlgo.sort(input);

		System.out.println("Before selection sort: " + Arrays.toString(input));
		System.out.println("After selection sort : " + Arrays.toString(result));
	}

}
