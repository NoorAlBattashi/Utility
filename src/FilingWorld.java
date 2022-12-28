import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.security.PublicKey;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author LAP-9
 *
 */
public class FilingWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File dataFile = new File(DATA_FILE_PATH);
		
//		if(dataFile.exists()) {
//			try {
//				Scanner fileScanner = new Scanner(dataFile);
//			
//				while (fileScanner.hasNextLine()) {
//					System.out.println(fileScanner.nextLine());
//				}
//				fileScanner.close();
//			} catch (FileNotFoundException e) {
//				System.out.println("Did you create the file?");
//				e.printStackTrace();
//			}catch (Exception e) {
//				System.out.println("Error"+ e);
//			}
//		}//if
//		else {
			try {
				FileWriter newFile = new FileWriter(DATA_FILE_PATH, true);
				System.out.println("I have created this file for you " + DATA_FILE_PATH);	
//				newFile.write("I type here\n");
//				newFile.write("I am trying to type here again\n");
//				newFile.write("test new added line\n");
				newFile.write("test another new added line\n");
				newFile.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
//			finally {
//				
//			}
//		}
	
	}
	public static final	 String DATA_FILE_PATH = "data/data.txt";
}
