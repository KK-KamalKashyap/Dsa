/*
package JavaSkills;
import java.util.*;
public class KK_53_StringsInShot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		
		
//		char [] arr = new char[10];
//		String str = "College School";
//		int x = 5;
//		System.out.println(str);
		
//		String n = s.nextLine();
//		System.out.println(n);
		
//		String str = "Hello";
//		int len = str.length();
//		System.out.println(len);

		
		
//		String str = "Kamal";
//		char ch = str.charAt(3);
//		System.out.println(ch);
		
		
//		String str = "Kamal";
//		System.out.println(str.indexOf('a'));
		
//		String str = "Kamal";
//		String gtr = "Kashyap";
//		System.out.println(str.compareTo(gtr));  //negTIVE
		
//	String str = "Kamal kASHYAP";
////		System.out.println(str.contains("YA"));  //true ans false
//		System.out.println(str.startsWith("ama"));  //true ans false
		String str = "Kamal kASHYAP";
		String gtr = "Kashyap";
//		System.out.println(str.toLowerCase());
//		System.out.println(str.toUpperCase());
		System.out.println(str.concat(gtr));
		
		
		
		
	}

}



*/


/*
package JavaSkills;
import java.util.*;
public class KK_53_StringsInShot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		String str = "abc";
//		str = str + "xyz";
//		str += 'r';
//		str += 10;
		System.out.println(str);
		System.out.println("abc"+10+10); //abc1010 
	}

}


*/

/*
package JavaSkills;
import java.util.*;
public class KK_53_StringsInShot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "abcde";
		System.out.println(str.substring(2,5));
		System.out.println(str.substring(0));
		
	}

}
*//* JavaSkills;
import java.util.*;
public class KK_53_StringsInShot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str = "abcd";  //0 to 3
for(int i =0; i <=3; i++) {
	for(int j =i+1;j<=4;j++) {
		System.out.print(str.substring(i,j) + " ");
	}
}

		
		
		
	}

}

*/

