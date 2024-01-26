/*
package JavaSkills;

public class AS_11_oops {
int roll_no = 2;
String Name ="John";
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AS_11_oops obj = new AS_11_oops();
System.out.println(obj.roll_no);
System.out.println(obj.Name);
		
		
	}

}
*//*
package JavaSkills;

class Triangle{
	int a,b,c;
	public double getArea(){
	double s = (a+ b+c)/2.0;
	return Math.pow( (s*(s-a)*(s-b)*(s-c)), .5);
	
	}
	
	public double getPerimeter() {
		return (a+b+c)/2.0;
		
	}
	
}

public class AS_11_oops {


	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle obj = new Triangle();
         obj.a =2;
         obj.b =5;
         obj.c = 6;
         System.out.println(obj.getArea());
         System.out.println(obj.getPerimeter());
         
		
	}

}
*/
package JavaSkills;

import java.util.Scanner;

class Area{
	int length;
	int breadth;
	public  Area(int l, int b) {
		length = l;
		breadth = b;

	}
	public int getArea(){
		return length*breadth;
	}



}

public class AS_11_oops {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s = new Scanner(System.in);
int l,b;
l = s.nextInt();
b = s.nextInt();
Area obj = new Area(l,b);
System.out.println(obj.getArea());



	}

}

