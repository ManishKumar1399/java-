package assignment5;

import java.util.*;

public class Arrayspairsumtriplet {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int target = sc.nextInt();
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			int j = i + 1;
			int k = arr.length - 1;
			int sum = target - arr[i];
			while (j < k) {
				if (sum > arr[k] + arr[j]) {
					j++;
				} else if (sum < arr[k] + arr[j]) {
					k--;
				} else {
					System.out.println(arr[i] + ", " + arr[j] + " and " + arr[k]);
					j++;
				}
			}
		}
	}

}