/*
package JavaSkills;
import java.util.*;
public class KK_53_StringsInShot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	String s = "Hello";
//	String x= "Hello";
//	x="Mello"; //s ?
//	System.out.println(s);
//	s = "Dello";
	// 2 -> 'y';
	
	s = s.substring(0,2) + 'y' + s.substring(3);
	System.out.println(s);
	
		
		
		
		
	}

}
*//*
package JavaSkills;
import java.util.*;
public class KK_53_StringsInShot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str = "";
for(int i = 1; i <=10; i++) {
	str = str + i;
	
}
//""  "1" "12" 

System.out.println(str);
	}

}

*/
/*
package JavaSkills;
import java.util.*;
public class KK_53_StringsInShot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1 = "hello";
String s2 = "hello";
String s3 = new String ("hello");
System.out.println(s1==s3);
System.out.println(s1.equals(s3));
	}

}
*/
/*
package JavaSkills;
import java.util.*;
public class KK_53_StringsInShot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		StringBuilder str = new StringBuilder("hello");
//		str.append("world");
				System.out.println(str); //hello
		
		str.setCharAt(0, 'm'); //set chaer
		System.out.println(str); //mello
		
		str.append(" true");
		System.out.println(str); //mello true
		
		str.insert(2, 'y');
		System.out.println(str); //meyllo
		
	str.deleteCharAt(0);
	System.out.println(str);  //eyllo true
		
		*//*
		StringBuilder str = new StringBuilder("Kamal");
		str.reverse();
		System.out.println(str);
		
		str.delete(2, 4);   //2 to 3 deletr
		System.out.println(str);
		
		
		
	}

}


*//*

package JavaSkills;
import java.util.*;
public class KK_53_StringsInShot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner s = new Scanner(System.in);
		StringBuilder str = new StringBuilder(s.nextLine());
		System.out.println(str);
		
		//Toggle
		for(int i=0; i<str.length();i++) {
			//P p
			//check = alphebet -small,cappital
			
			boolean flag = true;
			char ch = str.charAt(i);//A
			if(ch == ' ' )continue;
			
			
			int asci = (int)ch;//65
			if(asci >= 90) flag = false;  //small
			if(flag == true) { //capita;
				asci +=32;
				char dh = (char)asci;
				str.setCharAt(i, dh);
				
			}
			else {
				asci -= 32;
				char dh = (char)asci;
				str.setCharAt(i, dh);
			}
		}
		
		System.out.println(str);
		
	}

}

*/
/*
package JavaSkills;
import java.util.*;
public class KK_53_StringsInShot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "KaMal";
		for(int i =0; i < str.length();i++) {
			boolean flag = true;
			char ch = str.charAt(i);//A
			if(ch == ' ' )continue;
			
			
			int asci = (int)ch;//65
			if(asci >= 90) flag = false;  //small
			if(flag == true) { //capita;
				asci +=32;
				char dh = (char)asci;
				str = str.substring(0,i) + dh + str.substring(i+1);
				
				
				
			}
			else {
				asci -= 32;
				char dh = (char)asci;
				str = str.substring(0,i) + dh + str.substring(i+1);
			}
			
			
			
		}
		
		
		
		System.out.println(str);
		
		
		
		
	}

}
*///palindrome
/*
package JavaSkills;
import java.util.*;
public class KK_53_StringsInShot {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "abcdcba";
//		StringBuilder gtr = new StringBuilder(str);
//		gtr.reverse();
//		String s = gtr + "";
//		if(str.equals(s)) {
//			System.out.println("Palidrome");
//		}else {
//			System.out.println("not Palidrome");
//		}
//		
		int i = 0;
		int j = str.length() - 1;
		boolean flag = true;
		while (i <j) {
			if(str.charAt(i)!= str.charAt(j)) {
//				System.out.println("Not paluidrome");
				flag = false;
				break;
			}
			i++;
			j--;
		} 
		if(flag == true) System.out.println("palidrome");
		else System.out.println("not palidrome");
		
		
		
		
		
		
		
	}

}


*/
/*
package JavaSkills;
import java.util.*;
public class KK_53_StringsInShot {
public static boolean isPalindrome(String s) {
	int i = 0;
	int j = s.length() - 1;
	while( i < j) {
		if(s.charAt(i)!= s.charAt(j)) return false;
		i++;
		j--;
	}
	return true;
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abbd";
		int count = 0;
		for(int i =0; i <str.length(); i++) {
			for(int j =i+1;j<=str.length();j++) {
			if(isPalindrome(str.substring(i,j)) == true) {
				System.out.print(str.substring(i,j) + " ");
				count++;
			
			}
				
				
				
				
			}
		}

			
		System.out.println(count);
		
		
		
		
	}

}
*//*
package JavaSkills;
import java.util.*;
public class KK_53_StringsInShot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "I am an online educator";
		String ans = "";
		StringBuilder sb = new StringBuilder("");
		for(int i =0; i < str.length();i++) {
			char ch = str.charAt(i);
			if(ch != ' ') {
				sb.append(ch);
			}else {
				sb.reverse();
				ans += sb;
				ans += " ";
				sb = new StringBuilder("");
				
			}
		}
//		sb.append(" ");
		sb.reverse();
		ans += sb;
		System.out.println(ans);
		
	}

}

*/

package JavaSkills;
import java.util.*;
public class KK_53_StringsInShot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "aaabbbbccdddee";
		String ans = "" + str.charAt(0);
		int count = 1;
		for (int i =1; i < str.length();i++) {
			char curr = str.charAt(i);
			char prev = str.charAt(i-1);
			
			if(curr == prev) {
				count++;
			}
			else {
			if(count>1) ans += count;;
			
				count =1;
				ans += curr;
				
			}
			
			
		}
	if(count>1) ans += count;
		System.out.println(ans);
	
		
	}

}





/*
package JavaSkills;
import java.util.*;
public class KK_53_StringsInShot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
*/