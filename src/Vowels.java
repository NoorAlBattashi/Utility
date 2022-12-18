import java.util.HashMap;

/**
 * 
 */

/**
 * @author LAP-9
 *
 */
import java.util.Scanner;

public class Vowels {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your sentence to count the vowels letters");
		Scanner vowelsSc = new Scanner(System.in);
		String enterSentance = vowelsSc.next();

		String str = enterSentance;
		str = str.toLowerCase();
		int a = 0;
		int e = 0;
		int i = 0;
		int o = 0;
		int u = 0;
		for (int b = 0; b < str.length(); b++) {
			// check if char[i] is vowel
			if (str.charAt(b) == 'a') {
				// count increments if there is vowel in char[i]
				a++;
			} else if (str.charAt(b) == 'e') {
				e++;
			} else if (str.charAt(b) == 'i') {
				i++;
			} else if (str.charAt(b) == 'o') {
				o++;
			} else if (str.charAt(b) == 'u') {
				u++;
			}
		}

		// display vowels in string
		System.out.println("Total a: " + a);
		System.out.println("Total e: " + e);
		System.out.println("Total e: " + i);
		System.out.println("Total e: " + o);
		System.out.println("Total e: " + u);
		
		
		
		HashMap<Character, Integer> vowels = new HashMap<Character, Integer>();
				vowels.put('a', 0);
				vowels.put('e', 0);
				vowels.put('i', 0);
				vowels.put('o', 0);
				vowels.put('u', 0);
				
				String hashVowelString =enterSentance;
				hashVowelString = hashVowelString.toLowerCase();
				
				for (int b = 0; b < hashVowelString.length(); b++) {
					// check if char[i] is vowel
					if (vowels.get(hashVowelString.charAt(b)) == hashVowelString.charAt(b)) {
						int count = vowels.get(hashVowelString.charAt(b));
						vowels.put(hashVowelString.charAt(b), ++count);
					} 
				}
				for(char currentKey: vowels.keySet()) {
					 System.out.println(currentKey);
		        }
			
	}

}
