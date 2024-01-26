/*
package JavaSkills;

public class KK_47_CountSort {
	
	static int findMax(int [] arr) {
		int mx = Integer.MIN_VALUE;
		for(int i =0; i < arr.length;i++) {
			if(arr[i] > mx) {
				mx = arr[i];
				
			}
		}
		return mx;
	}
	
static void basicCountSort(int[] arr) { //2 4 2 2
	//find the largest element of the arr
	int max = findMax(arr);
	
	int[] count = new int[max+1];
	for(int i =0; i <arr.length;i++) {
		count[arr[i]]++;
	}
	
	int k =0;
	for(int i =0; i < count.length;i++) {
		for(int j =0; j < count[i]; j++) {
			arr[k++] = i;
		}
	}
	
	
}
static void dispaly(int[] a) {
	for(int val : a) {
		System.out.print(val + " ");
	}
	System.out.println();
}
	
	
	static void countSort(int [] arr) {
		int n = arr.length;
		int[] output = new int[n];
		
		int max = findMax(arr);
		
		int[] count = new int[max+1];
		
		
		for(int i =0; i <arr.length;i++) {
			count[arr[i]]++;
			
		}
			
			//make prefix sum array of count array
			for(int i =1;i < count.length;i++) {
				count[i] += count[i -1];
			}
			//find the index of each element in the original array and put it in output array
			for(int i = n-1; i >= 0; i--) {
				int idx =count[arr[i]] - 1;
				output[idx] = arr[i];
				count[arr[i]]--;
			}
			//copy all element of output to arr
			for(int i =0; i < n;i++) {
				arr[i] = output[i];
			}
			
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = {1,4,5,2,2,5};
		countSort(arr);
//		basicCountSort(arr);
		dispaly(arr);
		
		
	}

}*//*
///RADIX SORT
package JavaSkills;

public class KK_47_CountSort {
	
	static int findMax(int [] arr) {
		int mx = Integer.MIN_VALUE;
		for(int i =0; i < arr.length;i++) {
			if(arr[i] > mx) {
				mx = arr[i];
				
			}
		}
		return mx;
	}
	
	
	
	static void countSort(int [] arr, int place) {

		int n = arr.length;
		int[] output = new int[n];
		
//		int max = findMax(arr);
		
		int[] count = new int[10];
		
		
		for(int i =0; i <arr.length;i++) {// arr[i] =105 freq[5]++, place=10;
			count[(arr[i]/place)%10]++;
			
		}
			
			//make prefix sum array of count array
			for(int i =1;i < count.length;i++) {
				count[i] += count[i -1];
			}
			//find the index of each element in the original array and put it in output array
			for(int i = n-1; i >= 0; i--) {
				int idx =count[(arr[i]/place)%10] - 1;
				output[idx] = arr[i];
				count[(arr[i]/place)%10]--;
			}
			//copy all element of output to arr
			for(int i =0; i < n;i++) {
				arr[i] = output[i];
			}
			
		
		
		
	}
	
	static void radixSort(int[] arr) {
		int max = findMax(arr);
		//apply counting sort to sort elemets based on place value
		for(int place =1; max/place > 0; place *=10) {
			countSort (arr, place);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = {43,453,626,894,0,3};
//		countSort(arr);
//		basicCountSort(arr);
//		dispaly(arr);
		radixSort(arr);
		for(int val : arr) {
			System.out.print(val + " ");
		}
		System.out.println();
	}

}
*/
//BUCKET SORt
package JavaSkills;

import java.util.ArrayList;
import java.util.Collections;
public class KK_47_CountSort {
	
static void bucketSort(float[] arr) {
//Buckets 
	int n = arr.length;
	//Buckets
//	int[] a = new int[5];
	ArrayList<Float>[] buckets = new ArrayList[n];
	//create empty buckets
	for(int i=0; i <n;i++) {
		buckets[i] = new ArrayList<Float>();
		
	}
		//Add elemets into our buckets	
	
	for(int i=0;i<n;i++) {
		int bucketIndex = (int) arr[i] * n;
		buckets[bucketIndex].add(arr[i]);
		
	}
	
	//Sort each bucket indiviually
	for(int i = 0;i < buckets.length;i++) {
		Collections.sort(buckets[i]);
	}
	
	//merge all buckets to get final sortedd array
	int index =0;
	for(int i =0;i < buckets.length;i++) {
		ArrayList<Float> currBucket = buckets[i];
		for(int j =0; j < currBucket.size();j++) {
			arr[index++] = currBucket.get(j);
		}
	}
	
	
}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float[] arr = {0.5f, 0.4f, 0.3f, 0.2f, 0.1f};
		bucketSort(arr);
		for(float val: arr) {
			System.out.print(val + " ");
		}
	}

}