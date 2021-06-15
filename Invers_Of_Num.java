package assignment5;

import java.util.*;

public class Invers_Of_Num {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int size = count(num);
		System.out.println(size);
		int[] arr = arr(num, size);
		System.out.println(Arrays.toString(arr));
		inverse(arr);
	}

	public static int count(int num) {
		int count = 0;
		while (num > 0) {

			num = num / 10;
			count++;
		}
		return count;
	}

	public static int[] arr(int num, int size) {
		int arr[] = new int[size];
		int temp = num;
		for (int i = arr.length - 1; i >= 0; i--) {

			arr[i] = temp % 10;
			temp /= 10;

		}

		return arr;
	}

	public static void inverse(int[] arr) {
		int[] inverse = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {

			inverse[arr[i]] = i;
		}

		for (int num : inverse) {
			System.out.print(num + " ");
		}

	}

}
