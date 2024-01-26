package JavaSkills;
class Algebra1 {
//	int a =10;  // member Variables
//	int b=5;
	
	int add() {
		//return a+b;
		int p = 100;
		int q =20;
		return p+q;
		
	}
	int sub () {
	
		//return a-b;
		int p =67;
		int q =20;
		return p-q;
		
	}
	void demo() {
//		int a =5;
//		System.out.println(a);
//		System.out.println(b);
		for(int i=0;i<5;i++)
		{
			System.out.println(i);
//			int b =10;
//			System.out.println(b); //10
		}
	//	System.out.println(b);
		//if(true)
		for(int i=0;i<2;i++)
		{
			System.out.println(i);
//			int b=100;
//			System.out.println(b);//100
		}
	}
	
}
public class KK_15_JM_Scope_of_Variable {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Algebra1 obj  = new Algebra1();
obj.demo();
	}

}
