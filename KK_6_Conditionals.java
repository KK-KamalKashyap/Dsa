package JavaSkills;

import java.util.Scanner;

public class KK_6_Conditionals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/////////	////	////////////////////////////////////////////////////////////////////////////////////////////////
//TRY THIS
		//PRINT "ODD" IF THE INPUT VALUE IS ODD < OTHERWISE PRINT "EVEN" >
		//NOTE  INPUT VALUE IS BETWEEN 1 AND 1O^6
		
		Scanner s = new Scanner(System.in);
		int num =s.nextInt();
//		if(num%2==0) {
//			System.out.println("Even");
//		}else {
//			System.out.println("ODD");
//			
//			
//		}
	    	String ans;
		 ans =(num%2== 0) ? "EVEN": "ODD";   //ternary operator
		 System.out.println(ans);
////////////////////////////////////////////////////////////////////////////////////////
		//TRY THIS
		//DIVIDE PEOPLE INTO # AGE GROUP
		//AGE = BELOW 12  || BETWEEN 12 AND 18 || ABOVE 18
		//OUTPUT = CHILD || TEENAGER || ADULT
		
		
		if(num<=12) {
			System.out.println("CHILD");
			
		}else if(num > 12 && num <18) {
			System.out.println("TEENAGER");
		}else {
			System.out.println("ADULT");

				
		}
/////////////////////////////////////////////////////////////////////////////////////////////
		//WRITE A PROGRAM TO PRINT THE VALUE IF IT IS EVEN AND DIVISIBLE BY #.
		if(num%2 == 0 && num% 3 ==0) {
			System.out.println("The answer: " + num);
		}
////////////////////////////////////////////////////////////////////////////////////////////////
		//write a program to print the value if it is divisible by 3 or 5
		if(num%3 == 0 || num%5 == 0) {
			System.out.println("THE ANSWER IS  " + num);
		}
///////////////////////////////////////////////////////////////////////////////////////////////////
		//DAY NUMBER = 1 2 3 4 5 6 7 
		//OUTPUT =mon||TUE||WED||THUR||FRI||SAT
		
		switch(num) {
		case 1: 
			System.out.println("MON");
			break;
		case 2:
			System.out.println("TUE");
			break;
		case 3:
			System.out.println("WED");
			break;
		case 4:
			System.out.println("THUR");
			break;
		case 5:
			System.out.println("FRi");
			break;
		case 6:
			System.out.println("SAT");
			break;
		case 7:
			System.out.println("SUN");
			break;
			default:
				System.out.println("INVALID DAY");
				
			
		
		}
		
	}

}
