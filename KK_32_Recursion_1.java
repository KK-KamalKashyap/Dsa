
/*
package JavaSkills;

public class KK_32_Recursion_1 {

	static int factorial(int n) { //n=5
		//base case
		if(n==0) {
		return 1;
		}	
		// smaller problem-recursssive work
		
//		int smallAns = factorial(n-1); //factorial(4) = 24
		
		
		//big problem-self work
//		int ans = n * smallAns; //n * factorial(n-1
		
//		return ans;
		return n * factorial(n-1);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(factorial(4));
	}

}
*/
//nth Fibonacci number
package JavaSkills;

public class KK_32_Recursion_1 {

	static int fib(int n) { //n=5
		//base case
		/*
		if(n==0 ) {
		return n;
		}	
		if(n ==1) {
			return n;
		}
		*/
		
		
		
		if(n ==0 || n ==1) {
			return n;
		}
		/* 
		// smaller problem-recursssive work
		int prev = fib(n-1);
		int prevPrev = fib(n-2);
		//selfWork
		 return prev + prevPrev;
		*/
		
return fib(n-1) + fib(n-2);

		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i <= 10 ; i++) {
System.out.println(fib(i));
	}

	}
}



