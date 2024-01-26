package JavaSkills;

import java.util.Scanner;

public class KK_19_ProblemOnArrays_2 {
	static void printArray(int[] arr) {

		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}


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
	static int[] makeFrequencyArray(int[] arr) {
		int[] freq= new int[100005];
		for(int i=0;i<arr.length;i++) {
			freq[arr[i]]++;
		}
		return freq;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.print("Enter array size ");
		int n =s.nextInt();
		int [] arr = new int[n];

		System.out.print("Enter "+ n + " elements");
		for(int i=0;i<n;i++) {
			arr[i] =s.nextInt();

		}
		int[] freq=makeFrequencyArray(arr);

		System.out.print("Enter number of queries ");
		int q=s.nextInt();

		while(q>0) {
			System.out.println("Enter number to be searched");
			int x=s.nextInt();
			if(freq[x]>0) {
				System.out.print("YES");
			}else {
				System.out.print("NO");
			}
			q--;
		}
		

	}

}
