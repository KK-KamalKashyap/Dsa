/*
package JavaSkills;

import java.util.Scanner;

public class KK_37_Recursion_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner sc = new Scanner(System.in);
String s = sc.nextLine();
//System.out.println(s);
System.out.println(s.substring(2,4));

//arr = {1,2,3,} ,arr[0]
//char ch = s.charAt(0);


/*
 * arr.length
 * colleg
 * 01234567
 * n = 7
 
//System.out.println(ch);

//for(int i =0; i < s.length(); i++) {
//	System.out.println(s.charAt(i));
//}

	}

}
*/
/*

package JavaSkills;

import java.util.Scanner;

public class KK_37_Recursion_7 {

	
	static String removeA2(String s) {
		if(s.length() == 0) return "";
		String smallAns = removeA2(s.substring(1));
		
	char currChar = s.charAt(0);
		
		//self work
		if(currChar != 'a') {
			return currChar + smallAns; // d + bcx
		}else {
			return smallAns;
		
		}
	
	
	}
	
	
	
	
	
	static String removeA(String s, int idx) {
		//base case
		if(idx == s.length() )return "";
				//recursive work
		String smallAns = removeA(s, idx + 1);
		char currChar = s.charAt(idx);
		
		//self work
		if(currChar != 'a') {
			return currChar + smallAns; // d + bcx
		}else {
			return smallAns;
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Remove Occrances
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
System.out.println(removeA(s, 0));
System.out.println(removeA2(s));
	}

}
*/

/*
package JavaSkills;

import java.util.Scanner;

public class KK_37_Recursion_7 {

	//Reverse
	static String reverse(String s, int idx){
		if(idx == s.length() ) return "";
//		if(s.length() == 0) return "";
		String smallAns = reverse(s,idx+1);

//		String smallAns = reverse(s.substring(1));
		
return smallAns + s.charAt(idx);
	}
	
	
	
	
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Remove Occrances
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
System.out.println(reverse(s, 0));


	}

}
*/
/*
package JavaSkills;

import java.util.Scanner;

public class KK_37_Recursion_7 {

	//Reverse
	static String reverse(String s, int idx){
		if(idx == s.length() ) return "";
//		if(s.length() == 0) return "";
		String smallAns = reverse(s,idx+1);

//		String smallAns = reverse(s.substring(1));
		
return smallAns + s.charAt(idx);
	}
	
	
	
	
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Remove Occrances
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
String rev = reverse(s,0);
if(rev.equals(s)) {
	System.out.printf(" % s is palitrome",s);
}else {
	System.out.printf(" % is Not palidromr",s);
}


	}

}
*/

package JavaSkills;

import java.util.Scanner;

public class KK_37_Recursion_7 {

	//Reverse
static boolean isPalindrome(String s, int l, int r) {
	if(l >= r) return true;
	return (s.charAt(l) == s.charAt(r) && isPalindrome(s, l+1, r-1));
	
}
	
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Remove Occrances
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
System.out.println(isPalindrome(s, 0, s.length() -1));


	}

}
