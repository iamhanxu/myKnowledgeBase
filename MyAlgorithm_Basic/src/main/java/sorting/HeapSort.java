package sorting;

import java.util.Arrays;

/*
 * heap is a binary tree
 * 
 * 
 * binary tree property:
 * 
 * 1) for a complete binary tree, the height of the tree is log(n), 
 * n is the number of nodes
 * 
 * 2) for a complete binary tree, the number of internal nodes(node has children) is
 * Math.floor(N/2)
 * 
 * 
 * For heap sort, the number of nodes have children are Math.floor(N/2)
 * 
 * 
 * 
 */

public class HeapSort {

	public int[] sort(int[] list) {
		if (list == null || list.length == 0)
			return list;
		int[] input = Arrays.copyOfRange(list, 0, list.length);


		// step1: build the max heap first, that the root is the max element
		this.heapify(input, input.length - 1);


		// step2: swap the root element(max element) with the very last element
		// and adjust the heap

		for (int last_index = input.length - 1; last_index > 0; last_index--) {
			this.swap(input, 0, last_index);
			this.maxheap(input, 0, last_index - 1);
		}

		return input;

	}

	// %%%method to build a heap
	// it start from the bottom of the heap
	// the index should be start from Math.floor(n/2),
	// which could be the last nodes has children
	private void heapify(int[] list, int last_index) {
		int N = list.length / 2;
		for (int i = N; i >= 0; i--) {
			this.maxheap(list, i, last_index);
		}
	}

	// %%%This method is to make sure the root is the max value, and
	// all its subtree followed the same rule
	private void maxheap(int[] list, int i, int last_index) {
		// last_index, is the index of the last node
		// i is the given index and
		// it is the root that you want to max heap
		// assume list[i] is the max in the beginning
		// when i=0 , left =1, right =2
		// for max heap root should be bigger than its children
		// list[i] > list[left] && list[i]>list[right]
		int left = i * 2 + 1;
		int right = i * 2 + 2;
		int max = i;

		// find the biggest index
		if (left <= last_index && list[left] > list[i]) {
			max = left;
		}
		//this part need to pay attention
		if (right <= last_index && list[right] > list[max]) {
			max = right;
		}

		// swap i with the biggest index, max
		// since the i is swap with the max, then subtree whose root is the
		// index max is unstable,
		// it need to be maxheap as well
		if (max != i) {
			this.swap(list, max, i);
			this.maxheap(list, max, last_index);
		}

	}

	private void swap(int[] list, int a, int b) {
		if (list == null || list.length - 1 < a || list.length - 1 < b || a == b)
			return;

		int tmp = list[a];
		list[a] = list[b];
		list[b] = tmp;
	}

	public static void main(String[] args) {

		int[] input = { 3, 78, 21, 1, 90, 32, 11, 123, 908, 0, -1, -10, -98, 21 };

		HeapSort sortAlgo = new HeapSort();
		int[] result = sortAlgo.sort(input);

		System.out.println("Before heap sort: " + Arrays.toString(input));
		System.out.println("After heap sort : " + Arrays.toString(result));
	}

}
