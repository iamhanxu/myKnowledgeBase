package sorting;

import java.util.Arrays;
/*
 * 
 * 
 * 
 * 
Steps to implement Quick sort algorithm in place:

1) Choose an element, called pivot, from the list or array. Generally pivot is the middle element of array.

2) Reorder the list so that all elements with values less than the pivot come before the pivot, and all elements with values greater than the pivot come after it (equal values can go either way). This is also known as partitioning. After partitioning the pivot is in its final position.

3) Recursively apply the above steps to the sub-list of elements with smaller values and separately the sub-list of elements with greater values. If the array contains only one element or zero elements then the array is sorted.

Read more: http://javarevisited.blogspot.com/2014/08/quicksort-sorting-algorithm-in-java-in-place-example.html#ixzz44KRcqbzI
 */

public class QuickSort {

	public int[] sort(int[] list) {
		if (list == null || list.length == 0)
			return list;

		int[] input = Arrays.copyOfRange(list, 0, list.length);

		this.quickSort(input, 0, input.length - 1);

		return input;
	}

	private void quickSort(int[] list, int start, int end) {
		if (start >= end)
			return;

		int mid = start + (end - start) / 2;
		int pivot = list[mid];
		int i = start;
		int j = end;

		while (i <= j) {
			while (list[i] < pivot) {
				i++; //move to left, if the value is smaller than pivot
			}
			while (list[j] > pivot) {
				j--; // move to right, if the value is bigger than pivot
			}

			//this time, the i point to the element bigger than pivot, and j point to the element smaller than pivot
			//switch them 
			if (i <= j) {
				this.swap(list, i, j);
				i++;
				j--;
			}
		}
		if (start < j) {
			this.quickSort(list, start, j);
		}

		if (end > i) {
			this.quickSort(list, i, end);
		}

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

		int[] input = {-30,-10,0, 1,7,10,9,16,2,27,12 };

		QuickSort sortAlgo = new QuickSort();
		int[] result = sortAlgo.sort(input);

		System.out.println("Before quick sort: " + Arrays.toString(input));
		System.out.println("After quick sort : " + Arrays.toString(result));
		
	}

}
