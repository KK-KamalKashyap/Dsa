

/*
package JavaSkills;
//Maze Path
public class KK_66_BackTracking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int rows  = 2;
int cols = 2;
int count = maze(1,1,rows, cols);
System.out.println(count);
		
		
	}

	private static int maze(int sr, int sg, int er, int ec) {
		// TODO Auto-generated method stub
		if(sr> er || sg > ec) return 0;
		if(sr == er && sg == ec) return 1;
		int downWays = maze(sr+1 ,sg, er, ec);
		int rightWays = maze(sr ,sg +1, er, ec);
		int totalWays = downWays + rightWays;
		return totalWays;
	}

}

*/
/*
//print maze
package JavaSkills;

public class KK_66_BackTracking {

	public static void main(String[] args) {
		
		int rows  = 3;
		int cols = 3;
	print(1,1,rows, cols,"");

		// TODO Auto-generated method stub

		
	
	}
	private static void print(int sr, int sq, int er, int ec ,String s) {
		// TODO Auto-generated method stub
if(sr>er || sq >ec) return;
if(sr == er && sq == ec) {
System.out.println(s);
return;


}
/// go down
print(sr+1 ,sq, ec, er, s+"D");
//go right
print(sr ,sq+1, er, ec,s+"R");

	}
}
*/
/*
//four dir patha n\maze
package JavaSkills;

public class KK_66_BackTracking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows  = 3;
		int cols = 3;
		boolean[][] isVisited = new boolean [rows][cols] ;
			print(0,0,rows-1, cols-1,"",isVisited);
		}



		private static void print(int sr, int sq, int er, int ec ,String s,boolean[][] isVisited) {
			// TODO Auto-generated method stub
			if(sr<0 || sq < 0) return;
			if(sr>er || sq >ec) return;
			if(isVisited[sr][sq] == true) return; 
	
	if(sr == er && sq == ec) {
	System.out.println(s);
	return;


	}
	isVisited[sr][sq] = true;
	
	
	/// go down
	print(sr+1 ,sq, ec, er, s+"D",isVisited);
	//go right
	print(sr ,sq+1, er, ec,s+"R",isVisited);
	//go left
	print(sr, sq-1, er, ec, s+"L",isVisited);
	///go up
	print(sr-1, sq, er,ec,s+"U",isVisited);
	//backtracking
	isVisited[sr][sq] = false;

}

	}
*/

/*
//rate in a dead maze
package JavaSkills;


public class  KK_66_BackTracking{

	public static void main(String[] args) {
		int rows  = 4;
		int cols = 6;
		int[][] maze = {{1,0,1,1,1,1},
			        	{1,1,1,1,0,1},
			        	{0,1,1,1,1,1},
			        	{0,0,1,0,1,1}};
				print(0,0,rows-1, cols-1,"",maze);
}
	
	
	private static void print(int sr, int sq, int er, int ec ,String s,int[][] maze) {
		// TODO Auto-generated method stub
if(sr>er || sq>ec) return;
if(sr == er && sq == ec) {

System.out.println(s);
return;
}
if(maze[sr][sq] == 0) return;
/// go down
print(sr+1 ,sq, ec, er, s+"D",maze);
//go right
print(sr ,sq+1, er, ec,s+"R",maze);

	}
	
}

*/

/*
package JavaSkills;

public class KK_66_BackTracking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int rows  = 4;
		int cols = 6;
		int[][] maze = {{1,0,1,1,1,1},
				{1,1,1,1,0,1},
				{0,1,1,1,0,1},
				{0,0,1,0,1,1}};
//		boolean[][] isVisited = new boolean [rows][cols] ;
			print(0,0,rows-1, cols-1,"",maze);
		}



		private static void print(int sr, int sq, int er, int ec ,String s,int[][] maze) {
			if(sr<0 || sq < 0) return;
			if(sr>er || sq >ec) return;
			
	if(sr == er && sq == ec) {
	System.out.println(s);
	return;
	}
	if(maze[sr][sq]==0) return;
	if(maze[sr][sq]==-1) return;
//	if(isVisited[sr][sq] == true) return; 
maze[sr][sq] = -1;
	/// go down
	print(sr+1 ,sq, ec, er, s+"D",maze);
	//go right
	print(sr ,sq+1, er, ec,s+"R",maze);
	//go left
	print(sr, sq-1, er, ec, s+"L",maze);
	///go up
	print(sr-1, sq, er,ec,s+"U",maze);
	//backtracking
maze[sr][sq] = -1;
		
		
		
		
		
	}

}
*/


/*
package JavaSkills;

import java.util.ArrayList;
import java.util.List;

public class KK_66_BackTracking {

	public static void printp(String str,String t,	List<String> l) {
		if(str == "") {
//			System.out.println(t);
			l.add(t);
			return;
		}
		for(int i = 0; i <str.length();i++) {
			char ch = str.charAt(i);
			String left = str.substring(0, i);
					String right = str.substring(i+ 1);
					String rem = left + right;
					printp(rem, t+ ch,l);
					
		}
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "abcde";
		List<String> l = new ArrayList<>();
		printp(str,"",l);
		
		for(int i =0; i <l.size();i++) {
			System.out.println(l.get(i));
		}
		
		
	}

}

*/

//N Queen
package JavaSkills;

public class KK_66_BackTracking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int n = 4;
		char [][] board = new char[n][n];
		 for(int i =0; i <n;i++) {
			for(int j =0;j < n;j++) {
				board[i][j] = '.';
				
			}
		 }
		
		nqueen(board,0);
	}

	private static void nqueen(char[][] board, int row) {
		// TODO Auto-generated method stub
		int n = board.length;
		if(row == n) {
			 for(int i =0; i <n;i++) {
					for(int j =0;j < n;j++) {
					System.out.print(board[i][j]);
						
					}
					System.out.println();
				 }
			 System.out.println();
			 return;
		}
		
		for(int j = 0; j <n;j++) {
			if(isSafe(board,row,j)) {
				board[row][j] = 'q';
				nqueen(board,row+ 1);
				board[row][j] = '.'; //backtrascking
			}
			
			
		}
		return;
	}

	private static boolean isSafe(char[][] board, int row, int col) {
		// TODO Auto-generated method stub
int n = board.length;
//check row
		for(int j=0; j<n;j++) {
			if(board[row][j] == 'Q') return false;
		}
		//check col
				for(int i=0; i<n;i++) {
					if(board[i][col] == 'Q') return false;
				}
				
				//check north east
				int i = row;
				int j = col;
				while(i>= 0 && j<n) {
					if(board[i][j] == 'Q' ) return false;
					i--;
					j++;
					
				}
				//check south east
		 i = row;
			 j = col;
				while(i < n && j <n) {
					if(board[i][j] == 'Q' ) return false;
					i++;
					j++;
					
				}
				//check south wast
			 i = row;
			 j = col;
				while(i < n && j >=0) {
					if(board[i][j] == 'Q' ) return false;
					i++;
					j--;
					
				}
				//check north wast
				 i = row;
				 j = col;
					while(i >= 0 && j >= 0) {
						if(board[i][j] == 'Q' ) return false;
						i--;
						j--;
						
					}	
				
				return true;
	}

}

/*


package JavaSkills;

public class KK_66_BackTracking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
*/