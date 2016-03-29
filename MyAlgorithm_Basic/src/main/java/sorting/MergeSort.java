package sorting;

import java.util.Arrays;

public class MergeSort {

	public int[] sort(int[] list) {

		if (list == null || list.length == 0)
			return list;

		int[] input = Arrays.copyOfRange(list, 0, list.length);

		return this.mergeSort(input);

	}

	private int[] mergeSort(int[] list) {
		if (list.length == 1) {
			return list;
		}

		int mid = (int) list.length / 2;

		int[] left = Arrays.copyOfRange(list, 0, mid);
		int[] right = Arrays.copyOfRange(list, mid, list.length);

		left = this.mergeSort(left);
		right = this.mergeSort(right);

		mergeList(left, right, list);

		return list;

	}

	private void mergeList(int[] leftList, int[] rightList, int[] originList) {

		if (leftList == null || leftList.length == 0 || rightList == null
				|| rightList.length == 0)
			return;

		int ll = leftList.length - 1;
		int lr = rightList.length - 1;
		int lo = originList.length - 1;

		while (ll >= 0 && lr >= 0) {
			if (leftList[ll] > rightList[lr]) {
				originList[lo] = leftList[ll];
				ll--;
				lo--;
			} else {
				originList[lo] = rightList[lr];
				lr--;
				lo--;
			}
		}

		while (ll >= 0) {
			originList[lo] = leftList[ll];
			ll--;
			lo--;
		}

		while (lr >= 0) {
			originList[lo] = rightList[lr];
			lr--;
			lo--;
		}

	}

	public static void main(String[] args) {

		int[] input = { 3, 78, 21, 1, 90, 32, 11, 123, 908, 0, -1, -10, -98, 21 };

		MergeSort sortAlgo = new MergeSort();
		int[] result = sortAlgo.sort(input);

		System.out.println("Before merge sort: " + Arrays.toString(input));
		System.out.println("After merge sort : " + Arrays.toString(result));
	}

}
