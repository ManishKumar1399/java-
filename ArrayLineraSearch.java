package assignment5;

import java.util.Scanner;

public class ArrayLineraSearch {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int [] arr=new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int num=sc.nextInt();
		System.out.println(array(arr,num));
	}
	
	public static int array(int [] arr,int num) {
		for (int i=0;i<arr.length;i++) {
			if (arr[i]==num) {
				return i;
			}
		}
		return -1;
	}

}
