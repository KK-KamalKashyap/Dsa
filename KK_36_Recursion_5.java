package JavaSkills;

public class KK_36_Recursion_5 {
	
	static void printArray(int[] arr, int idx) {
		//base case
		if(idx == arr.length) {
			return ;
		}
		
		// self work    ///
		System.out.println(arr[idx]);   //5
		
		
		//recursive work - sub problem 
		
		printArray(arr, idx + 1);               //6,7,8,9
		
		
	}
	
	
	static int maxInArray(int [] arr, int idx) {
		// base case 
		if(idx  == arr.length-1) {
			return arr[idx];
			
		}
		
		// small problem -> idx + 1, end of the array -> max -> recyrsive
		int smallAns = maxInArray(arr, idx+1);
		//self work final ans
		return Math.max(arr[idx], smallAns);
		
		
		
		
	}
	
	
	static int sumOfArray(int[] arr, int idx) {
		//base case
		if(idx == arr.length) {
			return 0;
		}
		//recursive work => subproblem 
		int smallAns = sumOfArray(arr, idx + 1);
		// self work
		return smallAns + arr[idx];
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = {5, 6, 7, 8, 9};
		
		
		//printArray(arr,0);
		
//		System.out.println(maxInArray(arr, 0));
		
		System.out.println(sumOfArray(arr, 0));
		
	}

}
