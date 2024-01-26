package JavaSkills;

import JavaSkills.KK_56_Linked_List_Interview.Node;

public class KK_57_Doubly_Circular {
public static class Node{
	int val ;
	Node next;
	Node prev;
	Node(int val){
		this.val = val;
	}
}
public static void display(Node head) {
	Node temp = head;
	while(temp!= null) {
		System.out.print(temp.val+ " ");
		temp = temp.next;
	}
	System.out.println();
}
public static void displayrev(Node tail) {
	Node temp = tail;
	while(temp!= null) {
		System.out.print(temp.val+ " ");
		temp = temp.prev;
	}
	System.out.println();
}
public static void display2(Node random) { //you will 
	Node temp = random;
	//move this temp backwarkds to the head
	while(temp.prev!= null) {
	
		temp = temp.prev;
	}
	//now temp is at hewade
	
	//print the list
	while(temp!= null) {
		System.out.print(temp.val+ " ");
		temp = temp.next;
	}
	System.out.println();
	}

public static Node insertAtHead(Node head, int x) {
	Node t = new Node (30);
	t.next = head;
	head.prev = t;
	head =t;
	return head;
			
}
public static void insertAtTail(Node head, int x) {
	Node temp = head;
	//temp ko tail tak leke jaate hai
	while(temp.next != null) {
		temp = temp.next;
	}
	Node t = new Node(x);
	temp.next = t;
	t.prev = temp;
}

public static void insertAtIdx (Node head, int idx, int x) {
	Node s = head;
	for(int i = 1; i <= idx-1; i++) {
		s = s.next;
		
	}
	
	//s is at idx-1  position
	Node r = s.next; // idx
	Node t = new Node(x);
	//s t r
	s.next = t;
	t.prev = s;
	t.next = r;
	r.prev = t;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 // 4 10 2 99 13 
		Node a =  new Node(4);
		Node b =  new Node(10);
		Node c =  new Node(2);
		Node d =  new Node(99);
		Node e =  new Node(13);
		
		a.prev = null;
		a.next = b;
		b.prev = a;
		b.next = c;
		c.prev = b;
		c.next = d;
		d.prev = c;
		d.next = e;
		e.prev = d;
		e.next = null;
		
		
//		display(a);
//		displayrev(e);
		display2(c);
//		Node newHead = insertAtHead(a,35);
//		display(newHead);
		insertAtTail(a, 90);
		display(a);
		 insertAtIdx(a, 3, 56);
		 display(a);
		
	}

}



/*

package JavaSkills;

public class KK_57_Doubly_Circular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

*/