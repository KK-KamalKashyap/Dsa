package JavaSkills;

public class KK_15_JM_Scope_of_Variables {
	
	static void changeValue(int a) {
		a *= 100;
		System.out.println("Inside change value " + a);
	}
	
	
public static void main(String[] args) {
	
	int a = 10;
	System.out.println("Before changing value " + a);
	changeValue(a);
	System.out.println("after changing value " + a);
	
}
}
