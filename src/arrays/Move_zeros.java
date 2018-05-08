package arrays;
import java.util.Arrays;

public class Move_zeros {
	
	public void convertMoveZeros(int[] arr) {
		
		int i = 0, temp =0;
		
		for(int j=0; j<arr.length;j++) {
		
			if(arr[j] != 0) {
				
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i += 1;
			}
			
		}
		
	}

	
	
	
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int arr[] = {0,1,0,0,3,5};
		Move_zeros m = new Move_zeros();
		m.convertMoveZeros(arr);
		System.out.println("After moving zeros: " + Arrays.toString(arr));
		
	}

}
