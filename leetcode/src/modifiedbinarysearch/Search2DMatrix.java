package modifiedbinarysearch;

public class Search2DMatrix {
	
	public static void main(String[] args) {
		int[][] matrix = {
		  {10, 20, 30, 40},
		  {15, 25, 35, 45},
		  {27, 29, 37, 48},
		  {32, 33, 39, 50}
		};
		
		System.out.println(search2DMatrix(matrix,39));
	}
	
	public static int search2DMatrix(int[][] matrix, int target) {		
		int m = matrix.length;
		int n = matrix[0].length;
		
		int row=0;
		int col=n-1;
		
		while(row < m && col >=0) {			
			if(target==matrix[row][col]) {return matrix[row][col];}
			if(target < matrix[row][col]) {
				col--;
			}else {
				row++;
			}			
		}
		
		return 0; 
	}

}
