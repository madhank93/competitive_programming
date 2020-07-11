package reverse_an_array;
import java.util.Arrays;

public class ReverseArray {

	public int[] reverseAnArray(int[] arr) {
		
		int position = 0;
		int[] reversedArray = new int[arr.length];
		
		for (int i=arr.length-1; i>=0; i-- ) {
			reversedArray[position] = arr[i];
			position = position +1;
		}
		
		return reversedArray;
	}
	
	public static void main(String[] args) {
		ReverseArray obj = new ReverseArray();
		int[] res = obj.reverseAnArray(new int[]{5,4,3,2,1});		
		System.err.println(Arrays.toString(res));
	}

}
