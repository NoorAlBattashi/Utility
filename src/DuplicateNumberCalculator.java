/**
 * 
 */

/**
 * @author LAP-9
 *
 */
public class DuplicateNumberCalculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] dublicateNumber = { 1, 2, 3, 1, 2, 1 };
		for (int number : dublicateNumber) {
			int x = number;
			int sum = 0;
			
			for (int dublicate : dublicateNumber) {
				if (number == dublicate) {
					sum++;
				}
				System.out.println(x + "repeated=" + sum + " Times");
			}

		}

	}

}
