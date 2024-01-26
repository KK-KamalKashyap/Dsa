/*
package JavaSkills;

public class KK_48_Sorting_Algorithm_2 {

	static void display(int[] num) {
		for(int val : num) {
			System.out.print(val + " ");
		}
		System.out.println();
	}
	static void sortArr(int[] num) {
		int n = num.length;
		int x = -1, y =-1;
		if(n <= 1) { //corner case, edage case
			return;
		}
		
		
		
		
		//process all adjacent elements
		for(int i=1;i < n;i++) {
			if(num[i-1] > num[i] ) {
				if(x == -1) { //first con flict
					x= i-1;
					y=i;
				}else {//3nd conflict
					y=i;
				}
			}
		}
		//swap x , y in mum
		int temp = num[x];
		num[x] = num[y];
		num[y] = temp;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num = {10, 5,6,7,8,9,3};
		sortArr(num);
		display(num);
	}

}




*/




/*

package JavaSkills;

public class KK_48_Sorting_Algorithm_2 {

	static void display(int[] num) {
		for(int val : num) {
			System.out.print(val + " ");
		}
		System.out.println();
	}
	
	
	static void partition(int[] num) {
		int l=0, r= num.length-1;
		while(l <r) {
			while(num[l] < 0) l++;
			while(num[r] >= 0) r--;
			
			if(l < r ) {
				int temp = num[l];
				num[l] = num[r];
				num[r] = temp;
				l++;
				r--;
			}
			
			
			
		}
	}
	

	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] num = {-13, 20, 7 ,8,-4, -13, 11, -5, -13};
partition(num);
display(num);
	}

}



*/





package JavaSkills;

public class KK_48_Sorting_Algorithm_2 {

	
	static void display(int[] num) {
		for(int val : num) {
			System.out.print(val + " ");
		}
		System.out.println();
	}
	static void swap (int[] a, int x, int y) {
		int temp = a[x];
		a[x] = a[y];
		a[y] = temp;
	}
	static void sort012(int[] a) {
		int lo =0, mid =0, hi = a.length-1;
		//explorw the unknow region
		while(mid <= hi) {
			if(a[mid] == 0) {
				swap(a, mid, lo);
				mid++;
				lo++;
			}else if (a[mid] == 1) {
				mid++;
			}else {
				swap(a, mid, hi);
				hi--;
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num = {2,2,0,0,1,1,2,0,1,0};
		sort012(num);
		display(num);
		
		
		
		
	}

}


/*
package JavaSkills;

public class KK_48_Sorting_Algorithm_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
package JavaSkills;

public class KK_48_Sorting_Algorithm_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
package JavaSkills;

public class KK_48_Sorting_Algorithm_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
*/
