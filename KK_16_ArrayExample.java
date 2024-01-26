package JavaSkills;

class ArraysExample{
	void multiArrays() {
	//	int[][] arr_1 = new int[5][3];
		int [][] arr = {{56,43,6},{34,7,8},{12,56,8}};
//		int [][][] arr_3 = new int [5][3][2]; //5*3*2= 30
//		arr_3[0][0][0] =1;
		
//		for(int i=0;i<2;i++) {
//			for(int j=0;j<3;j++) {
		for(int i=0;i<arr.length;i++) {
			//arr[0]  and arr[1]
			for(int j=0;j<arr[i].length;j++) {
				System.out.println(arr[i][j]);
			}
		}
		
		
		// arr[0] = array, arr[0][2]
 		
//		System.out.println(arr[0][0]);  //56
//		System.out.println(arr[0][1]);  //43
//		System.out.println(arr[0][2]);  //6
//		
//		
//		System.out.println(arr[1][0]);  //34
//		System.out.println(arr[1][1]);  //7
//		System.out.println(arr[1][2]);  //8
//		
//		
//		System.out.println(arr[2][0]);  //12
//		System.out.println(arr[2][1]);  //56
//		System.out.println(arr[2][2]);  //8
	}
	
	void demoArrays() {
	int [] ages = new int[3]; // ages[0] , ages[1] , ages[2]
	float[] weights = new float[3];
	//String[] names = new String [3];
//	String[] names = {"rahul" , "raj", "aradhya"};
	String[] names = {"rahul" , "raj", "aradhya","vaishali"};
	
	System.out.println(ages.length);  //3
	System.out.println(weights.length);  //3
	System.out.println(names.length);  //4
	
	ages[0] =34;
	ages[1] = 12;
	ages[2] = 45;
	//ages[5] = 45;   //out of bounds
	//ages[-2] =3;   out of bounds
	
	
	
	
//	weights[0] = 23.8f;
//	weights[1] = 87.5f;
	
	
	
	System.out.println(ages[0]);
	System.out.println(ages[1]);
	System.out.println(ages[2]);
	
	System.out.println(names[0]);
	System.out.println(names[1]);
	System.out.println(names[2]);
	
	
	// for loop
//	for(int i=0;i<3;i++) {
	for(int i=0;i<ages.length;i++) {
		System.out.println(ages[i]);
	}
	
	//for each loop     
	for(int age : ages) {
		System.out.print(age);
	}
	
	//while loop
	int i=0;
//	while(i <3) {
	while(i <ages.length) {
		System.out.println(ages[i]);
		i++;
		
	}
	
	}
}
public class KK_16_ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArraysExample obj = new ArraysExample();
obj.demoArrays();
obj.multiArrays();

	}

}
