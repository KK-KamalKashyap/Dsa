
/*
package JavaSkills;

import java.util.ArrayList;

public class KK_39_Recursion_8 {

	static ArrayList<String> getSSQ(String s){
		ArrayList<String> ans = new ArrayList<>();
		//smallAns =["bc','b', 'c', '']
		//base case
		
		if(s.length() ==0) {
			ans.add("");
			return ans;
		}
		char curr = s.charAt(0);
		ArrayList<String> smallAns = getSSQ(s.substring(1));
		
		for(String ss: smallAns) {
			ans.add(ss);
			ans.add(curr + ss);
		}
		return ans;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 //Return SSQ
		
		ArrayList<String> ans = getSSQ("abc");
		for(String ss : ans) {
			System.out.println(ss);
		}
	}

}
*/
/*

package JavaSkills;
//printSSQ
public class KK_39_Recursion_8 {

	static void printSSQ(String s, String currAns) {  //s == abc, currAns
		if(s.length() == 0) {
			System.out.println(currAns);
			return;
		}
		char curr = s.charAt(0); //a 
		String remString = s.substring(1); //bc
		//cur char = choose to be a part of currAns
		printSSQ(remString,currAns + curr);  //add curr
		
		
		//curr char = does not choose to be 
		printSSQ(remString,currAns); //do not add curr
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 //Return SSQ
		printSSQ("abc", "");
	}

}
*/
package JavaSkills;
//printSSQ
public class KK_39_Recursion_8 {

	static void subsetSum(int[] a,int n, int idx, int sum) {  
		if(idx >= n) {
			System.out.println(sum);
			return;
		}
		
	//curr idx + sum
		subsetSum(a, n, idx+1, sum +a[idx]);
		
		
		
		//curr ans 
		subsetSum(a,n,idx+1, sum);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a = {2, 4,5};
subsetSum(a, a.length, 0,0);
	}

}
