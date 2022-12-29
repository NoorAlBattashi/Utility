import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/**
 * 
 */

/**
 * @author LAP-9
 *
 */
public class HashSetExercise {


	public static void main(String[] args) {
		String[] nameStrings = { "Mr A", "Mr B", "Mr A", "Mr C", "Mr A", "Mr D", "Mr B", "Mr C" };
		System.out.println("with Hashset for names");
		uniqueNameHashSet(nameStrings);
		System.out.println();
		System.out.println("without Hashset for names");
		uniqueName(nameStrings);
		
		System.out.println();
		System.out.println();
		String[] input1 = {"Mr A", "Mr B", "Mr C", "Mr Y", "Mr E"};
		String[] input2 = {"Mr X", "Mr Z", "Mr B", "Mr A", "Mr Y", "Mr S", "Mr T"};
		System.out.println("with Hashset for resturant");
		employeesHashSet(input1,input2);
		System.out.println();
		System.out.println("without Hashset for resturant");
		employees(input1,input2);
	}

	/**
	 *  Given an array of names, remove the duplicate names. With HashSets
	 INPUT: ["Mr A", "Mr B", "Mr A", "Mr C", "Mr A", "Mr D", "Mr B", "Mr C"]
	 OUTPUT: ["Mr A", "Mr B", "Mr C", "MR D"]
	 */
	public static void uniqueNameHashSet(String[] names) {
		HashSet<String> unique = new HashSet<String>();
		for (int index = 0; index < names.length; index++) {
			unique.add(names[index]);
		}
		for (String iString : unique) {
			System.out.print(iString + " ");
		}
	}
	/**
	 *  Given an array of names, remove the duplicate names. Without HashSets
	 INPUT: ["Mr A", "Mr B", "Mr A", "Mr C", "Mr A", "Mr D", "Mr B", "Mr C"]
	 OUTPUT: ["Mr A", "Mr B", "Mr C", "MR D"]
	 */
	public static void uniqueName(String[] names) {
		HashMap<String, Integer> unique = new HashMap<String, Integer>();
		for (int index = 0; index < names.length; index++) {
			unique.put(names[index], null);
		}
		for (String iString : unique.keySet()) {
			System.out.print(iString + " ");
		}
	}
	public static void employeesHashSet(String[] input1, String[] input2) {
		HashSet<String> resturatn1 = new HashSet<String>();
		for (int index1 = 0; index1 < input1.length; index1++) {
			resturatn1.add(input1[index1]);
		}
		HashSet<String> resturatn2 = new HashSet<String>();
		for (int index2 = 0; index2 < input2.length; index2++) {
			resturatn2.add(input2[index2]);
		}
		
		resturatn1.retainAll(resturatn2);
		for(String iString : resturatn1) {
			System.out.print(iString + " ");
		}
		
	}
	
	public static void employees(String[] input1, String[] input2) {		
		for(int index2=0; index2<input2.length; index2++) {
			for(int index1=0; index1<input1.length; index1++) {
				if(input2[index2] == input1[index1]) {
					System.out.print(input2[index2] + " ");
				}
			}
		}
		
	}
}
