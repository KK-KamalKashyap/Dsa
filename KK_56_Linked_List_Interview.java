
/*package JavaSkills;

public class KK_56_Linked_List_Interview {
	
	public static Node nthNode(Node head, int n) {
		int size = 0;
		Node temp = head;
		while(temp != null) {
			size++;
			temp = temp.next;
			
		}
		int m =  size -n + 1;
		//mth node from start
		temp = head;
		for(int i =1; i <= m-1;i++) {
			temp = temp.next;
		}
		return temp;
	}
	public static Node nthNode2(Node head , int n ) {
		Node slow = head;
		Node fast = head;
		for(int i = 1;i <= n;i++) {
			fast = fast.next;
		}
		while(fast != null) {
			slow = slow.next;
			fast = fast.next;
		}
		return slow;
	}
	public static Node deleteNthFromEnd(Node head, int n) {
		Node slow = head;
		Node fast = head;
		for(int i = 1;i <= n;i++) {
			fast = fast.next;
		}
		if(fast == null) {
			head = head.next;
			return head;
		}
		while(fast.next != null) {
			slow = slow.next;
			fast = fast.next;
		}
	slow.next = slow.next.next;
	return head;
	}
public static class Node {
	int data;
	Node next;
	Node(int data){
		this.data = data;
	}
}
	
	public static void display(Node head) {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data+ " ");
			temp= temp.next;
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Node x = new Node();
		
		
		Node a = new Node(100); //head
//		System.out.println(a.next); //null
		Node b = new Node(13);
		Node c = new Node(4);
		Node d = new Node(5);
		Node e = new Node(12);
		Node f = new Node(10);
//		System.out.println(x.next);
//		System.out.println(x.data);
	
		//5 3 9 8 16
		
		
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		e.next = f;
		
//		Node q =nthNode2(a,3);
//		System.out.println(q.data);
		display(a);
		a= deleteNthFromEnd(a,6);
		display(a);
	}

}
*/

package JavaSkills;

public class KK_56_Linked_List_Interview {
	public static class Node{
		int val; //value
		Node next; //address of next node
		
		Node(int data){
			this.val = data;
			
		}
		
		
	}
	public static Node reverse(Node head) {
		if(head.next == null) return head;
		Node newHead = reverse(head.next);
		head.next.next = head; //1 2 3 4 interchaning the correction 
		head.next =null;
		return newHead;
	}
	public static void displayr( Node head) {
		if(head == null) return;  //base case
		
		displayr(head.next); //call
		System.out.print(head.val+ " "); //work
		
	}
	public static void display( Node head) {
		if(head == null) {
			System.out.println();
			return;  //base case
		}
			
		
		System.out.print(head.val+ " "); //work

		display(head.next); //call
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node a = new Node(3); //head
//		System.out.println(a.next); //null
		Node b = new Node(5);
		Node c = new Node(1);
		Node d = new Node(2);
		Node e = new Node(4);
//		System.out.println(x.next);
//		System.out.println(x.data);
	
		//5 3 9 8 16
		
		
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		display(a);
		Node r = reverse(a);
		display(r);
	}

} 


/*
package JavaSkills;

public class KK_56_Linked_List_Interview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

*/