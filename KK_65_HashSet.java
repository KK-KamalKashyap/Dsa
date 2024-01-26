/*
package JavaSkills;

import java.util.HashSet;

public class KK_65_HashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet<String> st = new HashSet<>();
st.add("James");
st.add("Scott");
st.add("James");
System.out.println(st); //james , scot
System.out.println(st.contains("James"));
System.out.println(st.size());
st.remove("James");
System.out.println(st.contains("James"));
System.out.println(st.size());
System.out.println("Mark");
for(String s : st) {
	System.out.println(s);
}




	}

}

*/
/*
package JavaSkills;

import java.util.HashSet;

//longest cobsaueivt
public class KK_65_HashSet {
	public static int longestConsecutive(int [] nums) {
		int maxStreak = 0;
		HashSet<Integer> ss = new HashSet<>();
		for(int num : nums ) ss.add(num);
		for(int num : ss) {
			if(!ss.contains(num -1)) {
				int currNum = num;
				int currStreak =  1;
				while(ss.contains(currNum + 1)) {
					currStreak++;
					currNum++;
					
				}
				maxStreak = Math.max(maxStreak, currStreak);
			}
			}
			return maxStreak;
		}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
	System.out.println(longestConsecutive(null));	
		
		
	}

}
*/
package JavaSkills;

import java.util.HashSet;

public class KK_65_HashSet {
static int maxNumbersOnTable(int[] bag) {
	HashSet<Integer> table = new HashSet<>();
	
	int max = 0;
	for(int i = 0;i < bag.length;i++) {
		int num = bag[i];
		if(table.contains(num)) {
			table.remove(num);
			
		}else {
			table.add(num);
			max = Math.max(max, table.size());
			
			
			
		}
	}
	
	return max;
}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] nums = {2,1,1,3,2,3 };
System.out.println(maxNumbersOnTable(nums));
	}

}




/*
package JavaSkills;

public class KK_65_HashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
*/