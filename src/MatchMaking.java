import java.util.ArrayList;
import java.util.Arrays;

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
	private static void matchMakingLoop(int [] matchMaking, int target) {		
		ArrayList<Integer[]> sum5 = new ArrayList<Integer[]>();
		Integer[] pair = new Integer[2];

		//calculate the pairs
		for(int a = 0; a< matchMaking.length; a++) {
			for(int b =0;b< matchMaking.length ;b++) {
				if(matchMaking[a]+ matchMaking[b] == target && b !=a) {
					pair[0]=matchMaking[a];
					pair[1]=matchMaking[b];
					sum5.add(pair);
					//display the results from the arrayList
					
					for(Integer[] i: sum5) {					
						System.out.println(Arrays.toString(i));
					}
				}	
			}			
		}		
	}
	public static void main(String[] args) {
		int [] numbersArr = {2,3,1,8,4,6,3};
		int target = 5;
		matchMakingLoop(numbersArr, target);
	}

}
