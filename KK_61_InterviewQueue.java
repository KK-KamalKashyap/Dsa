/*

package JavaSkills;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//reverse Queue
public class KK_61_InterviewQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<Integer> q = new LinkedList<>();
		
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		System.out.println(q);
		Stack<Integer> st = new Stack<>();
		while(q.size()>0) {
			st.push(q.remove());
		}
		while(st.size()>0) {
			q.add(st.pop());
		}
		System.out.println(q);
	}

}
*/
//reorder Queue Stack

package JavaSkills;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class KK_61_InterviewQueue {

	
	
	
	public static void main(String[] args) {
		
		
Queue<Integer> q = new LinkedList<>();
		
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		q.add(6);
		q.add(7);
		q.add(8);
		Stack<Integer> st = new Stack<>();
		int n = q.size();
		for(int i =1; i <= n/2;i++) {
			st.push(q.remove());
		}
		
		while(st.size()> 0) {
			q.add(st.pop());
		}
		for(int i =1; i <= n/2;i++) {
			st.push(q.remove());
		}
		while(st.size()>0){
			//one by one, phela stack se fir quue se
			q.add(st.pop());
			q.add(q.remove());
			
		}
		while(q.size()>0) {
			st.push(q.remove());
		}
		while(st.size()>0) {
			q.add(st.pop());
		}
		System.out.println(q);
	}

}


/*

package JavaSkills;

public class KK_61_InterviewQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
*/