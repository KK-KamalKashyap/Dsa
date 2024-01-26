package JavaSkills;

 class ArraysExamples{
	 
	 void searchInArray() {
		 //Linear Serach
		 int [] arr = {5,3,6,2,8,3,4};
		 int x = 3;
		 
		 int ans = -1;
		 for(int i=0;i< arr.length;i++) {
			if(arr[i] ==x ) {
				ans = i;{
					break;
				}
				
			}
		 }
		 if(ans == -1) {
			 System.out.println("Not Found");
		 }else {
		 System.out.println("Found " + x + " at index " + ans);
		 
		 } 
	 }
	 void maxofArray() {
		 int [] arr = {5,3,6,2,8,4}; //ans =8
		 int ans =0;
		 for(int i=0;i<arr.length;i++) {
			 if(arr[i]>ans) {
				 ans =arr[i];
				 
			 }
		 }
		 System.out.println("Max " + ans);
	 }
	 void sumofArray() {
		 int[] arr = {1,4,5,6,1};
		 int sum = 0;
		 
		 for(int i =0;i< arr.length;i++) {
			 sum = sum +arr[i];
		 }
		 System.out.println(sum);
		 
		 
		 
	 }
 }
public class KK_16_TryThisArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArraysExamples obj = new ArraysExamples();
obj.sumofArray();
obj.maxofArray();
obj.searchInArray();
	}

}
