/*
package JavaSkills;

import java.util.Scanner;

public class AS_6_Conditionals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Q1. WRITE A PROGRAM WHICH TAKES THE VALUES OF LENGTH AND BREATH USER AND CHECK IF IT IS A SQUARE OR NOT
		//
Scanner s = new Scanner(System.in);
int length = s.nextInt();
int breath = s.nextInt();
if(length == breath) {
	System.out.println("It is a square");
}else {
	System.out.println("it is not a square");
}

	}

}
 */
/*
package JavaSkills;

import java.util.Scanner;

public class AS_6_Conditionals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
int value =s.nextInt();
System.out.println(Math.abs(value));
	}

}
 */
/*
package JavaSkills;

import java.util.Scanner;

public class AS_6_Conditionals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		double cp = s.nextDouble();
		double sp = s.nextDouble();
        double profit = sp - cp;
        double loss = cp -sp ;
        if(profit < 0) {
        	System.out.println("Profit " +Math.abs(profit));
        }else if(loss > 0) {
        	System.out.println("Loss " + Math.abs(loss));
        }else {
        	System.out.println("go to and chek nuber");
        }
	

	}
}
*/

/*

package JavaSkills;

import java.util.Scanner;

public class AS_6_Conditionals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
	System.out.println("Enter an integer");
	int number = s.nextInt();
	if(number > 0) {
		System.out.println("its Positive " + number);
	}else if(number < 0) {
		System.out.println("The number is negative and skipped");
	}

	}
}
*/
/*
package JavaSkills;

import java.util.Scanner;

public class AS_6_Conditionals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
System.out.println("Enter an operator(+,-,*,/");
char op = s.next().charAt(0);
int a = s.nextInt();
int b = s.nextInt();

switch(op) {
case '+':
	System.out.println(a + b);
	break;
case '*':
	System.out.println(a*b);
	break;
case '-':
	System.out.println(a-b);
	break;
case '/':
	System.out.println(a/b);
	break;
default :
	System.out.println("Invalid");

}

	}
}
*/


package JavaSkills;

import java.util.Scanner;

public class AS_6_Conditionals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
	
System.out.println("Enter Your Marks:" );
int grade = s.nextInt();
 if(grade >= 90 ) {
	 System.out.println("A+");
 }else  if (grade >= 80){
	 System.out.println("A");
 }else if ( grade >= 70) {
	System.out.println("B+"); 
 }else if(grade >= 60) {
	 System.out.println("B");
 }else if(grade >= 50) {
	 System.out.println("C");
 }else if(grade >= 40) {
	 System.out.println("D");
 }else if (grade >= 30) {
	 System.out.println("E");
 }else {
	 System.out.println("F");
 }

	}
}