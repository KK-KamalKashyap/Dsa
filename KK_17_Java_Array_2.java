/*
 ///TAKING ARRAY INPUT IN JAVA 
package JavaSkills;

import java.util.Scanner;

public class KK_17_Java_Array_2 {

	
	static void printArray(int [] arr) {
		for(int i=0;i<arr.length;i++ ) {
			System.out.println(arr[i] + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s = new Scanner(System.in);
System.out.println("Enter size of array");
int n = s.nextInt();
int[] arr = new int[n];
//arr[0]= 5;
//arr[1] = 6;
//arr[2]= 7;
//arr[3] = 8;
//arr[4] = 9;

System.out.println("Enter " + n + "elements");
for(int i=0;i<arr.length;i++) {
	arr[i] = s.nextInt();
	
}

for(int i=0;i<n;i++) {
	System.out.print(arr[i] + " ");
}

	}

}


*/






 ///TAKING ARRAY INPUT IN JAVA 
package JavaSkills;


import java.util.Arrays;
import java.util.Scanner;

public class KK_17_Java_Array_2 {

	
	static void printArray(int [] arr) {
		for(int i=0;i<arr.length;i++ ) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s = new Scanner(System.in);
System.out.println("Enter size of array");
//int n = s.nextInt();
int[] arr = new int[5];
arr[0]= 5;
arr[1] = 6;
arr[2]= 7;
arr[3] = 8;
arr[4] = 9;

//System.out.println("Enter " + n + "elements");
//for(int i=0;i<arr.length;i++) {
//	arr[i] = s.nextInt();
//	
//}
System.out.println("Origanal arr");
printArray(arr);

 //trying to copy arr to arr_2
//int[] arr_2 = arr;


//int [] arr_2 = arr.clone();
//int [] arr_2 = Arrays.copyOf(arr,arr.length);

//int [] arr_2 = Arrays.copyOf(arr,2);
//
//int [] arr_2 = Arrays.copyOfRange(arr,0,arr.length);
int [] arr_2 = Arrays.copyOfRange(arr,1,4);




//for(int i=0;i<n;i++) {
//	System.out.print(arr_2[i] + " ");
//}
System.out.println("Copied arr_2");
printArray(arr_2);

//changing some value of arr_2
/*
arr_2[0] = 0;
arr_2[1] = 0;

System.out.println("Original array after changing arr_2");
printArray(arr);

System.out.println("Copied arr_2 after chaning arr_2");
printArray(arr_2);
*/
	}

}



