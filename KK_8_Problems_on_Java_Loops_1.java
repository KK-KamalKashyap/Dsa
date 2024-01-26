package JavaSkills;

import java.util.Scanner;

public class KK_8_Problems_on_Java_Loops_1 {
public static void main(String[] args) {
	//COUNT THE NUMBER OF DIGITS FOR A GIVEN NUMBER N
	Scanner s = new Scanner(System.in);
	//int n =s.nextInt();
//	int numOfDigit =0;
//	int original_n =n;
//	while(n>0) {
//		n=n/10;
//		numOfDigit++;
//	}
//	System.out.println("Number of digits in " +original_n +" = "  + numOfDigit);
	//FIND THE SUM OF DIGITS IN A GIVEN NUBER N.
//	int sumOfDigit =0;
//	int original_n =n;
//	while(n>0) {
//		sumOfDigit += n%10;
//		n=n/10;
//	
//	}
//	System.out.println("Sum of digits in " +original_n +" = "  + sumOfDigit);
	//REVERSE THE DIGITS OF A NUMBE$R
//	int ans=0;
//	while(n>0) {
//		ans = ans*10 +n%10;
//		n /= 10;
//		
//	}
//	System.out.println(ans);
	
	//FIND THE SUM OF THE FOLLOWING SERIES.
	
//	int ans =0;
//	for(int i=1;i<=n; i++) {
//	
//		if(i%2==0) {
//			ans -= i;
//			
//		}else {
//			ans += i;
//		}
//	}
//	System.out.println(ans);
	//PRINT THE FIRST N FACTORIAL NUMBER.
//	int fact =1;
//	for(int i=1;i<= n;i++) {
//		fact = fact*i;
//		System.out.println("Factorical of " +i+ ": " + fact);
//	}
	//GIVEN 2 NUMBERS A AND B FIND A RAISE TO THE POWER B.
	int a = s.nextInt();
	
int 	b =s.nextInt();
int ans =1;
	for(int i=1;i<= b;i++) {
		ans*= a;
	}
	System.out.println(ans);
}
}
