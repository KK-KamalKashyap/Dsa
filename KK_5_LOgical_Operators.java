package JavaSkills;

public class KK_5_LOgical_Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int p = 15,q =10,r =5;
//&& operator
System.out.println((p>q)&&(q>r));//true
System.out.println((p>q)&&(q<r));//false

//|| operator
System.out.println((r<q)||(q>q));//true
System.out.println((p>q)&&(q>r));//true
System.out.println((p<q)&&(q<r));//false

// ! opreatot

System.out.println(!(p ==q));//true
System.out.println(!(p>q));//false



	}

}
