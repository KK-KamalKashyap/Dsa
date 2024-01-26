/*
package JavaSkills;

public class KK_44_Pro_On_Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//move zero
		int [] arr = {0, 1, 10, 5, 0,4};
		int n = arr.length;
		
		for(int i=0;i < n-1;i++) {
			for(int j=0; j < n-i-1;j++) {
				if(arr[j] == 0 && arr[j+1] != 0) {
					// swap arr[j 
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					
				}
			}
		}
		for(int val : arr) {
			System.out.print(val + " ");
		}
		
		
	}

}
*/


package JavaSkills;

public class KK_44_Pro_On_Sorting {

	static void sortFruit(String[] fruits) {
		int n = fruits.length;
		
		for(int i=0;i <n-1;i++) {
			int min_index=i;
			for(int j =i+1;j < n;j++) {
				if(fruits[j].compareTo(fruits[min_index]) < 0) {
					min_index =j;
				}
			}
			
			String temp =fruits[i];
			fruits[i] = fruits[min_index];
			fruits[min_index] = temp;
		}
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//lexicogical geaphic
		String[] fruits = {"kiwi", "apple", "papaya", "mango"};
		sortFruit(fruits);
		for(String val : fruits) {
			System.out.print(val + " ");
		}
	}

}
