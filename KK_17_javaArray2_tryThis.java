package JavaSkills;

import java.util.Arrays;
import java.util.Scanner;

public class KK_17_javaArray2_tryThis {
	
	static int[] smallestAndLargestElement(int [] arr) { // 1 2 3 4 5
		
		
		Arrays.sort(arr);;
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
		int[] ans = {arr[0], arr[arr.length-1]};
		return ans;
	}
	
	
	static boolean isSorted(int [] arr) {
		boolean check = true;
		
		
		for(int i=1; i<arr.length;i++) {
			/*
			 i=0;
			 arr[0] < arr[-1]
			 
			 */
			if(arr[i] < arr[i-1]) {
				//not sorted
				check = false;
				break;
				
			}
		}
		return check;
		
	}
	
	static int lastOccurrence(int[] arr, int x) {
		int lastIndex =-1;
		for(int i =0;i<arr.length;i++) {
			if(arr[i] ==x) {
				lastIndex =i;
				
			}
		}
		return lastIndex;
	}
static int countOccurrences(int [] arr, int x) {
	int count =0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]== x) {
			count ++;
		}
	}
	return count;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int n = s.nextInt();
		
		int [] arr = new int[n];
		System.out.println("Enter "+ n + " elements: ");
		for(int i=0; i<arr.length;i++) {
			arr[i] = s.nextInt();
			
		}
		
		//System.out.println("Enter x");
		//int x = s.nextInt();
		
//		System.out.println("COUNT OF X:" + countOccurrences(arr, x));
		//System.out.println("LAST OCCURRENCE OF X:" + lastOccurrence(arr, x));
		//System.out.println("Is Sorted " + isSorted(arr));
		//smallestAndLargestElement(arr);
	int [] ans =	smallestAndLargestElement(arr);
	System.out.println("Smallest:" + ans[0]);
	System.out.println("largest:" + ans[1]);
	}

}
