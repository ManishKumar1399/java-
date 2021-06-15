package assignment5;

import java.util.Scanner;

public class sort_Selection {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sort(arr);
		for (int val:arr) {
			System.out.println(val);
		}

	}

	public static int minimum(int[] arr, int si, int e) {
		int min = si;
		for (int i = si + 1; i <= e; i++) {
			if (arr[min]>arr[i]) {
				min=i;
			}
		}
		return min;
	}

	public static void sort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int min=minimum(arr, i, arr.length-1);
			swap(arr,i,min);
		}
	}
	
	public static void swap(int [] arr,int a,int b) {
		int t=arr[a];
		arr[a]=arr[b];
		arr[b]=t;
	}

}
