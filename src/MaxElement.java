
/**
 * 
 */

/**
 * @author LAP-9
 *
 */
public class MaxElement {

	/**
	 * @param args: display the largest element in the array
	 */
	private static int maxnum(int[] maxNum) {
		int x = 0;
		for (int a = 0; a < maxNum.length; a++) {

			if (maxNum[a] > x) {
				x = maxNum[a];
			}
		}
		return x;
	}

	private static int[] secondMaxnum(int[] secMaxNum) {
		int[] maxN = new int[2];
		int x = 0;
		int b = 0;// index of the largest number
		int s = 0; // right element
		int l = 0;// left element
		int secondLargest = 0;
		for (int a = 0; a < secMaxNum.length; a++) {

			if (secMaxNum[a] > x) {
				b = a;
				x = secMaxNum[a];
			}
		}
		for (int i = b + 1; i < secMaxNum.length; i++) {
			if (secMaxNum[i] > s) {

				s = secMaxNum[i];
			}
		}
		for (int c = b - 1; c >= 0; c--) {
			if (secMaxNum[c] > l) {

				l = secMaxNum[c];
			}
		}

		if (l > s) {
			secondLargest = l;
		} else {
			secondLargest = s;
		}
		maxN[0] = x;
		maxN[1] = secondLargest;

		return maxN;
	}

//	private static int thirdMaxNum(int[] thirdMaxNum) {
//		int x = 0;
//		int b = 0;// index of the largest number
//		int s = 0; // right element
//		int l = 0;// left element
//		int secondLargest = 0;
//		int thirdLargest = 0;
//		int rightlargest=0;//index of the second largest right side
//		int leftlargest=0;//index of the second largest left side
//		int secondLargestIndex=0;//index of the second largest number
//		// largest Number
//		for (int a = 0; a < thirdMaxNum.length; a++) {
//
//			if (thirdMaxNum[a] > x) {
//				b = a;// index of the largest number
//				x = thirdMaxNum[a];
//			}
//		}
//		// second largest Number
//		for (int i = b + 1; i < thirdMaxNum.length; i++) {
//			if (thirdMaxNum[i] > s) {
//				rightlargest=i;
//				s = thirdMaxNum[i];
//			}
//		}
//		for (int c = b - 1; c >= 0; c--) {
//			if (thirdMaxNum[c] > l) {
//				leftlargest = c;
//				l = thirdMaxNum[c];
//			}
//		}
//
//		if (l > s) {
//			secondLargest = l;
//			secondLargestIndex=leftlargest;
//			
//		} else {
//			secondLargest = s;
//			secondLargestIndex=rightlargest;
//		}
//		// third largest
//		for(int q =secondLargestIndex;) {
//			
//		}
//		return thirdLargest;
//	}

	public static void main(String[] args) {
		int[] maxElementArr = { 4, 57, 7, 99, 3, 45, 56 };

		// Display the largest value
		System.out.println("Largest Number is: " + maxnum(maxElementArr));

		// Display the second largest value
		//System.out.println("Second Largest Number is: " + secondMaxnum(maxElementArr));
		System.out.println("Largest and Second Largest Number are: ");
		for (int i : secondMaxnum(maxElementArr)) {
			System.out.println(i);
		}

		// Display the third largest value
		// System.out.println("Second Largest Number is: " +
		// thirdMaxNum(maxElementArr));
	}

}
