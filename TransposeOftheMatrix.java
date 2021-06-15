package assignment5;

import java.util.Arrays;
import java.util.Scanner;

public class TransposeOftheMatrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = row;
		int[][] input = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				input[i][j] = sc.nextInt();
			}
		}
		transpose(input);
	}
	public static void transpose(int[][] arr) {
		int row=arr[0].length;
		int col=arr.length;
		int [][] ans=new int [row][col];
		for (int i=0;i<arr.length;i++) {
			for (int j=0;j<arr[i].length;j++) {
				ans[j][i]=arr[i][j];
			}
		}
		//System.out.println(Arrays.deepToString(ans));
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(ans[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("End");
	}

}
