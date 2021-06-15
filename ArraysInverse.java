package assignment5;

import java.util.*;

public class ArraysInverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		inverse(arr);
	}

	public static void inverse(int[] arr) {
		int [] inverse=new int [arr.length];
		for (int i = 0; i < arr.length; i++) 
		{
			
			inverse[arr[i]]=i;
		}
		//System.out.println(Arrays.toString(inverse));
		for (int num:inverse) {
			System.out.print(num+" ");
		}
//		int sum=0;
		for (int i=0;i<arr.length;i++) {
			if (arr[i]!=inverse[i]) {
//				sum++;
			}
		}
//		if (sum==0) {
//			System.out.println(1);
//		}else 
//			System.out.println(-1);
	}

}
