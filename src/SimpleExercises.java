import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import javax.xml.crypto.dsig.dom.DOMValidateContext;

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
	// method to separate the even numbers from the odd numbers
	private static void evenOdd(int[] numbers) {
		ArrayList<Integer> evenNumbers = new ArrayList<Integer>();
		ArrayList<Integer> oddNumbers = new ArrayList<Integer>();
		HashMap<String, ArrayList<Integer>> numbersSeprated = new HashMap<String, ArrayList<Integer>>();
		for (int index = 0; index < numbers.length; index++) {

			if (numbers[index] % 2 == 0) {
				evenNumbers.add(numbers[index]);
			} else {
				oddNumbers.add(numbers[index]);
			}
		}
		numbersSeprated.put("'even': ", evenNumbers);
		numbersSeprated.put("'odd': ", oddNumbers);

		System.out.println(numbersSeprated);

	}

	// method to calculate the power of the numbers
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

	// reverse the sentence given by the user
	private static void reverse(String sentence) {
		ArrayList<Character> groupStringArrayList = new ArrayList<Character>();
		for (int lastIndex = sentence.length() - 1; lastIndex >= 0; lastIndex--) {

			char lastElement = sentence.charAt(lastIndex);

			groupStringArrayList.add(lastElement);
		}
		for (Character i : groupStringArrayList) {
			System.out.print(i);
		}

	}

	// calculate the factorial of the number given
	private static void factorial(int factorial) {
		ArrayList<Integer> factorialaArrayList = new ArrayList<Integer>();

		for (Integer numberGenerator = factorial; numberGenerator > 1; numberGenerator--) {
			factorialaArrayList.add(numberGenerator);
		}

		Integer totalInteger = 1;
		for (Integer multiply : factorialaArrayList) {
			totalInteger = totalInteger * multiply;
		}

		System.out.println("INPUT: " + factorial);
		System.out.println("OUTPUT: " + totalInteger);
	}

	// check if the string given is palindrome
	private static void palindrome(String palindrome) {
		ArrayList<Character> palindromeaArrayList = new ArrayList<Character>();

		for (int addCharacter = 0; addCharacter < palindrome.length(); addCharacter++) {
			palindromeaArrayList.add(palindrome.charAt(addCharacter));
		}
		int check = palindromeaArrayList.size() - 1;
		boolean match = true;
		for (Character show : palindromeaArrayList) {
			if (show.equals(palindromeaArrayList.get(check)) && check >= 0 && match == true) {
				check--;
				match = true;
			} else {
				match = false;
			}
		}
		if (match == true) {
			System.out.println("INPUT: " + palindrome);
			System.out.println("OUTPUT: " + match);
		} else if (match == false) {
			System.out.println("INPUT: " + palindrome);
			System.out.println("OUTPUT: " + match);
		}
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
		String sentence = "this is a sentence";
		reverse(sentence);
		System.out.println();

		// exercise4
		System.out.println();
		System.out.println("exercise4");
		int factorial = 5;
		factorial(factorial);
		System.out.println();

		// exercise5
		System.out.println();
		System.out.println("exercise5");
		String palindrome = "madam";
		palindrome(palindrome);
		System.out.println();
		String palindrome2 = "something";
		palindrome(palindrome2);
	}

}
