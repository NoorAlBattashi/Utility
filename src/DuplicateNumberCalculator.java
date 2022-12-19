
/**
 * 
 */

/**
 * @author LAP-9
 *
 */
import java.util.HashMap;

public class DuplicateNumberCalculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] duplicatArr = { 0, 12, 8, 1, 12, 6, 8, 2, 6, 11, 1, 1 };

		// numberOfDuplication using loop
		int index = 0;
		int element = 0;
		boolean isExist = false;
		for (int a = 0; a < duplicatArr.length; a++) {
			int count = 0;
			for (int b = a; b < duplicatArr.length; b++) {

				if (duplicatArr[a] == duplicatArr[b]) {
					count++;
					index = a;
					element = duplicatArr[a];
				}
			}
			for (int c = index - 1; c >= 0 && isExist == false; c--) {
				if (element == duplicatArr[c]) {
					isExist = true;
				} else {
					isExist = false;
				}
			}

			if (isExist == false) {
				System.out.println(element + " repeted " + count + " time(s)");
			}
			isExist = false;
		}

		// numberOfDuplication using HashMap
		
		// Array{ 0, 12, 8, 1, 12, 6, 8, 2, 6, 11, 1, 1 }
		System.out.println("---------------------------------");

		HashMap<Integer, Integer> duplicatNumHashMap = new HashMap<Integer, Integer>();
        
		//declare the hashMap objects
		for (int declare = 0; declare < duplicatArr.length; declare++) {
			duplicatNumHashMap.put(duplicatArr[declare], 0);
		}
        //calculate the duplication
		for (int a = 0; a < duplicatArr.length; a++) {

			if (duplicatNumHashMap.containsKey(duplicatArr[a])) {

				duplicatNumHashMap.put(duplicatArr[a], duplicatNumHashMap.get(duplicatArr[a]) + 1);
			}

		}
		System.out.println(duplicatNumHashMap);

	}// end

}
