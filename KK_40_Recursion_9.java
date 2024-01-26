
/*package JavaSkills;

public class KK_40_Recursion_9 {

	static int best(int [] h, int n, int idx) {
		if(idx == n-1) return 0;
	
		
		int op1 =Math.abs(h[idx] - h[idx+1]) + best(h, n, idx+1);
		if(idx ==  n-2) return op1;
		int op2 =Math.abs(h[idx] - h[idx+2]) +  best(h, n, idx+2);
		return Math.min(op1,  op2);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] h = {10, 30, 40, 20};
		System.out.println(best(h, h.length, 0));
		
		
	}

}
*/
package JavaSkills;

public class KK_40_Recursion_9 {

	static int combination(String dig , String [] kp, String res){  // 253 = kp[2]
	if(dig.length() == 0) {
		System.out.print(res + " ");
         return 0 ;
	}
	int currNum = dig.charAt(0) - '0'; // - 2
	String currChoices = kp[currNum];
	for(int i =0; i< currChoices.length();i++) {
		combination(dig.substring(1), kp,res + currChoices.charAt(i) );
	}
	return currNum;
	
	
	
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String dig = "23";
		//kp[7] = "pqrs"
		String[] kp = {"", "", "abc" , "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
		
		combination(dig, kp, "");
	}

}
