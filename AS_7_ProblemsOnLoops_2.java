/*
package JavaSkills;

import java.util.Scanner;

public class AS_7_ProblemsOnLoops_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a = 1, b=1;
		for(int i = 1;  i <=n; i++) {
			System.out.print(a+ " ");
			int temp = a +b;
			a = b;
			b = temp;
			
			
		}
		
	}

}

*/


//p rime number 
/*/
package JavaSkills;

import java.util.Scanner;

public class AS_7_ProblemsOnLoops_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner s = new Scanner (System.in);
		int sum =0;
	int num = s.nextInt();
	while(true) {
		if( num >= 0) {
			sum += num;
		}else {
			sum = -1;
			break;
		}
	}
	System.out.println(sum);
	}

}

*/


/*
package JavaSkills;

import java.util.Scanner;

public class AS_7_ProblemsOnLoops_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner (System.in);
		int n = s.nextInt();
		int ans =1;
		for(int  i =2; i <= n;i++) {
			ans *= i;
		}
		
		System.out.println(ans);
	}

}

*/
/*
package JavaSkills;

import java.util.Scanner;

public class AS_7_ProblemsOnLoops_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.println("Enter  N : ");
		int n = s.nextInt();
		System.out.println("Enter Symbol : ");
		char c = s.next().charAt(0);
		int k=n*2-1;
		for(int i =1; i <= k;i++) {
			for(int j =1; j <= k;j++) {
				if(j == i || j == k-i+1)
					System.out.print(c);
				System.out.print(" ");
			}
			System.out.println();
		}
	
	}

}
*/





package JavaSkills;

import java.util.Scanner;

public class AS_7_ProblemsOnLoops_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner (System.in);
		int n = s.nextInt();
	int	fact = 1;
		for(int i=1; i <= n; i++) {
			fact *= i;
			
		}
		System.out.println(fact);
		
		
		
	}

}




/*
package JavaSkills;

public class AS_7_ProblemsOnLoops_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}






package JavaSkills;

public class AS_7_ProblemsOnLoops_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}







package JavaSkills;

public class AS_7_ProblemsOnLoops_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}







package JavaSkills;

public class AS_7_ProblemsOnLoops_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}





package JavaSkills;

public class AS_7_ProblemsOnLoops_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
*/