package assignment5;

import java.util.Scanner;

public class DiagonalPrint {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		int[][] input = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				input[i][j] = sc.nextInt();
			}
		}
		int ans[] = Diagonal(input);
		for (int i = 0; i < ans.length; i++) {

			System.out.print(ans[i] + " ");

		}
	}

	public static int[] Diagonal(int[][] arr) {
		if (arr == null || arr.length == 0)
			return null;

		int m = arr.length;
		int n = arr[0].length;
		int[] res = new int[m * n];
		int r = 0;
		int c = 0;

		for (int i = 0; i < res.length; i++) {
			res[i] = arr[r][c];

			if ((r + c) % 2 == 0) { // when sum of indexes is even, it walks up & right
				if (c == n - 1)
					r++;
				else if (r == 0)
					c++;
				else {
					r--;
					c++;
				}
			} else { // walks down & left
				if (r == m - 1)
					c++;
				else if (c == 0)
					r++;
				else {
					c--;
					r++;
				}
			}
		}
		return res;
	}

}
