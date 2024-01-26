
/*
package JavaSkills;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class KK_60_Intro_Queues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//ArrayList <Integer> al = new ArrayList<>();

//		Stack<Integer> st = new Stack<>();
//		Queue<Integer> q = new ArrayDeque<>();
		
		Queue<Integer> q = new LinkedList<>();
		System.out.println(q.isEmpty());
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		System.out.println(q.size());
		System.out.println(q);
		
		q.remove();  //first remove
		System.out.println(q);
		q.poll();
		System.out.println(q);
		System.out.println(q.element());
		System.out.println(q.peek());
	}

}
*//*
package JavaSkills;

import java.util.LinkedList;
import java.util.Queue;

public class KK_60_Intro_Queues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q = new LinkedList<>();
		System.out.println(q.isEmpty());
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		//  rear   5 4 3 2 1 --Front
		Queue<Integer> helper = new LinkedList<>();
//		System.out.println(q);
		while(q.size() > 0) {
			System.out.print(q.peek() + " ");
		helper.add	(q.poll());
		
		
		
		}
		while(helper.size() > 0) {
			q.add(helper.poll());
			
		}
		
	}

}
*/
/*
//Array Implementaion
package JavaSkills;

import java.util.LinkedList;
import java.util.Queue;
public class KK_60_Intro_Queues {
public static class queueA{
	int f = -1;
	int r = -1;
	int size  =0;
	
	int [] arr = new int[100];
	public void  add(int val) {
		if(r == arr.length-1) {
			System.out.println("Queue is full!");
			return;
		}
		if(f == -1 ) //queue is currentlt empty{
		{
			f = r =0;
			arr[0] = val;
		}
		else {
			arr[++r] = val ;
			
			
		}
		size++;
	}
	public int remove() {
	if(size == 0) {
		System.out.println("Queue is empty!");
		return -1;
	}
		f++;
		size--;
		return arr[f-1];
	}
	public int peek() {
		if(size == 0) {
			System.out.println("Queue is empty!");
			return -1;
		}
		
	
		return arr[f];
	}
	public boolean isEmpty() {
		if(size == 0) return true;
		else return false;
		
	}
	public void display() {
		if(size == 0) {
			System.out.println("Queue uis empty");
		}else {
			for(int i = f;i < r;i++) {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println();
	}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Queue<Integer> q = new LinkedList<>();
//		q.add(1);
//		q.add(2);
//		q.add(3);
//		q.add(4);
//		q.add(5);
		queueA q = new queueA();
		q.display();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		q.display();
		q.remove();
		q.display();
		System.out.println(q.peek());
		

	}

}
*//*
package JavaSkills;
//Linked list Implementation
public class KK_60_Intro_Queues {
public static class Node{
	int val;
	Node next;
	Node (int val){
		this.val = val;
	}
}
public static class queueLL{
	Node head = null;
	Node tail = null;
	int size = 0;
	public void add(int x) {
		Node temp = new Node(x);
		if( size == 0) {
			head = tail = temp;
		}else {
			tail.next = temp;
			tail = temp;
			
		}
		size++;
	}
	public int peek() {
		if(size == 0) {
			System.out.println("Queue is empty!");
			return -1;
		}
	return	head .val;
	}
	
	public int remove() {
		if(size == 0) {
			System.out.println("Queue is empty!");
			return -1;
		}
		int x = head.val;
		head = head.next;
		size--;
	return	x;
	}
	public void display() {
		if(size == 0) {
			System.out.println("Que is empty");
			return;
		}
		Node temp = head;
		while(temp  != null) {
			System.out.print(temp.val + " ");
			temp = temp.next;
			
		}
		System.out.println();
	}
	public boolean isEmpty() {
		if(size == 0) return true;
		else return false;
		
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
queueLL q1 = new queueLL();
q1.display();
q1.add(1);
q1.add(2);
q1.add(3);
q1.add(4);
q1.add(5);
q1.display();	
System.out.println(q1.peek());		
	q1.remove()	;
	q1.display();
		
		
		
		
		
		
		
		
		
	}

}

*/

/*
package JavaSkills;
//introduction of circular quue
public class KK_60_Intro_Queues {
public static class Cqa{
	int front = -1;
	int rear = -1;
	int size = 0;
	int[] arr= new int[8];
	public void add(int val)throws Exception{
		if(size == arr.length) {
			throw new Exception("Queue is full");
			
		}
		else if (size == 0) {
			front = rear = 0;
			arr[0] = val;
			
		}
		else if(rear < arr.length-1) {
			arr[++rear] = val;
			
		}
		else if(rear == arr.length-1) {
			rear = 0;
			arr[0] = val;
			
		}
		size++;
		
		
	}
	public int remove() throws Exception{
		if(size == 0) {
		throw new Exception("Quue is empty");	
		}
	
		else  {
		int	val = arr[front];
		
		if(front == arr.length-1)	front =0;
		else front++;
		size--;
	return val;
		}
		
		}

	public int peek() throws Exception{
		if(size == 0) {
			throw new Exception("Quue is empty");	
			}
		else return arr[front];
		
	}
	public boolean isEmpty() {
		if(size == 0) return true;
		else return false;
	}
	public void display() {
		if(size == 0) {
			System.out.println("Queue is Empty");
		}
		else if (front <= rear) {
			for(int i =front; i <= rear;i++) {
				System.out.print(arr[i]+ " ");
			}
		}
		else {//rear < front
			for(int i = front; i <arr.length;i++) {
				System.out.print(arr[i]+ " ");
			}
			
		}
		System.out.println();
	}
	
	
	
	
}
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
Cqa  q = new Cqa();
q.display();
q.add(1);
q.add(2);
q.add(3);
q.add(4);
q.add(5);
q.display();
q.remove();
q.display();
q.add(6);		
q.display();	
q.add(7);	
q.display();	
q.add(8);			
q.display();	
for( int i =0 ; i < q.arr.length;i++) {
	System.out.print(q.arr[i] + " " );
}
		
	}

}*/




package JavaSkills;

import java.util.Deque;
import java.util.LinkedList;

//Deque  In Jva
public class KK_60_Intro_Queues {

	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Deque <Integer> dq = new LinkedList<>();
//add, remove,/ poll , peak/element
/*
dq.addLast(1);
dq.addLast(2);
dq.addLast(3);
dq.addLast(4);
dq.addLast(5);
dq.addFirst(6);
System.out.println(dq);
	dq.removeLast()	;
	System.out.println(dq);
		dq.removeFirst();
		System.out.println(dq);	
		System.out.println(dq.getFirst());
		*/


dq.addLast(1);
dq.addLast(2);
dq.addLast(3);
dq.addLast(4);
dq.add(5); //last add
dq.remove(); //first remove
System.out.println();
	}

}


















/*
package JavaSkills;

public class KK_60_Intro_Queues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
*/
