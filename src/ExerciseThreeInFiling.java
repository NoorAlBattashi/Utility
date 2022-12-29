import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author LAP-9
 *
 */
public class ExerciseThreeInFiling {

	/**
	 * @param args
	 */
	public static final String FILE_PATH1 = "data/input.txt";
	public static final String FILE_PATH2 = "data/result.txt";

	public static void main(String[] args) {
		File inputFile = new File(FILE_PATH1);
		File resultFile = new File(FILE_PATH2);
		try {
			Scanner fileScanner = new Scanner(inputFile);
			try {
				FileWriter storUpperCaseFile = new FileWriter(resultFile);
				while (fileScanner.hasNextLine()) {
					String converString = fileScanner.nextLine().toUpperCase();
					storUpperCaseFile.write(converString + "\n");
				}
				storUpperCaseFile.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			fileScanner.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
