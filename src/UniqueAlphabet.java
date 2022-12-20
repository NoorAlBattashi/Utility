import java.util.ArrayList;
import java.util.HashMap;

/**
 * 
 */

/**
 * @author LAP-9
 *
 */
public class UniqueAlphabet {

	/**
	 * @param args: display unique alphabets
	 */
	private static void uniqueAlphabet(char[] uniqueAlpha) {
		//loop
		int elementIndex = 0;
		ArrayList<Character> newArr = new ArrayList<Character>();

		boolean isExist = false;
		for (int a = 0; a < uniqueAlpha.length; a++) {
			for (int b = a + 1; b < uniqueAlpha.length; b++) {
				if (uniqueAlpha[a] != uniqueAlpha[b] && isExist == false) {
					elementIndex = a;
				}
			}
			for (int c = elementIndex - 1; c >= 0; c--) {
				if (uniqueAlpha[a] != uniqueAlpha[c] && isExist == false) {
				} else {
					isExist = true;
				}
			}
			if (isExist == false) {
				newArr.add(uniqueAlpha[a]);
			} else {
				isExist = false;
			}
		}
		System.out.println("Find unique alphabets using loop: ");
		System.out.print("The unique alphabets are : ");
		for (char elements : newArr) {
			System.out.print(elements + " ");
		}
	}

	private static void uniqueAlphaHash(char[] alphaArr) {

		System.out.println();
		System.out.println("=====================================");
		System.out.println("Find unique alphabets using HashMap: ");

		HashMap<Character, Integer> uniqueHashMap = new HashMap<Character, Integer>();
		for (int a = 0; a < alphaArr.length; a++) {
			uniqueHashMap.put(alphaArr[a], null);
		}
		System.out.print("The unique alphabets are : ");
		for (char key : uniqueHashMap.keySet()) {
			System.out.print(key + " ");
		}

	}

	public static void main(String[] args) {
		char[] uniqueAlpha = { 'c', 'a', 'c', 't', 'r', 'a', 't', 'z' };

		// loop
		uniqueAlphabet(uniqueAlpha);

		// hashMap

		uniqueAlphaHash(uniqueAlpha);
	}

}
