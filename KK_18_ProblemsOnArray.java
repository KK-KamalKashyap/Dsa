package JavaSkills;

import java.util.Scanner;

public class KK_18_ProblemsOnArray {
/*
	static int pairSum(int[] arr, int target) {
		int n = arr.length;
		int ans =0;
		
		for(int i=0;i<n;i++) { //first number
			for(int j=i+1;j<n;j++) { // second number
				if(arr[i] + arr[j] == target) {
					ans++;
				}
			}
		}
		return ans;
	}
	*/
	/*
	static int tripletSum(int[] arr, int target) {
		int ans =0;
		int n =arr.length;
		for(int i=0;i<n;i++) { //first number
			for(int j=i+1;j<n;j++) { //second number
				for(int k =j+1;k<n;k++) { // third number
					if(arr[i] + arr[j] +arr[k] == target) {
						ans++;
					}
				}
			}
		}
		return ans;
	}
	*/
	/*
	static int findUnique(int[] arr) {
		int n = arr.length;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i] == arr[j]) {
					arr[i] = -1;
					arr[j] = -1;
					
				}
			}
		}
		int ans =-1;
		for(int i=0;i<n;i++) {
			if(arr[i] > 0) {
				ans = arr[i];
			}
		}
		return ans;
	}
	*/
	/*
	static int findMax(int[] arr) {
		int mx = Integer.MIN_VALUE;
		for(int i=0; i<arr.length;i++) {
			if(arr[i] > mx) {
				mx = arr[i];
				
			}
		}
		return mx;
	}
	static int findSecondMax(int[] arr) {
		int mx = findMax(arr);
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == mx) {
				arr[i] = Integer.MIN_VALUE;
				
			}
		}
		int secondMax = findMax(arr);
		return secondMax;
		
	}
	*/
	static int firstRepeatingNumber(int[] arr) {
		int n = arr.length;
		for(int i=0;i<n;i++) { // first number
			for(int j =i+1; j<n;j++) { // second number
				if(arr[i] == arr[j]) { // found answer
					return arr[i];
					
					
				}
				
			}
			
		}
		return -1;
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
		System.out.print("Enter target sum ");// 1 2 3 question
		int target = s.nextInt(); // 1 2 3 question
		//System.out.println(pairSum(arr, target));
	//	System.out.println(tripletSum(arr,target));
		//System.out.println("Unique element : " + findUnique(arr));
	//	System.out.println("Second Maximum Element: " + findSecondMax(arr));
		System.out.println("First Repeating Number: " + firstRepeatingNumber(arr));
		
	}

}
