/*-
package JavaSkills;

import java.util.*;

public class KK_62_Collection_Framework {

	static void ArrayListExamples(){
//		ArrayList<Integer> l = new ArrayList<>();
		LinkedList<Integer> l = new LinkedList<>();
		l.add(1);
		l.add(2);
		l.add(3);
		
		System.out.println(l);
	System.out.println(l.get(1));
		l.set(1, 10);
		System.out.println(l);
		System.out.println(l.contains(10));
		
		
		
		
		
		
		
	}
	
	static void StackExamples() {
		Stack<String> st = new Stack<>();
		st.push("Pw");
		st.push("skills");
		System.out.println(st.peek());
		System.out.println(st.pop());
		System.out.println(st.peek());
		System.out.println(st.size());
		System.out.println(st.empty());
		
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
//		ArrayListExamples();
		StackExamples();
		
	}

}
*//*
package JavaSkills;

import java.util.*;

public class KK_62_Collection_Framework {

static void QueueExample() {
	LinkedList<Integer> q = new LinkedList<>();
	q.offer(1);
	q.offer(2);
	q.offer(3);
	
	System.out.println(q.peek());
	System.out.println(q.poll());
	System.out.println(q.peek());
	System.out.println(q.isEmpty());
	System.out.println(q.size());
	
	
	
	
	
	
	
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		QueueExample(); 

	}

}
*//*
package JavaSkills;

import java.util.*;

public class KK_62_Collection_Framework {

	static void DequeExample() {
		Deque<Integer> dq = new ArrayDeque<>();
		dq.addFirst(1);
		dq.addFirst(2);
		dq.addLast(3);
		dq.addLast(4);
		System.out.println(dq);
		System.out.println(dq.pollFirst());
		System.out.println(dq.pollLast());
		System.out.println(dq);
	}
	
	
static void PriorityQueueExample() {
//	PriorityQueue<Integer> pq = new PriorityQueue<>();
	PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
	pq.add(10);
	pq.add(5);
	pq.add(7);
	System.out.println(pq.peek());
	System.out.println(pq); // gurateee topmost priority elt will be processd firsty
	System.out.println(pq.poll());
	System.out.println(pq);
	System.out.println(pq.peek());
	
	
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		PriorityQueueExample();
	
		DequeExample();
	}

}
*//*
package JavaSkills;

import java.util.*;

public class KK_62_Collection_Framework {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

//	HashSet<Integer> ss = new HashSet<>();
//		LinkedHashSet<Integer> ss = new LinkedHashSet<>();
	TreeSet<Integer> ss = new TreeSet<>();
	ss.add(1);
	ss.add(2);
	ss.add(3);
	ss.add(48);
	ss.add(15);
	ss.add(10);
	System.out.println(ss); //unorderd
//	
//	System.out.println(ss);
//	ss.remove(2);
//	System.out.println(ss.contains(2));
//	System.out.println(ss.size());
	

	}

}
*///map Interface
package JavaSkills;

import java.util.*;

public class KK_62_Collection_Framework {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub


//Map<Integer, String> mp = new HashMap<>();
//		Map<Integer, String> mp = new LinkedHashMap<>();
		TreeMap<Integer, String> mp = new TreeMap<>();
mp.put(3, "Aman");
mp.put(1, "Rohan");
mp.put(2, "Riya");
/*
//Itrating over keys in a map
for(Integer i : mp.keySet()) {
	System.out.println(i);
}

for(String i : mp.values()) {
	System.out.println(i);
}

for(var i : mp.keySet()) {
	System.out.println(i);
}
*/
//Itrate over the key, value mapping


for(var e : mp.entrySet()) {
	System.out.println(e.getValue());
}















//mp.putIfAbsent(1, "Piya");
//System.out.println(mp);
//System.out.println(mp.get(2));
//System.out.println(mp.containsKey(4));
//System.out.println(mp.containsValue("Riya"));
//System.out.println(mp.entrySet());
//System.out.println(mp.keySet());
//System.out.println(mp.values());






	}

}


/*

package JavaSkills;

import java.util.*;

public class KK_62_Collection_Framework {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	

	}

}
*/