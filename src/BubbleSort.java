/**
 * 
 */

/**
 * @author LAP-9
 *
 */
public class BubbleSort {

	/**
	 * @param args
	 */
	private static int [] bubbleSort(int [] bubbleArr) {
		int greater =0;
		int greaterIndex =0;
		int smallest =0;
		int smallestIndex =0;
		for(int a = 0 ; a < bubbleArr.length; a++) {
			
			for(int b = a+1; b< bubbleArr.length; b++) {
				if(bubbleArr[a] > bubbleArr[b]) {
					greater = bubbleArr[a];
					greaterIndex = a;
					smallest = bubbleArr[b];
					smallestIndex = b;
					bubbleArr[b]= smallest;
					bubbleArr[a] = greater;
				}else if(bubbleArr[a] < bubbleArr[b]) {
					greater = bubbleArr[b];
					greaterIndex = b;
					smallest = bubbleArr[a];
					smallestIndex = a;
					bubbleArr[b]=smallest ;
					bubbleArr[a] = greater;
				}
			}
			
		}
		return bubbleArr;	
	}
	public static void main(String[] args) {
		int [] bubbleArr = {4,1,5,7,2};
		int [] bubble2Arr = {1,2,3,4,5};
		for(int element: bubbleSort(bubble2Arr)) {
			System.out.println(element);
		}
		
		
	}

}
