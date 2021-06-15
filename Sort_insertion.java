package assignment5;

import java.util.Scanner;

public class Sort_insertion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		is(arr);
		for (int val : arr) {
			System.out.println(val);
		}
	}

	public static void is(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int ele = arr[i];
			for (int j = i - 1; j >= 0; j--) {
				if (arr[j] > ele) {
					arr[j + 1] = arr[j];
				} else {
					arr[j + 1] = ele;
					break;
				}
			}
			if (arr[0] > ele) {
				arr[0] = ele;
			}
		}
	}

}
