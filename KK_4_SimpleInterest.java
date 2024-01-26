package JavaSkills;

import java.util.Scanner;

public class KK_4_SimpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s =  new Scanner(System.in);
System.out.println("Enter principle");
float p = s.nextFloat();
System.out.println("Enter rate of Interest");
float r =s.nextFloat();
System.out.println("Enter time");
float t = s.nextFloat();

float si = (p*r*t)/100;
System.out.println("principle :" + p);
System.out.println("Rate :" + r);
System.out.println("Time :" + t);

System.out.println("Simple Interset " + si);
	}

}
