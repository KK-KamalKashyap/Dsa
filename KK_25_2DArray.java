
/*
package JavaSkills;

import java.util.Scanner;

public class KK_25_2DArray {
//PrintSpiral
	static void printMatrix(int [][] matrix) {
		for(int i =0;i <matrix.length;i++) {
			for(int j =0; j < matrix[i].length;j++) {
				System.out.println(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
	static void printSprialOrder (int [][] matrix, int r , int c) {
		int topRow =0, bottomRow = r-1, leftCol = 0, rightCol = c-1;
		int totalElements  =0;
		while( totalElements < r * c) {
			//top row = leftcol to rightcol
			for(int j = leftCol ; j <= rightCol &&  totalElements < r * c;j++) {
				System.out.print(matrix[topRow][j] + " ");
				totalElements++;
			}
			topRow++;
	
			// right col = toprow to bottomrow
			for( int  i = topRow ; i <= bottomRow &&  totalElements < r * c;i++) {
				System.out.print(matrix[i][rightCol] + " ");
				totalElements++;
			}
			rightCol--;
			//bottom row  = right col to left col
			for( int j = rightCol; j >= leftCol &&  totalElements < r * c;j--) {
				System.out.print(matrix[bottomRow][j] + " ");
				totalElements++;
			}
			bottomRow--;
			
			//left col = bottom row to top row 
			for(int i = bottomRow; i >= topRow &&  totalElements < r * c; i--) {
				System.out.print(matrix[i][leftCol] + " ");
				totalElements++;
			}
			leftCol++;
			
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of rows and colums of matrix");
		int r = s.nextInt();
		int c = s.nextInt();
		int [][] matrix = new int[r][c];
		int totalElements = r*c;
		System.out.println(" enter " + totalElements + " values");
		for(int i=0; i< r;i++) {
			for(int j =0; j <c ;j++) {
				matrix[i][j] = s.nextInt();
			}
				
		}

		System.out.print("Input Matrix");
		printMatrix(matrix);

		
		System.out.print("Spiral Order");
		printSprialOrder(matrix,r,c);
	}

}
*/




package JavaSkills;

import java.util.Scanner;

public class KK_25_2DArray {
//GenerateSpiral
	static void printMatrix(int [][] matrix) {
		for(int i =0;i <matrix.length;i++) {
			for(int j =0; j < matrix[i].length;j++) {
				System.out.println(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
	static int[][] generateSpiralMatrix(int n) {
		int [][] matrix = new int[n][n];
		int topRow =0, bottomRow = n-1, leftCol = 0, rightCol = n-1;
		int curr  =1;
		while( curr <= n *n) {
			//top row = leftcol to rightcol
			for(int j = leftCol ; j <= rightCol &&  curr <=  n*n;j++) {
		matrix[topRow][j] = curr++;
		
			}
			topRow++;
	
			// right col = toprow to bottomrow
			for( int  i = topRow ; i <= bottomRow &&  curr <=  n*n;i++) {
	matrix[i][rightCol] = curr++;
	
			}
			rightCol--;
			//bottom row  = right col to left col
			for( int j = rightCol; j >= leftCol &&   curr <=  n*n;j--) {
				matrix[bottomRow][j]= curr++;
		
			}
			bottomRow--;
			
			//left col = bottom row to top row 
			for(int i = bottomRow; i >= topRow &&  curr <=  n*n; i--) {
			matrix[i][leftCol] = curr++;
			
			}
			leftCol++;
			
		}
		return matrix;
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter n");
		int n = s.nextInt();
		
		int[][] matrix = generateSpiralMatrix(n);
		printMatrix(matrix);
		
	}

}