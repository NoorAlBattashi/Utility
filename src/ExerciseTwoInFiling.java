import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author LAP-9
 *
 */
public class ExerciseTwoInFiling {

	/**
	 * @param args
	 */
	public static final String FILE_PATH = "data/data.csv";

	public static void main(String[] args) {
		File dataFile = new File(FILE_PATH);

		try {
			FileWriter storeuserInput = new FileWriter(dataFile, true);
			System.out.print("Enter your Name: ");
			Scanner userNameInputScanner = new Scanner(System.in);
			String storeUserName = userNameInputScanner.nextLine();

			System.out.print("Enter your Email: ");
			Scanner userEmailInputScanner = new Scanner(System.in);
			String storeUserEmail = userEmailInputScanner.nextLine();
			
			System.out.println("Added Successfully!");
			
			storeuserInput.write(storeUserName + ", "+storeUserEmail +", true\n");
			storeuserInput.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
