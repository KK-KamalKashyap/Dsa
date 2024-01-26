 
/*
package JavaSkills;

import java.util.*;



public class KK_63_HashMap {

	static void HashMapMethods() {
		//syntax
		Map<String, Integer> mp = new HashMap<>();
		//Adding Elements
		mp.put("Akash" , 21);
		mp.put("yash" , 16);
		mp.put("kamal" , 18);
		mp.put("reey" , 21);
		mp.put("harry" , 20);
		//Getting value of a key from the HashMap
	System.out.println(mp.get("yash"));	
System.out.println(mp.get("Rahul")); //null

//changing /updating value of a key in the HAshmap
mp.put("Akash", 25);
System.out.println(mp.get("Akash"));
//Removing a pair from the hashiung


System.out.println(mp.remove("Akash"));
System.out.println(mp.remove("riya"));
		
//checking if a key is in the hashing
System.out.println(mp.containsKey("Akash"));
System.out.println(mp.containsKey("yash"));
//Adding a new entry only if the new key doesnt exit already

mp.putIfAbsent("yashika", 30);
mp.putIfAbsent("yash", 30);
//get all keys in the Hashmap
System.out.println(mp.keySet());
//get all values in the hashmap
System.out.println(mp.values());
//get all entries in the hashmap
System.out.println(mp.entrySet());

//traversing all entries of hashmap - multiple methoda
for(String key: mp.keySet()) {
	System.out.printf("Age of %s is %d\n" , key,mp.get(key));
}
System.out.println();
for(Map.Entry<String, Integer> e : mp.entrySet()) {
	System.out.printf("Age of %s is %d\n", e.getKey() , e.getValue());
}

System.out.println(  );
for (var e : mp.entrySet()) {
	System.out.printf("Age of %s is %d\n", e.getKey() , e.getValue());
}





	}

	
	
	
	


	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMapMethods();
	}

}

	*/


/*

//max Frequency

package JavaSkills;

import java.util.*;



public class KK_63_HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = {1,4,2,5,1,4,4,6,4,4,4};
		Map <Integer, Integer> freq = new HashMap<>();
		for( int el : arr) {
			if(!freq.containsKey(el)) {
				freq.put(el, 1);
			}else {
				freq.put(el, freq.get(el) + 1);
			}
		}
	System.out.println("Frequency Map ");
	System.out.println(freq.entrySet());
	int mxFreq = 0, ansKey = -1;
	for(var e : freq.entrySet()) {
		if(e.getValue() > mxFreq) {
			mxFreq = e.getValue();
			ansKey = e.getKey()
;
			}
	}
	System.out.println(ansKey);
	for(var key : freq.keySet()) {
		if(freq.get(key) > mxFreq) {
			mxFreq = freq.get(key);
			ansKey = key;
		}
	}
	System.out.printf("%d has max frequency and it occours %d times ",ansKey,mxFreq);
	}

}


*/


package JavaSkills;

import java.util.LinkedList;

public class KK_63_HashMap {

	static class MyHashMap<K,V>{
		public static final   int DEFAULT_CAPACITY = 4;
		public static final   float DEFAULT_LOAD_FACTOR  = 0.75f;
		private class Node{
			K key;
			V value;
			Node(K key, V value){
				this.key = key;
				this.value = value;
				
			}
		}
	private int n;
		private LinkedList<Node>[] buckets;
	private void initBuckets(int N) {
//		N - capacity/size of buckets array
		buckets = new LinkedList[N];
		for(int i =0; i < buckets.length;i++) {
			buckets[i] = new LinkedList<>();
		}
	}
	private int HashFunc(K key)	{
		 int hc = key.hashCode();
		return (Math.abs(hc) ) % buckets.length;
	}
	//Traverses the ll and looks for a node with key, if found it returns its index otherwise it return null
	private int searchInBucket(LinkedList<Node> ll, K key) {
	for(int i = 0; i < ll.size();i++) {
		if(ll.get(i).key == key) {
			return i;
			
		}
	}
	return -1;
	}
	
	public MyHashMap() {
			initBuckets(DEFAULT_CAPACITY);
			
		}
	
	
	public int capcity() {
		return buckets.length;
		
	}
	public float load() {
		return (n*1.0f)/buckets.length;
	}
	private void rehash() {
		LinkedList<Node>[] oldBuckets = buckets;
		initBuckets(oldBuckets.length * 2);
		n =0;
		for( var bucket : oldBuckets) {
			for(var node : bucket ) {
				put(node.key , node.value);
				
			}
		}
	}
	public int size() {
		///return the no. of entries
		return n;
	}
	
	public void put(K key, V value) { //insert/ update
		int bi = HashFunc(key);
		LinkedList<Node> currBucket = buckets[bi];
int ei = searchInBucket(currBucket, key);
		if (ei == -1) {
			//kety doesnot exits , we have to insert a new node
			Node node = new Node(key, value);
			currBucket.add(node);
			n++;
		}else { ///update case
			Node currNode = currBucket.get(ei);
			currNode.value = value;
			
		}
		if( n >= buckets.length* DEFAULT_LOAD_FACTOR) {
			rehash();
			
		}
		
	}
	public V get(K key) {
		int bi = HashFunc(key);
		LinkedList<Node> currBucket = buckets[bi];
		
		int ei = searchInBucket(currBucket, key);
		if (ei != -1) {
			//key exits
			Node currNode = currBucket.get(ei);
			return currNode.value;
		}
			return null;
		
	}
	public V remove(K key) {
		int bi = HashFunc(key);
		LinkedList<Node> currBucket = buckets[bi];
		
		int ei = searchInBucket(currBucket, key);
		if(ei != -1) {
		//key exits
			Node currNode = currBucket.get(ei);
			V val = currNode.value;
			currBucket.remove(ei);
			n--;
			return val;
			
		}
		//key doeasn't exist
		return null;
	}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 MyHashMap<String, Integer> mp = new  MyHashMap<>();
		 
		System.out.println("Testing put");
		mp.put("a", 1);
		mp.put("b", 2);
		mp.put("c", 3);
		mp.put("d", 4);
		mp.put("x", 61);
		mp.put("y", 71);
		System.out.println("Testing size " + mp.size());
		
		mp.put("d", 40);
		System.out.println("Testing size " + mp.size());
		
		//TEsting get
		System.out.println(mp.get("x"));
		System.out.println(mp.get("y"));
		System.out.println(mp.get("a"));
		System.out.println(mp.get("b"));
		System.out.println(mp.get("c"));
		System.out.println(mp.get("d"));
		System.out.println(mp.get("college"));
		
		System.out.println(mp.remove("c"));

		System.out.println(mp.remove("c"));
		System.out.println("Testing size " + mp.size());
		System.out.println( "CAPACITY " +mp.capcity());
		System.out.println( "LOAD "  + mp.load());
	}

}
















/*
package JavaSkills;

public class KK_63_HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
*/