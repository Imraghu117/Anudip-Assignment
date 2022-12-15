package Matrix;

public class Matrix {

	public static void main(String[] args) {
			// declaration and initialization of arrays , rows and columns.
			int rows=2,col=3; 
			int [][]arr1 = {{10,20,30},{11,12,13}};
			int [][]arr2 = {{14,15,16},{15,17,18}};
			
			AddTwoMatrix(arr1,arr2,rows,col); //method for Addition.

		}
		// static method to addition of two matrices
		public static void AddTwoMatrix(int [][]arr1,int [][]arr2,int rows,int col) {
			int [][]sum = new int[rows][col];
			//logic for addition
			for(int i=0; i<rows;i++) {
				for(int j=0; j<col;j++) {
					sum[i][j] = arr1[i][j]+ arr2[i][j];
				}
			}
			printMatrix(sum);// method to print sum of matrix
		}
		// static method to print the sum of two matrices
		public static void printMatrix(int [][]sum) {
			System.out.println("Sum of two matrices are:: " + "Resultant Matrix ");
			//using For Each loop
			for(int[] row: sum) {
				for(int col:row) {
					System.out.print(col +" " );
				}
				System.out.println(); //this is to print the result in matrix form.
			}

	}

}
