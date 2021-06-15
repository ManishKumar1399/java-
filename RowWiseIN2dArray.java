package assignment5;

import java.util.Arrays;
import java.util.Scanner;

public class RowWiseIN2dArray {

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
//		for (int row1 = 0; row1 < input.length; row1++) {
//
//			if (row1 % 2 == 0) {
//				for (int col1 = 0; col1 < input[row1].length; col1++) {
//					System.out.print(input[row1][col1] + " ");
//					
//				}
//			} else {
//				for (int col1 = input[row1].length - 1; col1 >= 0; col1--) {
//					System.out.print(input[row1][col1] + " ");
//				
//				}
//			}
//
//			 System.out.println();
			swing(input);
		}
	

	public static void swing(int[][] arr) {
		for (int row = 0; row < arr.length; row++) {

			if (row % 2 == 0) {
				for (int col = 0; col < arr[row].length; col++) {
					System.out.print(arr[row][col] + " ");

				}
			} else {
				for (int col = arr[row].length - 1; col >= 0; col--) {
					System.out.print(arr[row][col] + " ");

				}
			}

			System.out.println();
		}
	}
}
