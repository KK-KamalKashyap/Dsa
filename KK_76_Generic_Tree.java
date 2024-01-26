package JavaSkills;

import java.util.*;

public class KK_76_Generic_Tree {
	private static void fromTree(Node root) {

		root.child.add(new Node(5));
		root.child.add(new Node(11));
		root.child.add(new Node(63));

		root.child.get(0).child.add(new Node(1));
		root.child.get(0).child.add(new Node(4));
		root.child.get(0).child.add(new Node(8));
		root.child.get(1).child.add(new Node(6));
		root.child.get(1).child.add(new Node(7));
		root.child.get(1).child.add(new Node(15));
		root.child.get(2).child.add(new Node(31));
		root.child.get(2).child.add(new Node(55));
		root.child.get(2).child.add(new Node(65));

	}
	private static class Node{
		int value;
		List<Node> child;

		Node (int value){
			this.value = value;
			child = new ArrayList<>();

		}



	}
	static void preOrderTraversal(Node root) {
		if(root.child.isEmpty()) {
			System.out.print(root.value + " ");
			return;
		}
		System.out.print(root.value + " ");
		int n = root.child.size();
		for(int i =0 ; i < n;i++) {
			preOrderTraversal(root.child.get(i));
		}


	}
	static void postOrderTraversal(Node root) {
		if(root.child.isEmpty()) {
			System.out.print(root.value + " ");
			return;
		}

		int n = root.child.size();
		for(int i =0 ; i < n;i++) {
			postOrderTraversal(root.child.get(i));
		}

		System.out.print(root.value + " ");
	}

	static void levelOrderTraversal(Node root) {
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		while (!q.isEmpty()) {


			Node currentNode  = q.peek();
			System.out.print(currentNode.value + " ");
			q.remove();
			int noc = currentNode.child.size();
			for(int i =0; i < noc;i++) {
				q.add(currentNode.child.get(i));	
			}
		}
	}
	static void zigzagOrderTraversal(Node root) {
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		boolean flag = false;
		while (!q.isEmpty()) {
			int levelSize = q.size();
			
			
List<Node> currentLevel = new ArrayList<>();
while(levelSize-- > 0) { 
			Node currentNode  = q.peek();
			
			q.remove();
			int noc = currentNode.child.size();
			for(int i =0; i < noc;i++) {
				q.add(currentNode.child.get(i));	
			}
			
		}
if(flag == false) {
	printNodeList(currentLevel);
	
	
	
}else {
	reverse(currentLevel);
	printNodeList(currentLevel);

}
flag = !flag;
	}
	}
private static void reverse(List<Node> currentLevel) {
		// TODO Auto-generated method stub
		
	}
static void printNodeList(List<Node> nodeList) {
	for(int i =0; i < nodeList.size();i++) {
		System.out.print(nodeList.get(i).value + " ");
	}
	System.out.println();
}

public static int findMax(Node root) {
	if(root.child.isEmpty()) {
		return root.value;
	}
	int mtn = root.value;
	int n = root.child.size();
	for(int i =0; i < n;i++) {
int childMax = findMax(root.child.get(i));
	if(childMax > mtn) {
		mtn = childMax;
	}
		
		
	}
	return mtn;
}
	
private static void mirrorTree (Node root) {
	if(root.child.isEmpty())
		return;
	int noc  = root.child.size();
	
	if(noc == 1)
		return;
	for(int i =0; i < noc; i++) {
		mirrorTree(root.child.get(i));
		reverse(root.child);
	}
	
}


public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node (30);
		fromTree(root);
		preOrderTraversal(root); 
		System.out.println();
		postOrderTraversal(root);
		System.out.println();
		levelOrderTraversal(root);
		System.out.println();
		zigzagOrderTraversal(root);
		System.out.println(findMax(root));
		
		
	}

}



/*
package JavaSkills;

public class KK_76_Generic_Tree {



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
 */