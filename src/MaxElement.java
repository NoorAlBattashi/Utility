import javax.xml.crypto.dsig.dom.DOMValidateContext;

/**
 * 
 */

/**
 * @author LAP-9
 *
 */
public class MaxElement {

	/**
	 * @param args: display the largest element in the array
	 */
	private static int getIndex(int[] thirdMaxNum, int x) {
		int col=0;
		
		for (int a=0;a<thirdMaxNum.length;a++) {
			
			if(thirdMaxNum[a] == x) {
			col = a;
		}
		}
		
		return col;
	}
	private static int maxnum(int[] maxNum) {
		int x = 0;
		for (int a = 0; a < maxNum.length; a++) {

			if (maxNum[a] > x) {
				x = maxNum[a];
			}
		}
		return x;
	}

	private static int[] secondMaxnum(int[] secMaxNum) {
		int[] maxN = new int[2];
		int b = 0;// index of the largest number
		int s = 0; // right element
		int l = 0;// left element
		int secondLargest = 0;

		b= getIndex(secMaxNum, maxnum(secMaxNum));
		
		for (int i = b + 1; i < secMaxNum.length; i++) {
			if (secMaxNum[i] > s) {
				s = secMaxNum[i];
			}
		}
		for (int c = b - 1; c >= 0; c--) {
			if (secMaxNum[c] > l) {

				l = secMaxNum[c];
			}
		}
        //compare right and left largest elements
		if (l > s) {
			secondLargest = l;
		} else {
			secondLargest = s;
		}
		maxN[0] = maxnum(secMaxNum);
		maxN[1] = secondLargest;

		return maxN;
	}
	
	private static int[] thirdMaxNum(int[] thirdMaxNum) {
		int[] maxN = new int[3];
		int [] largestnumbers = secondMaxnum(thirdMaxNum);
		int secondLargest=largestnumbers[1];
		int thirdLargest =0;
		for(int a=0; a<thirdMaxNum.length; a++) {
			
			if (thirdMaxNum[a] > thirdLargest && thirdMaxNum[a] != maxnum(thirdMaxNum) && thirdMaxNum[a] != secondLargest ) {
				thirdLargest = thirdMaxNum[a];
			}
		}
		
		maxN[0] = maxnum(thirdMaxNum);
		maxN[1] = secondLargest;
		maxN[2] = thirdLargest;
		return maxN;
	}

	public static void main(String[] args) {
		int[] maxElementArr = { 50,12,8,10,100,1001,6,87,24};

		// Display the largest value
		System.out.println("Largest Number is: " + maxnum(maxElementArr));

		// Display the second largest value
		//System.out.println("Second Largest Number is: " + secondMaxnum(maxElementArr));
		System.out.println("Largest and Second Largest Numbers are: ");
		for (int i : secondMaxnum(maxElementArr)) {
			System.out.println(i);
		}

		// Display the third largest value
		 System.out.println("Largest and Second Largest and Third Largest Numbers are: ");
			for (int i : thirdMaxNum(maxElementArr)) {
				System.out.println(i);
			}
			
			
	}//end
	
}
