package assignment5;

import java.util.Scanner;

public class Calculate_Sum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size-1];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sum(arr);
//		int min=Math.min(10,20);
//		min=Math.min(min,5);
//		int max=Math.max(10,20);
//		max=Math.max(max,30);
//		System.out.println(max+" "+min);
		
	}
	
	public static void sum(int [] arr) {
		int max=Integer.MIN_VALUE;
		for (int si=0;si<arr.length;si++) {
			int sum=0;
			for (int en=si;en<arr.length;en++) {
				
				
					sum=sum+arr[en];
					//System.out.print(arr[k]+" ");
				if (max<sum) {
					max=sum;
				}
				
			}
			//System.out.println(sum);
		}
		System.out.println(max);
	}

}
