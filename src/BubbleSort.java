/**
 * 
 */

/**
 * @author LAP-9
 *
 */
public class BubbleSort {

	/**
	 * @param args
	 */
	private static int[] bubbleSort(int[] bubbleArr) {
		int greater = 0;

		for (int a = 0; a < bubbleArr.length; a++) {

			for (int b = 0; b < bubbleArr.length - 1; b++) {
				if (bubbleArr[b] < bubbleArr[b + 1]) {
					greater = bubbleArr[b + 1];
					bubbleArr[b + 1] = bubbleArr[b];
					bubbleArr[b] = greater;
				}
			}
		}
		return bubbleArr;
	}

	public static void main(String[] args) {
		int[] bubbleArr = { 4, 1, 5, 7, 2 };
		int[] bubble2Arr = { 1, 2, 3, 4, 5 };
		for (int element : bubbleSort(bubble2Arr)) {
			System.out.print(element + " ");
		}

	}

}
