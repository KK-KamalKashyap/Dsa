/*
package JavaSkills;

public class KK_55_Linked_List_1 {
	public static void insertAtEnd(Node head, int val) {
		Node temp  = new Node(val);
		Node t = head;
		while(t.next != null) {
			t = t.next;
		}
		t.next = temp;
	}
	public static void displayr( Node head) {
		if(head == null) return;
		
		displayr(head.next);
		System.out.print(head.data+ " ");
	}
	public static void displayrec( Node head) {
		if(head == null) return;
		
		displayr(head.next);
		System.out.print(head.data+ " ");
	}
	public static int length(Node head) {
		int count = 0;
		while(head != null) { //printing the list
			count++;
			head = head.next;
		}
		return count;
	}
public static void display(Node head) {
	Node temp = head;
	while(temp != null) { //printing the list
		System.out.print(temp.data + " ");
		temp = temp.next;
	}
}
	public static class Node{
		int data; //value
		Node next; //address of next node
		
		Node(int data){
			this.data = data;
			
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Node x = new Node();
		
		
		Node a = new Node(5); //head
//		System.out.println(a.next); //null
		Node b = new Node(3);
		Node c = new Node(9);
		Node d = new Node(8);
		Node e = new Node(16);
//		System.out.println(x.next);
//		System.out.println(x.data);
	
		//5 3 9 8 16
		
		
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
	
		
//		System.out.println(a);//Node@12edcd21
//		System.out.println(a.next); //$Node@34c45dca
//		System.out.println(b);  //$Node@34c45dca
//		System.out.println(c); //$Node@52cc8049

		
//		System.out.println(a.next.data);
//	System.out.println(a.next.data);
//	System.out.println(a.next.next.data);
//	System.out.println(a.next.next.next.data);
//	System.out.println(a.next.next.next.next.data);
//	
		
//	Node temp = a;
	
//		for(int i =1; i <=5;i++) {
//			System.out.print(temp.data + " ");
//			temp = temp.next;
//		}
//		
		
//	while(temp != null) { //printing the list
//		System.out.print(temp.data + " ");
//		temp = temp.next;
//	}
	
	
	
//	display(a);
//	System.out.println();
//	displayr(a);
//	
//	System.out.println(length(a));
	
	insertAtEnd(a,87);
	display(a);
	}

}

*/





package JavaSkills;

import java.util.LinkedList;

public class KK_55_Linked_List_1 {
public static class Node{
	int data;
	Node next;
	Node(int data){
		this.data = data;
	}
}
public static class linkedlist{
	Node head= null;
	Node tail = null;
	int size = 0;
void insertAtEnd(int val) {
	Node temp = new Node(val);
	if(head == null) {
		head = temp;
		
		
	}
	else {
		tail.next = temp;
		
	}
	tail = temp;
	size++;
}
void insertAtHead(int val) {
Node temp = new Node(val);
if(head == null) {//empty list
	insertAtEnd(val);
}
else {//non empty
	temp.next = head;
	head= temp;
	
			
	
}
size++;
}

void insertAt(int idx, int val) {
	Node t = new Node (val);
	Node temp = head;
	if( idx == size()) {
		insertAtEnd(val);
		return;
	}
	else if (idx == 0){
		insertAtHead(val);
		return;
	}
	else if(idx < 0  || idx >size() ){
		System.out.println("wrong index");
			return;
	}
	
	for(int i = 1; i <= idx-1; i++) {
		temp = temp.next;
	}
	t.next =  temp.next;
	temp.next = t;
	size++;
}
int getAt(int idx) {
	if(idx < 0  || idx >size() ){
		System.out.println("wrong index");
			return -1;
	}
	
	Node temp = head;
	for(int i =1;i <= idx;i++) {
		temp = temp.next;
	}
	return temp.data;
}
void deleteAt(int idx) {
	if(idx == 0) {
		head = head.next;
		size--;
		return ;
	}
	Node temp = head;
	for(int i =1;i <= idx-1;i++) {
		temp = temp.next;
	}
	temp.next = temp.next.next;
	tail =temp;
	size--;
}
void display() {
	Node temp  = head;
	while(temp  != null) {
		System.out.print(temp.data + " ");
		temp  = temp.next;
	}
	System.out.println();
}
int size() { //o(n)
//	Node temp  = head;
//	int count = 0;
//	while(temp  != null) {
//		count++;
//		temp  = temp.next;
//	}
//	return count;
	return size;
}

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
linkedlist ll = new linkedlist();
ll.insertAtEnd(4); //4
ll.display();
ll.insertAtEnd(5); //4 5 
ll.display();

//System.out.println();
//System.out.println(ll.size());

ll.insertAtEnd(12);
ll.display();
ll.insertAtHead(13);
ll.display();
ll.insertAt(4, 10);
ll.display();
//System.out.println(ll.tail.data);
ll.insertAt(0, 100);
ll.display();
//System.out.println(ll.getAt(3));
ll.deleteAt(5);
ll.display();
System.out.println(ll.tail.data);
	}

}


































/*
package JavaSkills;

public class KK_55_Linked_List_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
*/