package assignment5;

import java.util.Arrays;
import java.util.Scanner;

public class Max_circular_sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int times = sc.nextInt();
		for (int j = 0; j < times; j++) {
			int size = sc.nextInt();
			int[] arr = new int[size];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			System.out.println(Math.max(simple(arr), round(arr)));
//		int sim=simple(arr);
//		int ro=round(arr);
//		if (sim>ro) {
//			System.out.println(sim);
//		}else {
//			System.out.println(ro);
		}
	}

	public static int simple(int[] arr) {
		int a = kadanes(arr);
		return a;
	}

	public static int round(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		for (int j = 0; j < arr.length; j++) {
			arr[j] = -1 * arr[j];
		}
		int num = kadanes(arr);
		int ans = sum + num;
		return ans;
	}

	public static int kadanes(int[] arr) {
		int maxSum = Integer.MIN_VALUE;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];

			if (sum > maxSum) {
				maxSum = sum;
			}

			if (sum < 0) {
				sum = 0;
			}
		}

		return maxSum;
	}

}