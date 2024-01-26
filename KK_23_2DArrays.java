/*


package JavaSkills;

import java.util.Scanner;

public class KK_23_2DArrays {
	static void printArray(int[][] arr) { //row
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) { ///column
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int r = s.nextInt();
		System.out.println("Enter number of colums");
		int c = s.nextInt();
		
int [][] arr = new int[r][c];  //total=r*c
System.out.println("Enter "+ r*c + " elements");
for(int i=0;i<r;i++) {
	for(int j=0;j<c;j++) {
		arr[i][j] =s.nextInt();
	}
}
/*
 * arr[0][0] =1; arr[0][1]=2;
 
 */
/*
 * int [][]arr2 = { {1,5,6 }, {7, 9 ,11}, {8,1,1}, };
 */
//printArray(arr2);
//printArray(arr);
//	}

//}



//*/


package JavaSkills;
import java.util.Scanner;
//matrix
public class KK_23_2DArrays {
	
	static void printMatrix(int[][] matrix) {
		for(int i=0;i< matrix.length;i++) {
			for(int j=0;j < matrix[i].length;j++) {
				System.out.println(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	
	static void multiply(int [][] a, int r1, int c1, int[][] b, int r2, int c2) {
		if(c2 != r2) {
			System.out.println("Multiplication not possible - wrong dimension");
		return;
		}
		int [][] mul = new int[r1][c2];   //
		for(int i =0;i < r1;i++) {  //row
			for(int j=0; j < c2; j++) {  // coloum
//				mul[i][j] = reow of a * col of b
				// i = 1, j =0;
				for(int k=0; k < c1; k++) {
					mul[i][j]   +=  (a[i][k] * b [k][j]);
				}
				
				  
				
		}
		}
		
		System.out.println(" Multiplication of 2 matrices");
	printMatrix(mul);
	
		
	}
	
	
	
	
	static void add(int [][] a, int r1, int c1, int[][] b, int r2, int c2) {
		if(r1 != r2 || c1 != c2) {
			System.out.println("Wrong input - Addition not possible");
		return;
		}
		
		int [][] sum = new int[r1][c1];
		for(int i =0;i< r1;i++) { // row number
			for(int j =0; j < c1;j++) { // column number
				sum[i][j] = a[i][j] + b[i][j];
			}
		}
		
		printMatrix(sum);
		
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s =new Scanner(System.in);
System.out.println("Enter number of rows and colums of matrix 1");
int r1 = s.nextInt();
int c1 = s.nextInt();
int[][] a = new int[r1][c1];
System.out.println("Enter matrix values");
for(int i =0; i <r1 ;i++) {
	for(int j=0; j <c1 ; j++) {
		a[i][j] = s.nextInt();
	}
}



System.out.println("Enter number of rows and coloums of matrix 2");
int r2 = s.nextInt();
int c2 = s.nextInt();
int [][] b =new int[r2][c2];
System.out.println("Enter matrix values");
for( int i =0; i <r2; i++) {
	for( int j=0;j <c2;j++) {
		b[i][j] = s.nextInt();
	}
	
}

System.out.println("Matrix 1");
printMatrix(a);
System.out.println("Matrix 2");
printMatrix(b);


//add(a, r1, c1, b, r2, c2);
multiply(a , r1 , c1, b, r2, c2);
	}

}

