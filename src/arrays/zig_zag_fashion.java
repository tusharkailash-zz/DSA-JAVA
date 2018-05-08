package arrays;
import java.util.Arrays;
public class zig_zag_fashion {

	public void convertToZigZag( int [] arr){
		
			boolean flag = true;
			int temp = 0;
			for(int i=0; i<arr.length-1;i++){
				
				if(flag == true) {
					
					if(arr[i] > arr[i+1]){
						temp = arr[i];
						arr[i] = arr[i+1];
						arr[i+1] = temp;
				}
				}
				else{
					if(arr[i] < arr[i+1]){
						temp = arr[i];
						arr[i] = arr[i+1];
						arr[i+1] = temp;
					}
				}
		      
		       flag = !flag;

			}
	}

	
	
	public static void main(String[] args) {
		
		int[] arr = {4,3,7,8,6,2,1};
		zig_zag_fashion a = new zig_zag_fashion();
		a.convertToZigZag(arr);
		System.out.println("The answer is:\n" + Arrays.toString(arr));
		
	}

}
