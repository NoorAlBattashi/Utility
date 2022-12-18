
/**
 * 
 */

/**
 * @author LAP-9 *
 */
import java.util.Scanner;
import java.util.ArrayList;

public class MagicSquare {

	/**
	 * @param args:create magic square game
	 */
	public static void main(String[] args) {
		// ask the user for input
		System.out.print("Add number: ");
		Scanner addNumSc = new Scanner(System.in);
		int userAddNum = addNumSc.nextInt();

		// declare the needed variables
		int numberOfRows = userAddNum;
		int numberOfCol = numberOfRows;
		int range = numberOfRows * numberOfCol;

		// add the numbers of the magic square inside the value array
		ArrayList<Integer> valuesArr = new ArrayList<Integer>();
		for (int a = 1; a < range + 1; a++) {
			valuesArr.add(a);
		}
		for (int i : valuesArr) {
			System.out.println(i);
		}

		// create the magicSquare
		int[][] magicSquare = new int[numberOfRows][numberOfCol];
        int v = 0;
		for (int row = 0; row < numberOfRows; row++) {

			for (int col = 0; col < numberOfRows; col++) {
				magicSquare [row][col] = valuesArr.get(v);
				v++;		
				System.out.println("-----");
				System.out.println(magicSquare [row][col]);
			}
		}

	}// end of main method

}
