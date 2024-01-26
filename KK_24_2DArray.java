
/*

package JavaSkills;

import java.util.Scanner;

public class KK_24_2DArray {
// TransposeMatrix
	static void printMatrix(int [][] matrix) {
		for(int  i =0; i < matrix.length;i++) {
			for(int j =0;j < matrix[i].length;j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
	
static int[][] findTranspose (int [][] matrix, int r, int c){
	int [][] ans = new int[c][r];
	for(int i =0; i <c; i++) {
		for(int j =0; j < r ; j++) {
			ans[i][j] = matrix [j][i];
		}
	}
	return ans;
}
	 
	static void transposeInPlace(int[][] matrix, int r , int c) {
		for(int i =0; i < c;i++) {
			for(int j =i; j <r ; j++) {
				// swap matrix[i][j], matrix[j][i]
				
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
	}
	
	
	static void rotate (int[][] matrix, int n) {
		
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

System.out.println("Input Matrix");
printMatrix(matrix);


System.out.println("Transpose of Matrix");

//int [][] ans = findTranspose(matrix, r, c);
//printMatrix(ans);

transposeInPlace(matrix,r,c);
printMatrix(matrix);




	}

}
*/




/*
package JavaSkills;

import java.util.Scanner;

public class KK_24_2DArray {
// TransposeMatrix
	static void printMatrix(int [][] matrix) {
		for(int  i =0; i < matrix.length;i++) {
			for(int j =0;j < matrix[i].length;j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
	
static int[][] findTranspose (int [][] matrix, int r, int c){
	int [][] ans = new int[c][r];
	for(int i =0; i <c; i++) {
		for(int j =0; j < r ; j++) {
			ans[i][j] = matrix [j][i];
		}
	}
	return ans;
}
	 
	static void transposeInPlace(int[][] matrix, int r , int c) {
		for(int i =0; i < c;i++) {
			for(int j =i; j <r ; j++) {
				// swap matrix[i][j], matrix[j][i]
				
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
	}
	
	static void reverseArray(int[] arr) {
		int i=0, j= arr.length-1;
		
		while(i < j) {
			int temp = arr[i];
			arr[i] =arr[j];
			arr[j] = temp;
			i++;
			j--;
			
		}
	}
	static void rotate (int[][] matrix, int n) {
		// transpose

		transposeInPlace(matrix, n , n);
		
		// reverse each row of transposed matrix
		
		for(int i =0; i <n; i++) {
/* 1 2 3
 * 4 5 6
 * 7 8 9
 * 
 * i =0
 * reverseArray({1,2,3)};
 * 
 *//*
			reverseArray(matrix[i]);
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

System.out.println("Input Matrix");
printMatrix(matrix);


System.out.println("Transpose of Matrix");

//int [][] ans = findTranspose(matrix, r, c);
//printMatrix(ans);

//transposeInPlace(matrix,r,c);
//printMatrix(matrix);

rotate(matrix, r);
System.out.println("Rotation of matrix");
printMatrix(matrix);


	}

}


*/




package JavaSkills;

import java.util.Scanner;

public class KK_24_2DArray {
// PrintMatrix
	static void printMatrix(int [][] matrix) {
		for(int  i =0; i < matrix.length;i++) {
			for(int j =0;j < matrix[i].length;j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	static int[][] pascal(int n){
		int[][] ans = new int[n][];
		for(int i =0; i < n;i++) {
			// ith row has i+1 colums
			/*
			 * ans[0] = new int[1];
			 * ans [1] = new int [2];
			 * 
			 */
			ans[i] = new int[i+1];
		 //1st and last element of every row is 1
			ans[i][0] = ans[i][i] = 1;
		
			for(int j =1; j<i;j++) {
				ans[i][j] = ans[i-1][j]+ ans[i-1][j-1];
				
			}
			
			
		}
		
		
		
		return ans;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s = new Scanner(System.in);
System.out.println("Enter n");
int n = s.nextInt();
int [][] ans = pascal(n);
printMatrix(ans);

	}

}







