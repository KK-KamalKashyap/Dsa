/*

package JavaSkills;

import java.util.Stack;

public class KK_58_Introduction_Stacks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int [] att = new int[5];
//		ArrayList<Integer> arr = new ArrayList<>();
		Stack <Integer> st = new Stack<>();
		System.out.println(st.isEmpty());
		st.push(1);
		st.push(23);
		st.push(90);
		st.push(5);
		st.push(34);
  //peek
//		System.out.println(st.peek());
//		System.out.println(st);
//		st.pop();
//		System.out.println(st);
		System.out.println("sizer is : " + st.size());
		System.out.println(st.isEmpty());
		while (st.size()>1) {
			st.pop();
		}
		System.out.println(st.peek());

		
	}

}

*/

/*
package JavaSkills;

import java.util.Scanner;
import java.util.Stack;

public class KK_58_Introduction_Stacks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Stack <Integer> st = new Stack<>();
//		int n;
//		System.out.println(" Enter the number element ");
//		n = s.nextInt();
//		System.out.println("Enter the elements : ");
//		for(int i =1; i <= n; i++) {
//			int x = s.nextInt();
//			st.push(x);
//			
//		}
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push( 5);
		
		System.out.println(st);
		Stack<Integer> gt = new Stack<>() ;
		while(st.size() > 0) {
			int x = st.peek();
			gt.push(st.pop());
				}
		Stack<Integer> rt = new Stack<>() ;
		while(gt.size() > 0) {
			rt.push(gt.pop());
		}
		System.out.println(rt);
	}

}



*/
/*
//insertionInStack

package JavaSkills;

import java.util.Stack;

public class KK_58_Introduction_Stacks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack <Integer> st = new Stack<>();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push( 5);
		System.out.println(st);
		int idx = 2 ;
		int x = 7;
		Stack <Integer> temp = new Stack<>();
		while(st.size() > idx) {
			temp.push(st.pop());
			
		}
		st.push(x);
		while(temp.size() > 0) {
			st.push(temp.pop());
		}
		System.out.println(st);
		
		
		
	}

}

*/

