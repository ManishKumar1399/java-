package assignment5;

import java.util.Scanner;

public class RotateImage {
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
		Rotate(input);
	}

	public static void Rotate(int[][] arr) {
		int row = arr[0].length;
		int col = arr.length;
		int[][] ans = new int[row][col];
		for (int cm = arr[0].length-1; cm >=0 ; cm--) {
			for (int r=0;r<arr.length;r++) {
				System.out.print(arr[r][cm]+" ");
			}
			System.out.println();
		}
	}
}
