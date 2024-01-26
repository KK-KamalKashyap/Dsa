/*
package JavaSkills;
import java.util.*;
public class KK_54_OOPs_One_Shot {
//creating a new data type
	public static class Student{
		String name;
		int rno;
		double percent;
		
		
		
	}
	
//	public static class Car{
//		String name;
//		String type;
//		int price;
//		
//	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sd = new Scanner(System.in);
		int z  = sd.nextInt();
		
		 class Car{
			String name;
			String type;
			int price;
			
		}
   Student x = new Student(); //decleration
  x.name = "rahul";
  x.rno = 76;
  x.percent = 92.5;

//	System.out.println(x.name);	
  Student s = new Student();
  s.name = "Kamal";
  s.percent = 99;
  s.rno = 7;
  
		
		
	Car c1 = new Car();
	c1.name = "Alto";
	c1.price = 4000000;
	c1.type ="hatchback";
	
		
		
		
		
		
		
	}

}

*/

/*
package JavaSkills;
import java.util.*;
public class KK_54_OOPs_One_Shot {
public static void fun(int x) {
		System.out.println(x);
		return;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x =6;
fun( x+5);

	}

}

*/
/*

package JavaSkills;
import java.util.*;
public class KK_54_OOPs_One_Shot {
	
	
	public static class Student{
		String name;
		int rno;
		double percent;
		
		
		
	}
public static void fun(Student x) {
		System.out.println(x.name);
		return;
	}
public static void change(int x) {
   x = 7;
	return;
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Student s = new Student();
		  s.name = "Kamal";
		  s.percent = 99;
		  s.rno = 7;
//		fun(s);
		
		//updation
		int x  =5;
		System.out.println(x);
		change(x);
		System.out.println(x);
		
		  
	}

}

*/
/*
package JavaSkills;
import java.util.*;
public class KK_54_OOPs_One_Shot {
	
	public static class Student{
		String name;
		int rno;
		double percent;
		
		
		
	}
	
	
	
public static void fun(Student x) {
		System.out.println(x.name);
		return;
	}
public static void change(Student s) {
s.name = "Rohan";
	return;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Student s = new Student();
		  s.name = "Kamal";
		  s.percent = 99;
		  s.rno = 7;
System.out.println(s.name);
change(s);
System.out.println(s.name);
	}

}
*/
/*
package JavaSkills;
import java.util.*;
public class KK_54_OOPs_One_Shot {
	
	
	
	
	
public static void fun(KK_54_Student x) {
		System.out.println(x.name);
		return;
	}
public static void change(KK_54_Student s) {
s.name = "Rohan";
	return;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KK_54_Student s = new KK_54_Student();
		  s.name = "Kamal";
		  s.percent = 99;
		  s.rno = 7;
System.out.println(s.name);
change(s);
System.out.println(s.name);
	}

}
*/
/*
package JavaSkills;
import java.util.*;
public class KK_54_OOPs_One_Shot {
	
	
	
	
	
public static void fun(KK_54_Student x) {
		System.out.println(x.name);
		return;
	}
public static void change(KK_54_Student s) {
s.name = "Rohan";
	return;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KK_54_Student s = new KK_54_Student();
		 
System.out.println(s.name);

System.out.println(s.rno);

System.out.println(s.percent);
	}

}
*/
/*
package JavaSkills;
import java.util.*;
public class KK_54_OOPs_One_Shot {
	
	
	
	
	
public static void fun(KK_54_Student x) {
		System.out.println(x.name);
		return;
	}
public static void change(KK_54_Student s) {
s.name = "Rohan";
	return;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KK_54_Student s = new KK_54_Student();
		  s.name = "Kamal";
		  s.percent = 99;
		  s.rno = 7;
//	  s.assest =  45; //privated 
		  
System.out.println(s.name);
//s.setAssest(0);
s.setAssest(89);
System.out.println(s.getAssest());




	}

}
*/
/*
package JavaSkills;
import java.util.*;
public class KK_54_OOPs_One_Shot {
	public static void change(KK_54_Student s) {
		s.name = "Rohan";
			return;
		}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		KK_54_Student.numberOfStudents = 100;
System.out.println(KK_54_Student.getNumberOfStudent());
		KK_54_Student  s = new KK_54_Student ("KAmal", 76, 92.1);
		System.out.println(s.name );
		System.out.println(s.rno);
		System.out.println(s.percent);
//		s.schoolname = "xyz";
		System.out.println(s.schoolname);
//		System.out.println(s.numberOfStudents);
		System.out.println(s.getNumberOfStudent());
		
		KK_54_Student  s2 = new KK_54_Student ("rAHUL", 76, 92.1);
		System.out.println(s2.name );
		System.out.println(s2.rno);
		System.out.println(s2.percent);
//		System.out.println(s2.numberOfStudents);
	}

}
*/
/*
//fraction
package JavaSkills;
import java.util.*;
public class KK_54_OOPs_One_Shot {
	public static Fraction add (Fraction f1, Fraction f2) {
		int numerator = f1.num*f2.den + f1.den*f2.num;
		int denominator = f1.den*f2.den;
		
		Fraction f3 = new Fraction(numerator,denominator);
		return f3;
		
	}
	
	public static Fraction multiply (Fraction f1, Fraction f2) {
		int numerator = f1.num*f2.num;
		int denominator = f1.den*f2.den;
		
		Fraction f3 = new Fraction(numerator,denominator);
		return f3;
		
	}
	
	public static int gcd(int num,int den){
		int min = Math.min(num ,den);
		for(int i=min;i>=1;i--) {
			if(num%i == 0 && den%i == 0) return i;
		}
		return min;
	}
	
	
public static class Fraction {
	int num;
	int den;
	
	public Fraction( int num, int den) {
		this.num = num;
		this.den = den;
	simplify()	;
	}
	public void simplify() {
//		if(num<den) {
//			if(den%num==0) {
//				den = den/num;
//				num = 1;
//
//			}
//		}
		
		int hcf = gcd(num,den);
		num /= hcf;
		den /= hcf;
		
		
	}

}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Fraction f1 = new Fraction(35,21);
System.out.println(f1.num +"/"+ f1.den);	
Fraction f2 = new Fraction(7,3);
System.out.println(f2.num +"/"+ f2.den);
//f1.num = 3;
//f1.den = 7;
//Fraction f3 =add(f1, f2);
Fraction f3 = multiply(f1, f2);
System.out.println(f3.num +"/"+ f3.den);


	//System.out.println(f1.num +"/"+ f1.den);	
//		f1.simplify();
//		System.out.println(f1.num +"/"+ f1.den);	
	}

}
*/



package JavaSkills;
import java.util.*;
public class KK_54_OOPs_One_Shot {
public static class Arraylist {
	int[] arr = new int[5];
	int idx = 0;
	int size = 0;
	public void add(int ele) {
		if(size == arr.length) {
			int [] brr = Arrays.copyOf(arr, arr.length*2);
			arr = new int[brr.length];
			arr = Arrays.copyOf(brr, brr.length);
			
		}
		arr[idx] = ele;
		idx++;
		size++;
	}
//public int size() {
//	return idx;
//}
	public void set(int idx , int val) {
		arr[idx] = val;
		
	}

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(1);
		arr.add(2);
		arr.add(9);
		arr.add(3);
		arr.add(2);
		arr.set(1,20);
		System.out.println(arr.size());
	System.out.println(arr);
		*/
		Arraylist arr = new Arraylist();
		arr.add(2);
		arr.add(1);
		System.out.println(arr.size);
		arr.set(0,10);
		
		
		
		
		
		
		
		
	}

}
























/*

package JavaSkills;
import java.util.*;
public class KK_54_OOPs_One_Shot {
public static void fun(int x) {
		System.out.println(x);
		return;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
*/