/*

package JavaSkills;

import java.util.Stack;

public class KK_58_Introduction_Stacks {
public static void displayReverseRec(Stack<Integer> st) {
//	s.push(6);
	if(st.size() == 0) return;
	int top = st.pop();
	System.out.print(top+ " ");
	displayReverseRec(st);
	st.push(top);
	
	
}
public static void displayRec(Stack<Integer> st) {
//	s.push(6);
	if(st.size() == 0) return;
	int top = st.pop();
	
	displayRec(st);
	System.out.print(top+ " ");
	st.push(top);
	
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack <Integer> st = new Stack<>();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push( 5);
//		System.out.println(st);
//		Stack <Integer> rt = new Stack<>();
//		while(st.size() > 0) {
//		
//			rt.push(st.pop());
//			
//		}
//		while(rt.size() > 0)
//		{
//			int x = rt.pop();
//			System.out.print(x+ " ");
//			st.push(x);
//			
//		}
		
		
//		int n = st.size();
//		int [] arr = new int[n];
//		
//		for(int i = n-1 ; i >= 0;i--) {
//			arr[i] = st.pop();
//			
//			
//		}
//		for(int i=0; i <n ; i++) {
//			System.out.print(arr[i] + " ");
//			st.push(arr[i]);
//		}
//		System.out.println(st);
//		displayReverseRec(st);
	
		displayRec(st);
//		System.out.println(st);
		
		
	}

}
*/
/*
package JavaSkills;

import java.util.*;
public class KK_58_Introduction_Stacks {
	public static void pushAtBottom(Stack<Integer>  st, int x) {
		if(st.size() == 0) {
			st.push(x);
			return;
		}
		int top = st.pop();
		pushAtBottom(st,x);
		st.push(top);
		
	}
public static void reverse(Stack<Integer> st) {
	if(st.size() == 1) return;
	int top = st.pop();
	reverse(st);
	pushAtBottom(st, top);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack <Integer> st = new Stack<>();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push( 5);
//System.out.println(st);
//		Stack <Integer> rt = new Stack<>();
//		while(st.size( )> 0) {
//			rt.push(st.pop ());
//			
//		}
//		System.out.println(rt);
//		Stack <Integer> qt = new Stack<>();
//		while(rt.size( )> 0) {
//			qt.push(rt.pop ());
//			
//		}
//		System.out.println(qt);
//		
//		while(qt.size( )> 0) {
//			st.push(qt.pop ());
//			
//		}
//		System.out.println(st);
		
		
		
		System.out.println(st);
		reverse(st);
		System.out.println(st);
	}

}


*/
/*
//under flow
package JavaSkills;
import java.util.Stack;
public class KK_58_Introduction_Stacks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack <Integer> st = new Stack<>();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push( 5);
		System.out.println(st);
		st.pop();
System.out.println(st);
st.pop();
System.out.println(st);
st.pop();
System.out.println(st);
st.pop();
System.out.println(st);
st.pop();
System.out.println(st);
st.pop();
System.out.println(st);
st.pop();
System.out.println(st);
st.pop();//error
System.out.println(st);
	}

}
*//*
//array implemention
package JavaSkills;

public class KK_58_Introduction_Stacks {
public static class Stack{
	private int [] arr = new int[4 ];
private int idx = 0; //vvv imp
	void push(int x) {
		if(isFull()) {
			System.out.println("Stack is Full!");
			return;
		}
	arr[idx] = x;
	idx++;
	
	}
	int peek() {
		if(idx == 0) {
			System.out.println("Stack is Empty!");
		return -1;
			
		}
		return arr[idx - 1];
	}
	int pop() {
		if(idx == 0) {
			System.out.println("Stack is Empty!");
		return -1;
			
		}
		int top = arr[idx -1];
		arr[idx-1 ] = 0;
		idx--;
		return top;
	}
	void display() {
		for(int i =0;i <= idx-1; i++) {
			System.out.print(arr[i]+ " " );
		}
		System.out.println();
	}
	int size() {
		return idx;
		
	}
	boolean isEmpty() {
		if(idx == 0) return true;
		else return false;
	}
	boolean isFull() {
		if(idx == arr.length) return true;
		else return false;
	}
	int capacity() {
		return arr.length;
	}
} 
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Stack st = new Stack();
st.push(4);
st.display();
st.push(5);
st.display();
st.push(1);
st.display();
System.out.println(st.size());
st.pop();
st.display();
System.out.println(st.size());
st.push(7);
st.push(0);
		System.out.println(st.isFull());
		st.push(100);
	}

}


*/



package JavaSkills;
//import java.util.Stack;
public class KK_58_Introduction_Stacks {

	public static class Node { //user defined data type
	int val;
	Node next;
	Node (int val){
		this.val = val;
	}
	}
	
	public static class LLStack { //user defined data type
private 	Node head = null;
private 	int size =0 ;
	void push (int x) {
		Node temp = new Node(x);
		temp.next = head;
		head = temp;
		size++;
		
	}
	int pop() {
		if(head == null) {
			System.out.println("Stach is empty");
			return -1;
		}
		int x = head.val;
		head = head.next;
		return x;
	}
	int peek() {
		if(head == null) {
			System.out.println("Stack is Empty!");
		return -1;
			
		}
		return head.val;
	}
	void displayrec(Node h) {
		if(h ==null ) return;
		displayrec(h.next);
		System.out.print(h.val +" ");
	}
	void display() {
		displayrec(head);
		System.out.println();
	}
	void displayRev(){
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.val + " ");
			temp = temp.next;
		}
		System.out.println();
	}
	int size() { //getter
		 return size;
	}
	boolean isEmpty() {
		if(size == 0) return true;
		else return false;
	}
	
		}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
LLStack st = new LLStack();
st.push(4);
st. display();
st.push(5);
st.display();
st.push(1);
st.display();
System.out.println(st.size());
st.pop();
st.display();
System.out.println(st.size());
st.push(7);
st.push(0);
		
		st.push(100);
	}

}










/*
package JavaSkills;
import java.util.Stack;
public class KK_58_Introduction_Stacks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
*/