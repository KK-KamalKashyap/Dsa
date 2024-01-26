/*
package JavaSkills;
//balanced bracket
import java.util.Scanner;
import java.util.Stack;

public class KK_59_InterviewStacks {
public static boolean isBalanced(String str) {
	Stack<Character> st = new Stack<>();
	int n = str.length();
	for(int i =0; i < n;i++) {
		char ch = str.charAt(i);
		if(ch =='(') {
			st.push(ch);
			
		}else {// ch ==')'
			if(st.size() == 0) return false;
			if(st.peek() == '(') st.pop();
			
		}
	}
	if(st.size() > 0) return false;
	else return true;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s = new Scanner(System.in);
		
		String str = s.nextLine();
		System.out.println(isBalanced(str));
	}

}

*/
/*
package JavaSkills;
//Remove Consecutive Subsequencwe
import java.util.Stack;

public class KK_59_InterviewStacks {

	public static int[] remove (int [] arr) {
	int n = arr.length;
	Stack<Integer> st = new Stack<>();
	
	for(int i =0; i < n;i++) {
		if(st.size() == 0 || st.peek() != arr[i])
			st.push(arr[i]);
		else	if(arr[i] == st.peek()) {
			if ( i == n-1 || arr[i] != arr[i + 1] )  st.pop();
			//skip
		}
	}
		
		int[] res = new int[st.size()];
		int m = res.length;
		for(int i= m-1; i >= 0;i--) {
			res[i] = st.pop();
		}
		return res;
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] arr = { 1,2,2,3,10,10,10,4,4,4,5,7,7,2};
		int [] res = remove(arr);
		for(int i =0 ; i < res.length;i++) {
			System.out.print(res[i]+" " );
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

*/


package JavaSkills;
//next Grenator
public class KK_59_InterviewStacks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] arr = {1,3,2,1,8,6,3,4};
int [] res = new int[arr.length];
for(int i =0 ; i < arr.length;i++) {
res[i] = -1;
	for ( int j = i+1 ; j < arr.length;j++) {
		if(arr[j] > arr[i]) {
			res[i] = arr[j];
			break;
			
		}
	}
}
for (int i =0; i < arr.length;i++) {
	System.out.print(arr[i] + " ");
}
System.out.println();
for (int i =0; i < arr.length;i++) {
	System.out.print(res[i] + " ");
}
	}

}























/*

package JavaSkills;

public class KK_59_InterviewStacks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
*/