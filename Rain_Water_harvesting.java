package assignment5;

import java.util.Scanner;

public class Rain_Water_harvesting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// int times = sc.nextInt();
		// for (int j = 0; j < times; j++)

		int size = sc.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		rain(arr);

	}

	public static void rain(int[] arr) {
//		int right[] = new int[arr.length];
//		int left[] = new int[arr.length];
//		right[0] = arr[0];
//		left[arr.length - 1] = arr[arr.length - 1];
//		for (int i = 1; i < arr.length; i++) {
//			right[i] = Math.max(right[i - 1], arr[i]);
//		}
//		for (int j = arr.length - 2; j >= 0; j--) {
//			left[j] = Math.max(arr[j], left[j + 1]);
//		}
//		int sum = 0;
//		for (int i = 0; i < arr.length; i++) {
//			sum += (Math.min(right[i], left[i]) - arr[i]);
//		}
//		System.out.println(sum);
		int ansl[] = new int[arr.length];
		ansl[0] = arr[0];
//		int p=0;
		for (int i = 1; i < arr.length; i++) {
			ansl[i] = Math.max(arr[i], ansl[i - 1]);
		}
		int ansr[] = new int[arr.length];
		ansr[arr.length - 1] = arr[arr.length - 1];
		for (int j = arr.length - 2; j >= 0; j--) {
			ansr[j] = Math.max(arr[j], ansr[j + 1]);
		}
		int sum = 0;
		for (int k = 0; k < arr.length; k++) {
			sum += (Math.min(ansr[k], ansl[k]) - arr[k]);
		}
		System.out.println(sum);
	}

}
