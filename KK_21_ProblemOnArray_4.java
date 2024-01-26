/*package JavaSkills;

import java.util.Scanner;

public class KK_21_ProblemOnArray_4 {

	//Prefux Sum
//	static void printArray(int[] arr) {
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(arr[i]+" ");
//		}
//		System.out.println();
//	}
	//static int[] makePrefixSumArray(int [] arr)
	{
//		int n = arr.length;
//		int[] pref = new int[n];
//		pref[0] = arr[0];
//		
//		
//		for(int i=1;i<n;i++) {
//			pref[i] = pref[i-1] + arr[i];
//		}
//		return pref;
//	}//////////
	
//		int n = arr.length;
//		
//		
//		for(int i=1;i<n;i++) {
//			arr[i] = arr[i-1] + arr[i];
//		}
//		return arr;
//	}///////////////////////////
	
	
		//RANGE QUERY5
		
		
		for(int i=1;i<arr.length;i++) {
			arr[i]+=arr[i-1];
		}
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter array size ");
		int n =s.nextInt();
	//	int [] arr = new int[n];
		int [] arr = new int[n+1];

		System.out.println("Enter "+ n + " elements");
//		for(int i=0;i<n;i++) 
		for(int i=1;i<=n;i++){ range querie
			arr[i] =s.nextInt();

		}

		

//		System.out.println("Input Array:");
//		printArray(arr);
//		
		///range queries
		int[] prefSum = makePrefixSumArray(arr);
		//printArray(pref);
		System.out.println("Enter number of queries ");
		int q=s.nextInt();
		while(q-- > 0) {
			System.out.println("Enter range");
			int l =s.nextInt();
			int r=s.nextInt();
			
			int ans = prefSum[r] -prefSum[l-1];
			
			System.out.println("sum " +ans);
			
		//}
	}

}
*/


package JavaSkills;

import java.util.Scanner;

public class KK_21_ProblemOnArray_4 {
static int findArraySum(int [] arr) {
	int totalSum=0;
	for(int i=0;i<arr.length;i++) {
		totalSum+= arr[i];
		
	}
	return totalSum;
}
static boolean equalSumPartition(int[] arr) {
int totalSum =findArraySum(arr);
int prefSum=0;
for(int i=0;i<arr.length;i++) {
	prefSum+= arr[i];
	int suffixSum = totalSum - prefSum;
	if(suffixSum == prefSum) {
		return true;
		
	}
	
}
return false;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter array size ");
		int n =s.nextInt();
	//	int [] arr = new int[n];
		int [] arr = new int[n+1];

		System.out.println("Enter "+ n + " elements");
//		for(int i=0;i<n;i++)
		for(int i=1;i<=n;i++){
			arr[i] =s.nextInt();

		}

		System.out.println("Equal Partition possible: " +equalSumPartition(arr));



	}

}
