package sorting;

import java.util.Arrays;
/*
 * 
 * 
 * use recursion to implement the bubble sort
 * 
 * 
 * compare the adjacent two elements and move from start to end, 
 * 
 * the min/max always pop to the end
 * 
 * 
 */
public class BubbleSort {

	public int[] sort(int[] list) {
		if (list == null || list.length == 0)
			return list;

		int[] input = Arrays.copyOfRange(list, 0, list.length);

		this.sort(input, input.length - 1);

		return input;

	}

	private void sort(int[] list, int end) {

		if (end <= 0)
			return;

		for (int i = 0; i <= end - 1; i++) {
			if (list[i] > list[i + 1]) {
				this.swap(list, i + 1, i);
			}
		}
		sort(list, end - 1);
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

		BubbleSort sortAlgo = new BubbleSort();
		int[] result = sortAlgo.sort(input);

		System.out.println("Before bubble sort: " + Arrays.toString(input));
		System.out.println("After bubble sort : " + Arrays.toString(result));
	}

}
