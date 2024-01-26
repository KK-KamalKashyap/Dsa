/*
//Conditionals
//Even or odd
package JavaSkills;

import java.util.Scanner;

public class KK_27_Revision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number :");
int n = sc.nextInt();
if(n%2==0) {
	System.out.println("The number you entered is even");
}
if(n%2!=0) {
	// n odd hai
	System.out.println("The number you entered is odd");
}


	}

}

*/

/*
package JavaSkills;

import java.util.Scanner;

public class KK_27_Revision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Entera Number :");
		int n =sc.nextInt();
		
		if(n%5==0)
		{
			System.out.println("The number you entred is dividible by 5");
			
		}
		else {
			System.out.println("Not is dividible by 5");
		}
	}
}

*/
/*
//
package JavaSkills;

import java.util.Scanner;

public class KK_27_Revision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any integer :");
		int n = sc.nextInt();
		if(n<0) {
			//if n is less than zero
			n = n * (-1);
			
		}
		System.out.println("The absolute value is : " +n);
		
		
		
	}
}
*/
/*
//profit Loss
package JavaSkills;

import java.util.Scanner;

public class KK_27_Revision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter cost price : ");
		int cp = sc.nextInt();
		System.out.println("enter selling Price : ");
		int sp = sc.nextInt();
		if(sp>cp) { //profit
			System.out.print("You profit is : ");
			System.out.println(sp-cp);
		}
		else {
			//losss
			System.out.print("You  loss is : ");
			System.out.println(cp - sp);
		}
	}
}
*/
/*
//Area Premeter greater
package JavaSkills;

import java.util.Scanner;

public class KK_27_Revision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length : ");
		int length = sc.nextInt();
		System.out.println("Enter breath : ");
		int breath = sc.nextInt();
		int area = length*breath;
		int perimeter = 2*(length + breath);
		if(area>perimeter) {
			System.out.println("Area is greater than permeter");
		}
		else	if(perimeter>area)  {
			System.out.println("permete is greater than area");
		}
//		if(perimeter==area) 
		else {
			System.out.println("Area and Perimeter are equal");
		}
	}
}
*/
/*
package JavaSkills;

import java.util.Scanner;

public class KK_27_Revision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter percentage : ");
		int n = sc.nextInt(); //n -> percentage
		if(n>90) {
		System.out.println("Excellent");
		}
		else if(n>80) {
			System.out.println("Very Good");
		}
		else if(n>70) {
			System.out.println("Good");
		}
		else if(n>60) {
			System.out.println("Can do Better");
		}
		else if(n>50) {
			System.out.println("Average");
		}
		else if(n>40) {
			System.out.println("Below Average");
		}
		else {
			System.out.println("Fail");
		}
	}
}
*/
/*
//three Digit Number
package JavaSkills;

import java.util.Scanner;

public class KK_27_Revision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt(); 
		if(n>99 && n<1000) {
			System.out.println("This is a 3 digit number");
		}
		else {
			System.out.println("It is not a 3 didgit number");
		}
		
		
		
	}
}
*/


/*
//two Digit Number
package JavaSkills;

import java.util.Scanner;

public class KK_27_Revision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt(); 
		if(n>9 && n<100) {
			System.out.println("This is a 2 digit number");
		}
		else {
			System.out.println("It is not a 4 didgit number");
		}
		
		
		
	}
}
*/

/*
package JavaSkills;

import java.util.Scanner;

public class KK_27_Revision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt(); 
		if(n%5==0 && n%3==0) {
			System.out.println("The number is divisible by 3 and 5");
		}
		else {
			System.out.println("Not divisible by 3 and 5");
		}
		
	}
}
*/
/*
package JavaSkills;

import java.util.Scanner;

public class KK_27_Revision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt(); 
		if(n%5==0 && n%3!=0) {
			System.out.println("The number is divisible by not 3 and 5");
		}
		else {
			System.out.println("Not divisible by 3 and 5");
		}
		
	}
}
*/
/*
package JavaSkills;

import java.util.Scanner;

public class KK_27_Revision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt(); 
		if(n%5==0 || n%3==0) {
			System.out.println("The number is divisible by either  not 3 or 5");
		}
		else {
			System.out.println("Not divisible by either 3 or 5");
		}
		
	}
}

*/
/*
//largest of three nujmbers
package JavaSkills;

import java.util.Scanner;

public class KK_27_Revision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt(); 
		int b = sc.nextInt(); 
		int c = sc.nextInt(); 
		if(a>b && a<c) {
			System.out.println(a + " is largest");
		}
		if(b>a && b>c) {
			System.out.println(b + " is largest");
		}
		
		if(c> a&& c>b) {
			System.out.println(c + " is largest");
		}
		
	}
	
	
}
*/
/*
//size of a triangle

package JavaSkills;

import java.util.Scanner;

public class KK_27_Revision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt(); 
		int b = sc.nextInt(); 
		int c = sc.nextInt(); 
		
		if(a+b > c  && b+c>a  && a+c>b)
		{
			System.out.println("Valid Triasngle");
		}
		
		else {
			System.out.println("invalid triangle");
		}
		
		
		
		
	}
}


*/
/*
//Nested threee and five

package JavaSkills;

import java.util.Scanner;

public class KK_27_Revision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt(); 
		if(n%5==0) {
			if (n%3==0) {
				System.out.println("The number is divisible by 3 and 5 both");
			}
			
			else {
				System.out.println("Not divisible");
			}
		}
		
		else {
			System.out.println("not divisible");
		}
		
	}
}

 */
