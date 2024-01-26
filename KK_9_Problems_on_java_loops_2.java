package JavaSkills;

import java.util.Scanner;

public class KK_9_Problems_on_java_loops_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner (System.in);
		int r =s.nextInt();
		//int c = s.nextInt(); tringular pattern mai c input nhi lena hai
//PRINT PRINTING : TECTANGULAR
		/*
		for(int i =1;i<= r;i++) {
			for(int j=1;j<= c;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
	//RECTANGULAR PATTERN
		/*
		for(int i =1;i<= r;i++) {
			for(int j=1;j<= c;j++) {
				if(i ==1 || i ==r||j==1||j==c )
				System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		*/
		//TRIANGULAR PATTERN
		/*
		for(int i =1;i<= r;i++) {
			for(int j=1;j<= i;j++) {
				
				System.out.print("*");
				
			}
			System.out.println();
		}
		
		*/
		//TRY PRINTING THIS PATTERN
		/*
		for(int i =1;i<= r;i++) {
			for(int j=1;j<= (r+1-i);j++) {
				
				System.out.print("*");
				
			}
			System.out.println();
		}
		
		*/
		/*
		for(int i =r;i>= 1;i--) {
			for(int j=1;j<= i;j++) {
				
				System.out.print("*");
				
			}
			System.out.println();
		}
		*/
		
		//PYRAMID PATTERN
		/*
		for(int  i=1;i<= r ;i++) { //teaversing over rows
			//print r-i spaces
			for(int j =1;j <= r-i;j++) {
			System.out.print(" ");
			}
				//print 2*i-1
			for(int k = 1;k <= 2*i-1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		*/
		//NUMERICAL RECTANGULAR PATTERN
		/*
		for(int i=1;i<=r;i++) {
			for(int j=i;j <= r;j++) {
				System.out.print(j);
			}
			for( int k =1;k <= i-1;k++) {
				System.out.print(k);
			}
				System.out.println();
		}
		
		*/
		//TRY THIS PATTERN NUMBER
		/*
		int c =s.nextInt();
		for(int i=1;i<=r;i++) {
			for(int j=1;j <= c;j++) {
				System.out.print(j);
			}
			
				System.out.println();
		}
		*/
		///HALLOW SPACEW PATTERN NUMBER
		
		
		
		/*
		int c =s.nextInt();
		for(int i=1;i<=r;i++) {
			for(int j=1;j <= c;j++) {
				if(i ==1 || i ==r||j==1||j==c )
					System.out.print("j");
					else
						System.out.print(" ");
			}
			
				System.out.println();
		}
		*/
		//
		/*
		int c =s.nextInt();
		for(int i=1;i<=r;i++) {
			
			for(int j=1;j <= c;j++) {
			if((i+j)%2 ==0) {
				System.out.print(1);
			}else {
				System.out.print(2);
			}
			}
			
				System.out.println();
		}
		
		*/
		
		//NUMERICAL TRIANGULAR PATTERN
		
		/*
		for(int i=1;i <=r;i++) {
			for(int j=1;j <= i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		*/
			
		//TRy This
		/*
		for(int  i=1;i<= r ;i++) { //teaversing over rows
			//print r-i spaces
			for(int j =1;j <= r-i;j++) {
			System.out.print(" ");
			}
				//print 1 to i
			for(int k=1;k <= i;k++) {
				System.out.print(k);
			}
			
			//print i-1to 1
			for(int l =i-1;l>= 1;l--) {
				System.out.print(l);
			}
			System.out.println();
		}
		
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
