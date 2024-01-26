/*

package JavaSkills;

public class KK_37_Recursion_6 {



	static boolean search(int[] a, int n, int target, int idx) {
		//base case
		if(idx >= n) {
			return false;
		}
		//self case
		if(a[idx] == target) return true;
		
		
		
		//recursive
		return search(a, n, target, idx + 1);
//		if(search(a, n, target, idx + 1)) {
//			return true;
//		}else {
//			return false;
//		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] a = {1,2,3,4,6};
int target = 44;


if(search(a, a.length, target, 0)) {
	System.out.println("yes");
}
else {
	System.out.println("No");
}
	}

}
*/

/*
package JavaSkills;

public class KK_37_Recursion_6 {

//find firstIndex return index of target if target present in array ,otherwise return -1 

	static int findIndex(int[] a, int n, int target, int idx) {
		//base case
		if(idx >= n) {
			return -1;
		}
		//self case
		if(a[idx] == target) return idx;
		
		
		
		//recursive
		return findIndex(a, n, target, idx + 1);

	}
//	true , false =base on extinces

	static boolean search(int[] a, int n, int target, int idx) {
		//base case
		if(idx >= n) {
			return false;
		}
		//self case
		if(a[idx] == target) return true;
		
		
		
		//recursive
		return search(a, n, target, idx + 1);

	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int [] a = {1,2,3,4,6};
		int [] a = {1,2,4,4,4,5,6};
//int target = 44;
		int target = 4;
int n = a.length;

System.out.println(findIndex(a,n, target,0));
//if(search(a, a.length, target, 0)) {
//	System.out.println("yes");
//}
//else {
//	System.out.println("No");
//}
	}

}
*/
/*
package JavaSkills;

public class KK_37_Recursion_6 {

//find firstIndex return index of target if target present in array ,otherwise return -1 
	
	
	static  void findAllIndices(int[] a,int n, int target, int idx) {
		//base case
		if(idx > n) {
			return;
		}
		//self work
		if(a[idx] == target) {
			System.out.println(idx);
		}
		//recursive work
	findAllIndices(a, n, target, idx +1); //1 3 4
	}
	
	
	
	

	static int findIndex(int[] a, int n, int target, int idx) {
		//base case
		if(idx >= n) {
			return -1;
		}
		//self case
		if(a[idx] == target) return idx;
		
		
		
		//recursive
		return findIndex(a, n, target, idx + 1);

	}
//	true , false =base on extinces

	static boolean search(int[] a, int n, int target, int idx) {
		//base case
		if(idx >= n) {
			return false;
		}
		//self case
		if(a[idx] == target) return true;
		
		
		
		//recursive
		return search(a, n, target, idx + 1);

	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int [] a = {1,2,3,4,6};
		int [] a = {1,2,4,4,4,5,6};
//int target = 44;
		int target = 4;
int n = a.length;

findAllIndices(a, n, target ,0);
//if(search(a, a.length, target, 0)) {
//	System.out.println("yes");
//}
//else {
//	System.out.println("No");
//}
	}

}
*/


package JavaSkills;

import java.util.ArrayList;

public class KK_37_Recursion_6 {


	
	
	static ArrayList<Integer> allIndices(int[] a,int n, int target, int idx) {
	
		//base case
		if(idx > n) {
			return new ArrayList<Integer>(); //return empty arraylist
		
		}
		ArrayList<Integer> ans = new ArrayList<>();
		//self work
	if(a[idx] == target){
		ans.add(idx); //0
		
	}
		//recursive work
ArrayList<Integer> smallAns = allIndices(a, n, target, idx +1); //1 3 

ans.addAll(smallAns);

return ans;


	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int [] a = {1,2,3,4,6};
		int [] a = {1,2,4,4,4,5,6};
//int target = 44;
		int target = 4;
int n = a.length;

ArrayList<Integer> ans = allIndices(a, n, target ,0);
for(Integer i : ans) {
	System.out.println(i);
}
//if(search(a, a.length, target, 0)) {
//	System.out.println("yes");
//}
//else {
//	System.out.println("No");
//}
	}

}