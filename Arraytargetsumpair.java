package assignment5;

import java.util.Arrays;
import java.util.Scanner;

public class Arraytargetsumpair {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int [] arr=new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int i=sc.nextInt();
		//int end=sc.nextInt();
		sumofpair(arr,i);
		sc.close();
	}
	public static void sumofpair(int [] arr, int i) {
		
		int sum=0;
		for (int k=0;k<arr.length;k++) {
			for (int l=k;l<arr.length;l++) {
				if (arr[k]+arr[l]==i) {
					System.out.println(arr[k]+" and "+arr[l]);
				}
			}
		}
		
		
	}

}
