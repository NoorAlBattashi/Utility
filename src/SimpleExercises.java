import java.util.ArrayList;
import java.util.HashMap;

/**
 * 
 */

/**
 * @author LAP-9
 *
 */
public class SimpleExercises {

	/**
	 * @param args
	 */
	private static void evenOdd(int[] numbers) {
		ArrayList<Integer> evenNumbers = new ArrayList<Integer>();
		ArrayList<Integer> oddNumbers = new ArrayList<Integer>();
		HashMap<String, ArrayList<Integer>> numbersSeprated = new HashMap<String, ArrayList<Integer>>();
		for (int index = 0; index < numbers.length; index++) {

			if (numbers[index] % 2 == 0) {
				// System.out.println(numbers[index]);
				evenNumbers.add(numbers[index]);
			} else {
				oddNumbers.add(numbers[index]);
				// System.out.println(numbers[index]);
			}
		}
		numbersSeprated.put("'even': ", evenNumbers);
		numbersSeprated.put("'odd': ", oddNumbers);

		System.out.println(numbersSeprated);

	}

	private static void power(int base, int exponent) {
		HashMap<String, Integer> power = new HashMap<String, Integer>();
		int result = base;
		for (int repetetion = 1; repetetion < exponent; repetetion++) {
			result = base * result;
		}

		power.put("'base'", base);
		power.put("'exponent'", exponent);
		power.put("'result'", result);

		for (String key : power.keySet()) {
			System.out.println(key + ": " + power.get(key));
		}

	}
	private static void reverse(String sentence) {
		
	}

	public static void main(String[] args) {
		// exercise1
		System.out.println("exercise1");
		int[] numbers = { 2, 3, 7, 6, 9, 4, 5, 7 };
		evenOdd(numbers);

		System.out.println();
		
		// exercise2
		System.out.println("exercise2");
		int base = 2;
		int exponent = 3;
		power(base, exponent);
		
		System.out.println();
		
		// exercise3
				System.out.println("exercise3");
				String sentenceString = "this is a sentence";
				
				System.out.println();
		

	}

}
