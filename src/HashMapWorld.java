import java.util.HashMap;

/**
 * 
 */

/**
 * @author LAP-9
 *
 */
public class HashMapWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> studentInfo = new HashMap<String, String>();
		studentInfo.put("name", "hi");
		studentInfo.put("id", "h794rh");
		studentInfo.put("age", "789");

		System.out.println(studentInfo.get("age"));
		// studentInfo.clear();
//
//		for (String currentKey : studentInfo.keySet()) {
//			System.out.println(currentKey);
//		}
//		System.out.println("--------------");
//		for (String currentKey : studentInfo.values()) {
//			System.out.println(currentKey);
//		}

	}

}
