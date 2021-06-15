package assignment5;

import java.util.Scanner;

public class SpiralAntyclockwise {
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
		spiral(input);
	}

	public static void spiral(int[][] arr) {
		int minr=0;
		int minc=0;
		int maxr=arr.length-1;
		int maxc=arr[0].length-1;
		int count=0;
		while (count<arr.length*arr[0].length) {
			for (int i=minr;i<=maxr;i++) {
				System.out.print(arr[i][minc]+" ");
				count++;
			}
			minc++;
			for (int i=minc;i<=maxc;i++) {
				System.out.print(arr[maxr][i]+" ");
				count++;
			}
			maxr--;
			for (int i=maxr;i>=minr;i--) {
				System.out.print(arr[i][maxc]+" ");
				count++;
			}
			maxc--;
			for(int i=maxc;i>=minc;i--) {
				System.out.print(arr[minr][i]+" ");
				count++;
			}
			minr++;
		}

	}

}
