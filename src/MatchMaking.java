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
		//display the results from the arrayList
		HashMap<String, Integer> display = new HashMap<String, Integer>();
		for (Integer[] i : sum5) {
			display.put(Arrays.toString(i), null);
		}
		for (String d : display.keySet()) {
			System.out.print(d);
		}
		System.out.println();
	}

	public static ArrayList<Integer[]> getMatchingPairs(int[] inputArray, int targetSum) {
        /*
         * This will remember the previous states, so we know which part of
         * pair has been traversed already.
         * */
        HashMap<Integer, Integer> stateMap = new HashMap<Integer, Integer>();
        
        // Used to store every generated pair.
        ArrayList<Integer[]> resultStore = new ArrayList<Integer[]>();

        for (int index = 0; index < inputArray.length; index++) {
            int partOfPair = targetSum - inputArray[index];
            Integer usageCountOfPart = stateMap.get(partOfPair);

            // Here we found a pair.
            if (stateMap.containsKey(partOfPair) && usageCountOfPart >= 1) {
                resultStore.add(
                    new Integer[] {inputArray[index], partOfPair}
                );
                
                // Get existing usage count and decrease it by 1 for the first part of the pair
                int usageCount = stateMap.get(partOfPair);
                stateMap.put(partOfPair, usageCount - 1);
                
                // Get existing usage count and decrease it by 1 for the second part of the pair
                if (stateMap.containsKey(inputArray[index])) {
                    usageCount = stateMap.get(inputArray[index]);
                    stateMap.put(inputArray[index], usageCount - 1);
                }
                else {
                    /*
                     * In case we already used the new part of pair with an existing part
                     * Then we should set the usage to -1 so it balances out.
                     * */
                    stateMap.put(inputArray[index], -1);
                }
            }
            
            // If something is new, we can put it with allowed usage to 1 time.
            // 6, 6, 6, 4, 4, 4
            if (!stateMap.containsKey(inputArray[index])) {
                stateMap.put(inputArray[index], 1);  // 1 is the allowed usage count.
            }
            else {
                // Get existing usage count and update the counter by 1
                int usageCount = stateMap.get(inputArray[index]);
                stateMap.put(inputArray[index], usageCount + 1);
            }
        }
        
        return resultStore;
    }
    
    private static void displayResult(ArrayList<Integer[]> inputArray) {
        for (Integer[] currentPair: inputArray) {
            System.out.println(currentPair[0] + " - " + currentPair[1]);
        }
        System.out.println();
    }


	public static void main(String[] args) {
//		int[] numbersArr = { 2, 3, 1, 8, 4, 6, 3 };
//		int[] numbers2Arr = { 6, 4, 7, 3, 1, 6 };
//		int[] numbers3Arr = { 6, 7, 4, 7, 4, 3, 6, 4, 5 };
//		int target = 5;
//		int target2 = 10;
//		matchMakingLoop(numbers2Arr, target2);
//		System.out.println("===========================");
		int target = 10;

	        ArrayList<Integer[]> resultStore = new ArrayList<Integer[]>();

	        // Case 1
	        resultStore = getMatchingPairs(new int[] { 6, 6, 6, 4, 4, 4, 4, 6, 6}, target);
	        displayResult(resultStore);
	}

}
