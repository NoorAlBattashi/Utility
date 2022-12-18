

/**
 * 
 */

/**
 * @author LAP-9
 *
 */
public class MaxElement {

	/**
	 * @param args
	 */
	private static int maxnum(int[] maxNum) {
		int x = 0;
		for (int a = 1; a < maxNum.length; a++) {

			if (maxNum[a] > x) {
				x = maxNum[a];
			}
		}
		return x;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] maxElementArr = { 4, 5, 7, 99, 3, 45, 56 };

		System.out.println("Largest Number is: " + maxnum(maxElementArr));


	}

}
