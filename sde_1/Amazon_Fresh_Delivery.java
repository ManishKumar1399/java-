package sde_1;

public class Amazon_Fresh_Delivery {
	public static void main(String[] args) {
		int dest_row=0,dest_col=0;
		int [] [] board= {{1,0,0},{1,0,0},{1,5,9}};
		for (int i=0;i<board.length;i++) {
			for (int j=0;j<board[i].length;j++) {
				if (board[i][j]==9) {
					dest_row=i;
					dest_col=j;
				}
			}
		}
		maze(board, new boolean[3][3], 0, 0, 0);
	}
	
	public static void maze(int [][] board, boolean [][] visited,int curr_row,int curr_col,int ans) {
		if (curr_col==-1||curr_row==-1||curr_col==board[0].length||curr_row==board.length||visited[curr_row][curr_col]||board[curr_row][curr_col]==0) {
			return;
		}if (board[curr_row][curr_col]==9) {
			System.out.println(ans);
			return;
		}
		visited[curr_row][curr_col] = true;
		maze(board, visited, curr_row - 1, curr_col, ans + board[curr_row][curr_col]);

		maze(board, visited, curr_row + 1, curr_col, ans + board[curr_row][curr_col]);

		maze(board, visited, curr_row, curr_col - 1, ans + board[curr_row][curr_col]);

		maze(board, visited, curr_row, curr_col + 1, ans + board[curr_row][curr_col]);
		visited[curr_row][curr_col] = false;
	}

}