/*

// 💋nested  3 amd 5 but not didvisible 15

package JavaSkills;

import java.util.Scanner;

public class KK_27_Revision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt(); 
//		if(n%5==0 || n%3==0) {
//			if(n%15!=0) {
//				System.out.println("The number is divisible by 3 or 5 but not 15");
//			}
//			else {
//				System.out.println("Not matching the required condition");
//			}
//		}
//		else {
//			System.out.println("Not matching the required condition");
//		}
		
		if(  n%15!=0 &&( n%5==0 || n%3==0 )) {
			System.out.println("the number is divisible by 3 and 5 but not 15");
		}
		else {
			System.out.println("Not matching the required condition");
		}
		
	}
}

*/
/*
//nested largest of threee
package JavaSkills;

import java.util.Scanner;

public class KK_27_Revision {
// a= 3 , b=2 , c =1
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt(); 
		int b = sc.nextInt(); 
		int c = sc.nextInt();
		
		if(a>b) {
			if(a>c) {
				System.out.println(a+"is largest");
			}
			else {//a<c -> b<a<c
				System.out.println(c+"is largest");
			}
		}
		else { //a<b 
			if(b>c) {
				System.out.println(b+"is largest");
			}
			else { // b < c -> a<b<c
				System.out.println(c+"is largest");
			}
		}
		
	}
	
}
*/
/*
// three poinst onle line

package JavaSkills;

import java.util.Scanner;

public class KK_27_Revision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double x1 =1 , x2=2, x3=3 , y1=1, y2=2, y3=3;
		double m1= (y2-y1)/(x2-x1);
		double m2= (y3-y2)/(x3-x2);
		
		
		if(m1==m2) {
		System.out.println("The three points lie on a single line");
		}
		else {
			System.out.println("They do not lie on a single lilne");
		}
	}
}
*/
/*
//preddit the output
package JavaSkills;

import java.util.Scanner;

public class KK_27_Revision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc = new Scanner(System.in);
		int x =10, y =20;
		if(x==y);
		System.out.println(x+" "+y);
	}
}
*/
/*
//preddit the output
package JavaSkills;


public class KK_27_Revision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc = new Scanner(System.in);
		int a =300, b,c;
		if( a>= 400)
			b =300;
		c=200;
		
		System.out.println(b+" "+c); // error : uninitialized variable 
	}
}
*/

/*
//preddit the output
package JavaSkills;

import java.util.Scanner;

public class KK_27_Revision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc = new Scanner(System.in);
		int x =3, y =5;
		if(x==3)
		System.out.println(x);
	
	else;
	System.out.println(y);
}
}

*/

/*
package JavaSkills;

import java.util.Scanner;

public class KK_27_Revision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc = new Scanner(System.in);
		int x =3;
		double y = 3.0;
		
		if(x==y)
		System.out.println("x and y are equal");
	
	else;
	System.out.println("x and y are not eqyal");
	
	
	}
}

*/
/*
package JavaSkills;

import java.util.Scanner;

public class KK_27_Revision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc = new Scanner(System.in);
		int x =3,y,z;
		 y = x=10;
 		int z=x<10;  ///errror
		
		if(x==y)
		System.out.println("x and y are equal");
	
	else;
	System.out.println("x and y are not eqyal");
	
	
	}
}
*/

package JavaSkills;



public class KK_27_Revision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc = new Scanner(System.in);
		int i =65;
		char j = 'A';
		
		if(i==j)
		System.out.println("C is WOW");
	
	else
	System.out.println("C is  HEADACHE");
	
	
	}
}

