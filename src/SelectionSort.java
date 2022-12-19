/**
 * 
 */

/**
 * @author LAP-9
 *
 */
public class SelectionSort {

	/**
	 * @param args
	 */

	private static int getIndex(int[] arr, int x) {
		// get the index of the elements
		int col = 0;

		for (int a = 0; a < arr.length; a++) {

			if (arr[a] == x) {
				col = a;
			}
		}

		return col;
	}

	private static int[] sort(int[] sortArr, int length) {

		for (int a = 0; a < length; a++) {
			int max = 0;
			int index = 0;
			// calculate the largest number
			for (int b = a; b < length; b++) {

				if (sortArr[b] > max) {
					max = sortArr[b];
					index = b;

				}

			}
			// swap
			int firstValue = sortArr[a];
			sortArr[a] = max;
			sortArr[index] = firstValue;

		}

		return sortArr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println("Excersice one");
		// int[] arr1 = { 4, 3, 2, 1 };
		//
		// System.out.println("Original Array: ");
		// for (int i : arr1) {
		// System.out.println(i);
		// }
		//
		// //swap
		// int d = arr1[0];
		// //int y = arr1[1];
		//
		// arr1[0] = arr1[1];
		// arr1[1] = d;
		//
		// System.out.println("Swap: ");
		// for (int i : arr1) {
		// System.out.println(i);
		// }
		//

		// selection sort
		System.out.println();
		System.out.println("--------------------------------");
		System.out.println("Excersice two");

		int[] sortArr = { 50, 12, 8, 10, 1001, 6, 87, 24 };
		int x = sortArr.length;
		int[] sorted = sort(sortArr, x);
		// display the numbers
		System.out.println("Sorted: ");
		for (int i : sorted) {
			System.out.print(i + " ");
		}

	}

}
