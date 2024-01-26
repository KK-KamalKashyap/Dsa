/*

package JavaSkills;

import java.util.Scanner;

public class KK_34_recurssion_3 {

	static void printMultiples(int n, int k) { // 5,4
		//base case
		if(k ==1) {
			System.out.println(n);
			return ;
			
		}
		//recursive work
		printMultiples(n, k-1);   // 5, 10, 15
		
		
		//self work
		System.out.println(n *k);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		printMultiples(n,k);
	}

}

*/

//series sum
package JavaSkills;

import java.util.Scanner;

public class KK_34_recurssion_3 {

	//main question  - alternate sums
	static int seriesSum(int n) {
		if(n == 0) return 0;
		
		if ( n %2 == 0) {  // even
		return seriesSum(n-1) -n;
		}
		else {  // odd
			//recursive work
			return seriesSum(n-1) + n;
		}
		
	}
	
	static int seriesSum1(int n) { 
		//base case
		if(n ==0) {
			
			return 0;
			
		}
		//recursive work
		return seriesSum1(n-1) + n;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(seriesSum(n));

}

	
}
