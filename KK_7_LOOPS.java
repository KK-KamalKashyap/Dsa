package JavaSkills;

import java.util.Scanner;

public class KK_7_LOOPS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //PRINT THE SUM OF THE FIRST N NATURAL NUMBERS < WHER N IS THE INPUT
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		//WHILE LOOP
	//int  num =1;
//		while(num<=n) {
//			System.out.println(num);
//			num++; //increment
//	
//	}
	//FOR LOOP
//for(intnum=1;num<= n;num++) {
//	System.out.println(num);
//}
	
		//DO WHILE LOOP
//		int num =1;
//		do {
//			System.out.println(num);
//			num++;
//		}while(num<=10);
		
		//PRINT THE SUM OF THE FIRST N NATURAL NUMBERS< WHER N IS THE INPUT.
		//WHILE LOOP
//		int num=1;
//		int sum =0;
//		while(num<=n) {
//			sum = sum+num;
//		num++;	
//		}
//		System.out.println(sum);
	//FOR LOOP
//	int sum =0;
//	for(int num =1;num<=n;num++) {
//		sum = sum +num;
//	
//	}
//	System.out.println(sum);
		
		//REVERSE ORDER IN FOR LOOP
//		for(int num =n;num>= 1;num-=2) { //NUM -=2,NUM=num-2;
//			System.out.println(num);
//		}
		
		//PRINT THE SUM OF THE STEAM OF INTEGERS IN THE OUTPUT.
		int sum =0;
		do {
			sum += n;
			n= s.nextInt();
		}while(n!=-1);
//		while(n!=-1) {
//			sum+=n;
//			n = s.nextInt();
//			
//		}
		System.out.println(sum);
		}

}
