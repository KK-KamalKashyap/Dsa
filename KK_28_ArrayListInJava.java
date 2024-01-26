//
//
//package JavaSkills;
//import java.util.ArrayList;
//public class KK_28_ArrayListInJava {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
////wrapper Classes
//		/*
//		Integer i = Integer.valueOf(4);
//		System.out.println(i);
//		
//		Float f = Float.valueOf(4.5f);
//		System.out.println(f);
//		*/
//		ArrayList<Integer> l1 = new ArrayList<>();
////		ArrayList<Boolean> l2 = new ArrayList<>();
////		ArrayList<Float> l3 = new ArrayList<>();
//		
//		//add new element
//		
//		l1.add(5);
//		l1.add(6);
//		l1.add(7);
//		l1.add(8);
//		
//		//get an elemnet at index i
//		System.out.println(l1.get(1)); //6
//		
//		
//		//print with for loop
//		for(int i=0; i< l1.size(); i++) {
//			System.out.println(l1.get(i));  // 5,6,7,8
//		}
//		
//		//print the array list directly
//		System.out.println(l1); // [5,6,7,8];
//		
//		
//		//adding elemet elemet at some index i   // 5 100 6 7 8
//		l1.add(1,100);
//		System.out.println(l1);
//		
//		//modifiying elemet at index i
//		l1.set(1, 10);
//		System.out.println(l1);  //5, 10, 6 , 7 8
//		
//		
//		
//		// removing an elemet at index i
//		l1.remove(1);
//		System.out.println(l1); // 5,6,7,8
//		
//		
//		
//		//removing an elemet e
//		l1.remove(Integer.valueOf(7));
//		System.out.println(l1);  //5, 6, 8
//		
//		
//		//checking if an elemet exists
//		boolean ans = l1.contains(Integer.valueOf(6));
//		System.out.println(ans);
//		
//		//if you don't specify clkass, ypu can put antythting inside i
//		ArrayList l = new ArrayList();
//		l.add("pqrs");
//		l.add(1);
//		l.add(true);
//		System.out.println(l);
//		
//		
//		
//		
//		
//	}
//
//}
//


	


package JavaSkills;
import java.util.ArrayList;
import java.util.Collections;
public class KK_28_ArrayListInJava {

	static void reverseList(ArrayList<Integer> list) {
		int i =0, j= list.size() -1;
		
		while(i<j) {
			/*
			 * int temp =a;
			 * a=b;
			 * b=temp;
			 */
			
			
			
			Integer temp = Integer.valueOf(list.get(i));
			list.set(i,  list.get(j));
			list.set(j, temp);
			i++;
			j--;
		}
		
	}
	
	
	private static void valueOf(Integer integer) {
		// TODO Auto-generated method stub
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer> list = new ArrayList<>();
list.add(0);
list.add(10);
list.add(3);
list.add(5);
list.add(22);
list.add(10);
System.out.println("Original List " + list);
		//reverseList(list);
Collections.reverse(list);

		System.out.println("Reverse List "+ list);
		Collections.sort(list);
		System.out.println("Ascending order " + list);
		Collections.sort(list,Collections.reverseOrder());
		System.out.println("Desc Order " + list);
		
		
		
		ArrayList<String> l1 = new ArrayList<>();
		l1.add("Welcome");
		l1.add("To");
		l1.add("Home");
		l1.add("Tour");
		System.out.println("OG " + l1);
		Collections.sort(l1,Collections.reverseOrder());
		System.out.println("Sorted "+ l1);
		
	
		
	}
}









