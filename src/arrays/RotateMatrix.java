package arrays;

public class RotateMatrix {

	
	
	public int[][] rotateImage(int [][] matrix) {
		
		int n = matrix.length -1 ;
		for(int i = 0; i < n/2 + 1 ; i++) {
			
			for(int j= i; j < n-i; j++) {
				
				int temp = matrix[i][j];
                matrix[i][j]=matrix[n-j][i];
                matrix[n-j][i]=matrix[n-i][n-j];
                matrix[n-i][n-j]=matrix[j][n-i];
                matrix[j][n-i]=temp;
                             
				
			}
			
		}
		return matrix;
		
	}
	public static void main(String[] args) {
		
		
		int [][] matrix = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
		for(int i=0; i <= matrix.length -1; i++){
			for(int j=0; j <= matrix[i].length -1; j++){
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
			
		}
		
		System.out.println("Output is: ");
		RotateMatrix r = new RotateMatrix();
		int [][] ans = r.rotateImage(matrix);
		
		for(int i=0; i <= ans.length -1; i++){
			for(int j=0; j <= ans[i].length -1; j++){
				System.out.print(ans[i][j] + " ");
			}
			System.out.println();
			
		}

	}

}
