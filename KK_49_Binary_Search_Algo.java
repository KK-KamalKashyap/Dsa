/*
package JavaSkills;

public class KK_49_Binary_Search_Algo {

	static boolean binarySearch(int[] a, int target) {
		int n = a.length;
		int st =0, end=n-1; //0 based indexing
		
		while(st <= end) {
			int mid =(st + end)/2;
			if(target == a[mid]) {
				return true;
			}else if(target < a[mid]) {
				end = mid-1;
			}else {
				st = mid -1;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] a = {1,2,3,4,5};
		int target = 0;
		while (target != 10) {
		System.out.printf("%d exists in arr %b \n", target,binarySearch(a, target));
		target++;
		}
		
		
		
	}

}


*/


/*

package JavaSkills;

public class KK_49_Binary_Search_Algo {
static boolean recbinarySearch(int[] a, int st, int end, int target) {
	if(st > end) return false;  //base case 
	int mid = (st + end)/2;
	if(target == a[mid]) {
		return true;
	}else if (target < a[mid]) {
		return recbinarySearch(a, st, mid-1, target);  // sub problem
	}else {
		return recbinarySearch(a, mid+1, end, target);  // sub problem
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] a = {1,2,3,4,5};
		int target = 0;
		while (target != 10) {
		System.out.printf("%d exists in arr %b \n", target,recbinarySearch(a,0,a.length-1, target));
		target++;
		}
		
		
	}

}

*/


/*

package JavaSkills;

public class KK_49_Binary_Search_Algo {
	
	static int firstOcc(int[] a, int x) {
		int n = a.length;
		int st =0, end = n-1;
		int fo = -1;
		while(st <= end) {
			int mid = st + (end-st)/2;
			if(a[mid] == x) {
				fo = mid;
				end = mid-1;
				
			}else if(x < a[mid]) {
			end = mid -1;	
			}else {
				st = mid+1;
			}
		}
		return fo;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {1, 5, 5, 5, 6, 2, 4};
		int x = 5;
		System.out.println(firstOcc(a,x));
		
		
	}

}
*/




package JavaSkills;

public class KK_49_Binary_Search_Algo {

	static int sqrt(int x) {
		int st =0, end =x;
		int ans = -1;
		
		while(st <= end) {
			int mid = st + (end - st)/2;
			int val = mid * mid; //use long here to avoid overflow
			if(val == x) {
				return mid;
			}else if (val < x) {
				ans = mid;
				st = mid+1;
				
			}else {
				end = mid -1;
				
			}
		}
		return ans;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x  =96;
System.out.println(sqrt(x));
		
		
	}

}












/*
package JavaSkills;

public class KK_49_Binary_Search_Algo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}




package JavaSkills;

public class KK_49_Binary_Search_Algo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}



package JavaSkills;

public class KK_49_Binary_Search_Algo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
*/