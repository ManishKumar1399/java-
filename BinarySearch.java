package assignment5;

import java.util.Scanner;

public class BinarySearch {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int size = sc.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int num = sc.nextInt();
		System.out.println(binarySearch(arr, num));

	}

	static int binarySearch(int[] arr, int num) {

		int li = 0;
		int hi = arr.length - 1;
		while (li <= hi) {
			int mid = (li + hi) / 2;
			if (arr[mid] == num) {
				return mid;
			} else if (arr[mid] > num) {
				hi = mid - 1;
			} else {
				li = mid + 1;
			}
		}
		return -1;

	}

}
