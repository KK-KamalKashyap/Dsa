package JavaSkills;

public class KK_7_BREAK_KEYWORSD_AND_CONTINUE_KEYWORD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//PRINT THE FIRST MULTIPLE OF 5 WHICH IS ALSO A MULTIPLE OF 7.
//		int num =1;
//		while(true) {
//			if((num%5 == 0)&&( num %7==0)) {
//				System.out.println("FOUND ANS " +num);
//				break;
//			}
//			num++;
//		}
//PRINT ALL THE VALUES BETWEEN 1 AND 50 EXCEPT FOR THE MULTIPLE OF 3.
		
//		for(int num=1;num <= 50 ;num++) {
//			if(num%3 ==0) {
//				continue;
//			}
//			System.out.println(num);
//			
//		}
		
		//WHILE LOOP USE
//				int num=1;
//				while(num <= 50) {
//					if(num%3 == 0) {
//						num++;
//						continue;
//					}
//					System.out.println(num);
//					num++;
//				}
		//USING LABLES WITH CONTINUE AND BREAK KEYWORD
//		Example:
		outer:for(int i=0;i<10;i++) {
		inner:	for(int j=0;j<5;j++) {
				break outer;
			}
		}
//	myloop: 	for(int num=1;num <= 50 ;num++) {
//			if(num%3 ==0) {
//				continue myloop;
//			}
//			System.out.println(num);
//			
//		}
	}

}
