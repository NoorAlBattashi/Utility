import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author LAP-9
 *
 */
public class ExerciseOneInFiling {

	/**
	 * @param args
	 */
	public static final String FILE_PATH = "data/practiceFiling.csv";
	public static void main(String[] args) {
		File exerciseFile = new File(FILE_PATH);
		HashMap<String, String[]> storeDataHashMap = new HashMap<String, String[]>() ;
		
		try {
			Scanner fileScanner = new Scanner(exerciseFile);
			
			while (fileScanner.hasNextLine()) {
				String[] detailStrings = new String[3];
				String[] arrOfStr = fileScanner.nextLine().split(",");
				for(int index =0; index< detailStrings.length; index++) {
					detailStrings[index] = arrOfStr[index+1];	
				}
				storeDataHashMap.put(arrOfStr[0], detailStrings);			
			}
			for(String iString :storeDataHashMap.keySet()) {
				System.out.print(iString);
				for(int index =0; index < 3;index++) {
					System.out.print(storeDataHashMap.get(iString)[index] + " ");
				}
				System.out.println();
			}
			fileScanner.close();
		} catch (FileNotFoundException e) {
			System.out.println("Did you create the file?");
			e.printStackTrace();
		}catch (Exception e) {
			System.out.println("Error"+ e);
		}
	}

}
