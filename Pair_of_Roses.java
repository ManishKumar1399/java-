package assignment5;

import java.util.Arrays;
import java.util.Scanner;

public class Pair_of_Roses {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int times = sc.nextInt();
		for (int j = 0; j < times; j++) {
			int size = sc.nextInt();
			int[] arr = new int[size];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			int money = sc.nextInt();
			String str = sc.nextLine();
			roses(arr, money);
		}

	}

	public static void roses(int[] arr, int money) {
		Arrays.sort(arr);
		int[] ans = new int[2];
		int dif2 = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int dif = 0;
				dif = arr[j] - arr[i];
				if (arr[i] + arr[j] == money && dif < dif2) {
					ans[0] = arr[i];
					ans[1] = arr[j];
					dif2 = dif;
				}
			}
		}
		System.out.println("Deepak should buy roses whose prices are "+ans[0]+" ans "+ans[1]+'.');
	}

}
