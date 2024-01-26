package JavaSkills;

import java.util.Scanner;

public class KK_19_ProblemOnArray_2 {


	//a=9,b=3
	static void swap(int[] arr, int a, int b) {
		System.out.println("Original values before swap");
		System.out.println("a: " + a);
		System.out.println("b: " + b);

		int temp = a;//temp=9
		a=b; //a =3
		b=temp;//b=9



		System.out.println("Values after swap");
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		//a=3,b=9	





	}
	//a=9,b=3
	static void swapWithoutTemp(int a, int b) {
		System.out.println("Original values before swap");
		System.out.println("a: " + a);
		System.out.println("b: " + b);

		a=a+b;
		b=a-b;
		a = a-b;




		System.out.println("Values after swap");
		System.out.println("a: " + a);
		System.out.println("b: " + b);


	}
	static void printArray(int[] arr) {

		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}


	/*
	static int[] reverseArray(int [] arr) {
		int n = arr.length;
		int[] ans = new int[n];
		int j=0;
		//traversal orignal array in reverse direction
		
		for(int i= n-1;i>=0;i--) {
			ans[j++] = arr[i];
		}
		}
	 */
	//		int i= n-1,j = 0;
	//		while(i >= 0) {
	//			ans[j++] = arr[i--];
	//		}
	//		
	//		return  ans;
	//		
	//	}
	
	static void swapInArray(int [] arr,int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] =temp;
	}
	static void reverseArray(int [] arr) {
		int i=0, j = arr.length-1;

		while(i <  j) {
			swapInArray(arr, i, j);
			i++;
			j--;

		}
	}

	static int[] rotate(int[] arr,int k) {
		int n = arr.length;
		k=k%n;
		int [] ans = new int[n];
		int j=0;
		for(int i=n-k;i<n;i++) {
			ans[j++] = arr[i];

		}
		for(int i=0;i<n-k;i++) {
			ans[j++] = arr[i];

		}
		return ans;

	}


	static void swap1(int[] arr, int i,int j) {
		
	}
	static void reverse(int[]arr, int i,int j) {
		//int i=0,j =arr.length-1;
		while(i<j) {
			swap1(arr,i, j);
			i++;
			j--;
		}
	}

	static void rotateInPlace(int[] arr, int k) {
		int n =arr.length;
		k=k%n;
		reverse(arr, 0, n-k-1);
		reverse(arr, n-k, n-1);
		reverse (arr, 0,n-1);


	}







	public static void main(String[] args) {



		/*
int a =9;
int b = 3;
int[] arr= {1,2,3,4,5,6};
//int[] ans = reverseArray(arr);

	//	swap(a,b);
//swapWithoutTemp(a,b);
//printArray(ans);
reverseArray(arr);
printArray(arr);
		 */

		Scanner s = new Scanner(System.in);
		System.out.print("Enter array size ");
		int n =s.nextInt();
		int [] arr = new int[n];

		System.out.print("Enter "+ n + " elements");
		for(int i=0;i<n;i++) {
			arr[i] =s.nextInt();

		}

		System.out.print("Enter k: ");
		int k=s.nextInt();

		System.out.print("Origanl array");
		printArray(arr);
		rotateInPlace(arr,k);
		//int[] ans = rotate(arr, k);
		System.out.print("Array after rotation");
		//printArray(ans);
		printArray(arr);


	}

}


