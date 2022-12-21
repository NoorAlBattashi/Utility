import java.security.interfaces.DSAKeyPairGenerator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

/**
 * 
 */

/**
 * @author LAP-9
 *
 */
public class MatchMaking {

	/**
	 * @param args: pair total 5
	 */
	private static void matchMakingLoop(int[] matchMaking, int target) {
		ArrayList<Integer[]> sum5 = new ArrayList<Integer[]>();
		// calculate the pairs
		for (int a = 0; a < matchMaking.length; a++) {
			for (int b = 0; b < matchMaking.length; b++) {
				if (matchMaking[a] + matchMaking[b] == target && b != a) {
					Integer[] pair = new Integer[2];
					pair[0] = matchMaking[a];
					pair[1] = matchMaking[b];
					sum5.add(pair);
				}
			}
		}
		// display the results from the arrayList
		HashMap<String, Integer> display = new HashMap<String, Integer>();
		for (Integer[] i : sum5) {
			display.put(Arrays.toString(i), null);
		}
		for (String d : display.keySet()) {
			System.out.print(d);
		}
		System.out.println();
	}

	private static void matchMakingHashMap(int[] matchMaking, int target) {
		HashMap<Integer, Boolean> sum5 = new HashMap<Integer, Boolean>();
		for (int a = 0; a < matchMaking.length; a++) {
			int find = target - matchMaking[a];

			if (sum5.containsKey(find) && sum5.get(find) == false) {
				System.out.println(matchMaking[a] + " " + find);
				sum5.put(matchMaking[a], true);

				sum5.put(matchMaking[a], true);
				sum5.put(find, true);
			} else {
				sum5.put(matchMaking[a], false);

			}
		}
	}

	public static void main(String[] args) {
		int[] numbersArr = { 2, 3, 1, 8, 4, 6, 3 };
		int[] numbers2Arr = { 6, 4, 7, 3, 1, 6 };
		int[] numbers3Arr = { 6, 7, 4, 7, 4, 3, 6, 4, 5 };
		int target = 5;
		int target2 = 10;
		matchMakingLoop(numbers2Arr, target2);
		System.out.println("===========================");
		matchMakingHashMap(numbers2Arr, target2);
	}

}
