/*

package JavaSkills;

public class KK_68_BinarySearchTree {

	public static class Node{
	
		int val;
		Node left;
		Node right;
		public Node( int val ) {
			// TODO Auto-generated constructor stub
			this.val = val;
		}
		
	}
	public static void display(Node root ) {
		if(root == null) return;
		System.out.print(root.val + "-> " );
		if (root.left!= null) System.out.print(root.left.val + " , ");
		if (root.right!= null)	System.out.print(root.right.val);
		System.out.println();
		display(root.left);
		display(root.right);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node root = new Node(2);
		Node a = new Node (4);
		Node b = new Node (10);
		root.left = a;
		root.right = b;
		Node c = new Node (6);
		Node d = new Node (5);
		a.left = c;
		a.right = d;
		Node e = new Node (11);
		b.right = e;
//		root.val = 10;
//		
//		System.out.println(root.val);
//		System.out.println(root.right);
		display(root);
		
	}

}
*//*
//size max  sum 
package JavaSkills;

public class KK_68_BinarySearchTree {
//	static int size = 0;
	public static class Node{
		
		int val;
		Node left;
		Node right;
		public Node( int val ) {
			// TODO Auto-generated constructor stub
			this.val = val;
		}
		
}

//	public static void preorder (Node root) {
//		if(root == null) return;
////		System.out.print(root.val + " ");
//		size++;
//		preorder(root.left);
//		preorder(root.right);
//		
//		
//	}
	public static  int height(Node root) {
		if(root == null) return 0;
		if(root.left  == null && root.right == null) return 0;
		return 1 + Math.max(height(root.left), height(root.right));
		
		
	}
	public static  int max(Node root) {
		if(root == null) return Integer.MIN_VALUE;
		int a = root.val;
		int b = max(root.left);
		int c = max(root.right);
		
		return Math.max(a,Math.max(b, c));
		
		
		
	}
	public static int sum (Node root) {
		if(root == null) return 0;
		return root.val + sum(root.left) + sum(root.right);
	}
	
	public static int size (Node root) {
		if(root == null) return 0;
		return 1 + size(root.left) + size(root.right);
	}
//	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(1);
		Node a = new Node (2);
		Node b = new Node (3);
		root.left = a;
		root.right = b;
		Node c = new Node (4);
		Node d = new Node (5);
		a.left = c;
		a.right = d;
		Node e = new Node (6);
		Node f = new Node (7);
		b.right = e;
		b.left = f;
//preorder(root);
System.out.println(size(root));
System.out.println(sum(root));
System.out.println(max(root));
System.out.println(height(root));
	}

}



*/

//preIn Post
package JavaSkills;

import java.util.LinkedList;
import java.util.Queue;

public class KK_68_BinarySearchTree {
public static void pip(int n) {
	if (n == 0) return ;
	System.out.print(n); //pre
	pip(n-1);
	System.out.print(n);//in
	pip(n-1);
	System.out.print(n);//post
	
	
}
public static class Node{
	
	int val;
	Node left;
	Node right;
	public Node( int val ) {
		// TODO Auto-generated constructor stub
		this.val = val;
	}
	
}
	public static void preorder (Node root) {
		if(root == null) return;
		System.out.print(root.val + " ");
		preorder(root.left);
		preorder(root.right);
		
		
	}

	public static void inorder (Node root) {
		if(root == null) return;
	
		inorder(root.left);
		System.out.print(root.val + " ");
		inorder(root.right);
		
		
	}
	public static void postorder (Node root) {
		if(root == null) return;
	
		postorder(root.left);
		
		postorder(root.right);
		System.out.print(root.val + " ");
		
	}
	public static void nthLevel (Node root, int n) {
		if(root == null) return;
		if(n == 1) {
			 System.out.print(root.val + " ");
			 return;
		}
		
		nthLevel(root.left,n-1);
		nthLevel(root.right,n-1);
	}
	public static void bfs(Node root) { //Itewrative way
		Queue<Node> q = new LinkedList<>();
		if(root != null)	q.add(root);
		while(q.size()> 0) {
			Node temp = q.peek();
			if(temp.left != null) q.add(temp.left);
			if(temp.right != null) q.add(temp.right);
			System.out.print(temp.val + " ");
			q.remove();
			
		}
	}
	
	
	
	public static  int height(Node root) {
		if(root == null) return 0;
		if(root.left  == null && root.right == null) return 0;
		return 1 + Math.max(height(root.left), height(root.right));
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//pip(3);
		Node root = new Node(1);
		Node a = new Node (2);
		Node b = new Node (3);
		root.left = a;
		root.right = b;
		Node c = new Node (4);
		Node d = new Node (5);
		a.left = c;
		a.right = d;
		Node e = new Node (6);
		Node f = new Node (7);
		b.right = e;
		b.left = f;
		preorder(root);
		System.out.println();
		inorder(root);
		System.out.println();
		 postorder(root);
		 System.out.println();
//		 int level = height(root) + 1;
//		 for(int i =1 ;i <= level;i++) { //O(n)
//			 nthLevel(root,i);
//		 
//		 
//		 }
		 //O(nlogn)
		 bfs(root);
	}

}












/*
package JavaSkills;

public class KK_68_BinarySearchTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
*/
