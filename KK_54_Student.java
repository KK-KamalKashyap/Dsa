package JavaSkills;


public  class KK_54_Student{
	/*
	public String name;
	int rno;
	double percent;
	private int assest;
	*/
 String name;
int rno;
double percent;
 int assest;
final  String schoolname = "RVAS";
private static int numberOfStudents;
 //default constructor
 public KK_54_Student()
 {
	 
 }
	//Constructor
// public KK_54_Student(String naam, int roll, double per) {
//	 name = naam;
//	 rno = roll;
//	 percent = per;
// }
 public KK_54_Student(String name, int rno, double percent) {
	this.name = name;
	this.rno = rno;
	 this.percent = percent;
	 numberOfStudents++;
 }
	
	public int getAssest() {  //getter
		return assest;
	}
	
	
//	public void setAssest(int asset) { //setter
//		assest = asset;
//	}
	
	
	public void setAssest(int assest) { //setter
	this.assest = assest;
	}
	
	public static int getNumberOfStudent() {
		
		return numberOfStudents;
		
	}
}