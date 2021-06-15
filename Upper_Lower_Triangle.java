package assignment5;

import java.util.Scanner;

public class Upper_Lower_Triangle  {
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
		upper(input);
        System.out.println();
		lower(input);
	}
	public static void upper(int [] [] arr) {
		for (int i=0;i<arr.length;i++) {
			for (int j = 0;j<arr[i].length;j++) {
				if (j<i) {
					System.out.print("0 ");
				}
				else {
					System.out.print(arr[i][j]+" ");
				}
			}
			System.out.println();
		}
	}
	public static void lower(int [][] arr) {
		for (int i=0;i<arr.length;i++) {
			for (int j = 0;j<arr[i].length;j++) {
				if (j<=i) {
					System.out.print(arr[i][j] + " ");
				}
				else {
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
	}

}
