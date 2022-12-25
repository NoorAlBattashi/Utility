import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/**
 * 
 */

/**
 * @author LAP-9
 *
 */
public class RecursionPractice {

	/**
	 * @param args
	 */
	// method to calculate the power of the numbers
	private static int power(int base, int exponent) {
		// base case
		if (exponent == 0) {
			return 1;
		}
		// recursive
		return base * power(base, exponent - 1);
	}

	// calculate factorial
	private static int factorialMethod(int factorial) {
		// base case
		if (factorial == 0) {
			return 1;
		}
		// recursive
		return factorial * factorialMethod(factorial - 1);
	}

	// reverse the sentence given by the user
	private static void reverse(String sentence, int length) {
		if (length == 0) {
			return;
		}
		System.out.print(sentence.charAt(length - 1));
		reverse(sentence, length - 1);
	}

	private static int incrementDecrement(int number, int start) {
		System.out.print(start);
		if (start == number) {
			while (start >= 0) {
				System.out.print(start);
				start--;
			}
			return 0;
		}
		return incrementDecrement(number, start + 1);
	}

	// check if the string given is palindrome
	private static void palindrome(ArrayList<Character> palindromeaArrayList, String palindrome, int length,
			int start) {
		// add elements
		if (start < length) {
			palindromeaArrayList.add(palindrome.charAt(start));
		}
		if (start == length) {
			int check = length - 1;
			boolean match = true;
			// check if the elements are matched or not
			for (Character show : palindromeaArrayList) {
				if (show.equals(palindromeaArrayList.get(check)) && check >= 0 && match == true) {
					check--;
					match = true;
				} else {
					match = false;
				}
			}
			// display the results
			if (match == true) {
				System.out.println("INPUT: " + palindrome);
				System.out.println("OUTPUT: " + match);
				return;
			} else if (match == false) {
				System.out.println("INPUT: " + palindrome);
				System.out.println("OUTPUT: " + match);
				return;
			}
		}
		palindrome(palindromeaArrayList, palindrome, length, start + 1);
	}

	private static void fabonacciMethod(int number) {
		int[] arr = new int[number];
		arr[0] = 0;
		arr[1] = 1;
		for (int index = 2; index < number; index++) {
			arr[index] = arr[index - 2] + arr[index - 1];
		}
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {

		System.out.println("Main return (power method): " + power(2, 3));
		System.out.println("Main return (factorial method): " + factorialMethod(5));

		System.out.print("reverse: ");
		String sentence = "this is a sentence";
		reverse(sentence, sentence.length());
		System.out.println();

		int number = 4;
		System.out.println();
		System.out.println("input: " + number);
		System.out.println(incrementDecrement(number - 1, 0));

		int number2 = 5;
		System.out.println();

		System.out.println("input: " + number2);
		System.out.println(incrementDecrement(number2 - 1, 0));

		ArrayList<Character> palindromeaArrayList = new ArrayList<Character>();
		System.out.println();
		System.out.println();
		String palindrome = "madam";
		palindrome(palindromeaArrayList, palindrome, palindrome.length(), 0);
		System.out.println();
		String palindrome2 = "something";
		palindrome(palindromeaArrayList, palindrome2, palindrome2.length(), 0);

		int fabonacci = 8;
		System.out.println();
		fabonacciMethod(fabonacci);

	}

}
