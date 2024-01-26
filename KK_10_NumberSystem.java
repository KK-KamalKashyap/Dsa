package JavaSkills;

import java.util.Scanner;

public class KK_10_NumberSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//CONVERSION OF BINARY TO DECIMAL
		Scanner s = new Scanner(System.in);
		/*
		int binary_num = s.nextInt();
		
		int ans = 0; //converted decimal number
		int k =1; // 2 ^ 0 =1 power of 2
		
		while(binary_num>0) {
			int unit_digit = binary_num % 10;
			ans += (unit_digit *k);
			binary_num /= 10;
			k *= 2;
			
		}
		System.out.println(ans);
		*/
		int decimal_num = s.nextInt();
		
		int ans =0; //binary number
		int k =1; // powers of 10
		while(decimal_num > 0) {
			int parity = decimal_num %2;
			ans += (parity *k);
			k *= 10;
			decimal_num /= 2;
			
		}
		System.out.println(ans);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
