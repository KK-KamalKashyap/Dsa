package JavaSkills;
//max knights in N*N Board
public class KK_67_Interview_Backtracking {
	static int maxknight = -1;
	static int number  = 3;
	
	
public static boolean isSafe(char[][] board, int row, int col) {
	int n = board.length;
	int i ,j;
	i = row - 2;
	j = col+ 1;
	if( i>=0 && j<n &&   board [i][j] == 'K') return false;
	//2 up 1 left


	i = row - 2;
	j = col- 1;
	if( i>=0 && j>=0 &&     board [i][j] == 'K') return false;
	//2 doem 1 right
	i = row + 2;
	j = col+ 1;
	if( i<n && j<n &&    board [i][j] == 'K') return false;
	//2 down 1 left

	i = row + 2;
	j = col- 1;
	if( i<n && j>=0 &&     board [i][j] == 'K') return false;

	//2 right 1 up
	i = row - 1;
	j = col + 2;
	if( i >=0  && j<n &&    board [i][j] == 'K') return false;


	//2 right 1 down
	i = row + 1;
	j = col + 2;
	if( i<n && j<n &&     board [i][j] == 'K') return false;



	//2 left 1 up
	i = row - 1;
	j = col - 2;
	if( i >=0  && j>=0  &&    board [i][j] == 'K') return false;


	//2 left 1 down
	i = row + 1;
	j = col - 2;
	if( i<n && j>=0 &&     board [i][j] == 'K') return false;
	return true;
}
public static void nknight(char [][] board, int row, int col, int num) {
	int n = board.length;
	if(row == n) {
if(num == number) {
	 for(int i =0; i <n;i++) {
			for(int j =0;j < n;j++) {
			System.out.print(board[i][j]);
				
			}
			System.out.println();
		 }
	 System.out.println();
}
		maxknight = Math.max(maxknight, num);
		 return;
	}
	else if(isSafe(board, row, col)) {
		board[row][col] = 'K';
//		nknight(board, row, col+1, num+1);
	if(col != n-1)	nknight(board, row, col+1, num+1);
	else nknight(board, row +1,0, num+1);
	board[row][col] = '.';
		
		
	}
	
		if(col != n-1)	nknight(board, row, col+1, num);
		else nknight(board, row+1,0, num);
		
	
	
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int n = 3;
		char [][] board = new char[n][n];
		 for(int i =0; i <n;i++) {
			for(int j =0;j < n;j++) {
				board[i][j] = '.';
				
			}
		 }
		
		
		 nknight(board,0,0,0);
		System.out.println(maxknight);
		
		
		
		
		
		
		
		
		
	}

}

















/*
package JavaSkills;

public class KK_67_Interview_Backtracking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

*/