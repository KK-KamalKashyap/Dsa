
/*
package JavaSkills;

public class KK_50_Rottated_Sorted {

	static int findMinmum(int[] a) {
		int n = a.length;
		int st = 0, end = a.length-1;
		int ans = -1;
		while(st <= end) {
			int mid = st + (end - st)/2;
			if(a[mid] <= a[n-1]) {
				ans =  mid;
				end = mid - 1;
				
			}else {
				st = mid + 1;
			}
		}
		return ans;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] a = {3,4,5,1,2};
 		
		System.out.println(findMinmum(a));
		
		
		
	}

}
*/

/*
package JavaSkills;

public class KK_50_Rottated_Sorted {

	static int search(int[] a, int target) {
		int st =0, end = a.length-1;
//		int and =  -1;
		
		while(st <= end) {
			int mid = st + (end - st)/2;
			if(a[mid] == target) {
				return mid;
				
			}
			else if (a[mid] < a[end]) { //mid to end is sorted
				
				if(target > a[mid] && target <= a[end]) {
					st = mid + 1;
					
				}else {
					end = mid-1;
				}
				
				
			}else {//st to mid is sorted
				if(target >= a[st] && target < a[mid]) {
					end = mid -1;
				}else {
					st = mid + 1;
					 
				}
			}
		}
		
		return -1;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] a = {3,4,5,1,2};
		int target = 4;
		System.out.println(search(a,target));
		
		
		
	}

}

*/
//duplicate elements
package JavaSkills;

public class KK_50_Rottated_Sorted {

public static boolean search_(int[] a, int target) {
		int st =0, end = a.length-1;
//		int and =  -1;
		
		while(st <= end) {
			int mid = st + (end - st)/2;
			if(a[mid] == target) {
				return true;
				
			}
			else if(a[st] == a[mid] && a[end] == mid) {
				st ++;
				end--;
				
			}
			else if (a[mid] <= a[end]) { //mid to end is sorted
				
				if(target > a[mid] && target <= a[end]) {
					st = mid + 1;
					
				}else {
					end = mid-1;
				}
				
				
			}else {//st to mid is sorted
				if(target >= a[st] && target < a[mid]) {
					end = mid -1;
				}else {
					st = mid + 1;
					 
				}
			}
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] a = {1,1,1,1,2,2,3,1};
		int target = 1;
		System.out.println(search_(a,target));
		
		 
		
		
		
	}

}





/*
package JavaSkills;

public class KK_50_Rottated_Sorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		
		
	}

}
*/
