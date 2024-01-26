/*
package JavaSkills;

public class KK_52_Binary_Search_AnswerV {
static boolean isDivisionPossible(int[]a, int m, int mxChocAllowed) {
int nos = 1;
int choc =  0;
for(int i =0; i < a.length; i++) {
	if(a[i] > mxChocAllowed) return false;
	if(choc + a[i] <= mxChocAllowed) {
		choc += a[i];
	}else {
		nos++;
		choc = a[i];
		
	}
}
return nos <= m;
//if(nos > m) return false;
//return true;
}
	static int distributeChocolates(int[]a, int m) {
		if(a.length < m) return -1;
		int ans = 0, st = 1, end = (int)1e9;
		while(st <= end) {
			int mid = st + (end - st)/2;
			if(isDivisionPossible(a,m,mid)) {
				ans = mid;
				end = mid - 1;
			}else {
				st = mid + 1;
			}
		}
		return ans;
	}
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] a= {5,3,1,4,2};
		int m = 3;
		
		System.out.println(distributeChocolates(a,m));
		
		
		
		
		
		
		
	}

}


*/
//Race track
package JavaSkills;

public class KK_52_Binary_Search_AnswerV {
	static boolean isPossible(int[] a, int k, int dist) {
		int kidsPlaced = 1;
		int lastKid = a[0];
		
		for(int i=1;i < a.length; i++) {
			if(a[i] - lastKid >= dist) {
				kidsPlaced++;
				lastKid = a[i];
				
			}
		}
		return kidsPlaced >= k;
	}
	
	
static int raceTrack(int [] a, int k) {
if(k > a.length) return -1;
int st = 0, end = (int) 1e9;
int ans =  -1;
while(st <= end) {
int mid = st + (end - st)/2;
if(isPossible(a,k,mid)) { //can k kids be placed such that no 2 kids hav e distance lesser than mid
ans = mid;
st = mid+1;
	
}else {
	end = mid - 1;
	
}
}
return ans;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int []a = {1,2,4,8,9};
 int k =2;
 System.out.println(raceTrack(a,k));
	}

}


/*
package JavaSkills;

public class KK_52_Binary_Search_AnswerV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
*/