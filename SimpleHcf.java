package assignment5;

import java.util.Arrays;
import java.util.Scanner;

public class SimpleHcf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int HCF = arr[0];
		int r = 1;
		int n1 = 0;
		int n2 = 0;
		for (int i = 1; i < size; i++) {
			n1 = arr[i];
			n2 = HCF;
			while (r > 0) {
				r = n1 % n2;
				if (r == 0) {
					HCF = n2;
				}
				n1 = n2;
				n2 = r;
			}
			r = 1;
		}
		System.out.print(HCF);
	}
}