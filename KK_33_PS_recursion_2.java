/*


package JavaSkills;

public class KK_33_PS_recursion_2 {
	
	static int sumOfDigit(int n) {
		/*
		//base case 
		if( n >=0 && n <= 9) {
			return n;
		}
		
		//recursive work 0- small ans
		int smallAns = sumOfDigit(n/10);
		
		//selfwork
		int  ans  = smallAns + n%10;
		return ans;
	}
//	/////
		
		if (n >= 0 && n <= 9) {
			return n;
		}
		return sumOfDigit(n/10) + n%10;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(sumOfDigit(12345));
		
		
	}

}

*/

/*

package JavaSkills;

public class KK_33_PS_recursion_2 {
	
	static int pow(int p, int q) { //p^q
		//base case
		if(q== 0) return 1;   
		
		//recursive work
		int smallAns = pow(p, q-1);  //p^q-1 * p = p^q
		return smallAns * p;
		
		
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println(pow(5, 4));
	}

}
*/
//ALTERNATE SOLUTION
package JavaSkills;

public class KK_33_PS_recursion_2 {
static int pow(int p, int q) {
	if(q == 0) return 1;
	
	
	int smallpow = pow(p, q/2);
	if(q % 2 == 0) {  //even
		return smallpow * smallpow;
		
	}else { //odd 
		return p * smallpow * smallpow;
	}
}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(pow(2,5));
	}

}



